package com.hot.board.notice;

import java.io.File;
import java.sql.SQLDataException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hot.board.BoardDTO;
import com.hot.board.BoardService;
import com.hot.board.file.BoardFileDAO;
import com.hot.board.file.BoardFileDTO;
import com.hot.file.FileDTO;
import com.hot.util.file.FileUploader;
import com.hot.util.page.BoardSearchInfo;
import com.hot.util.page.Pager;

@Service
@Transactional
public class NoticeService implements BoardService {

	@Inject
	private NoticeDAO noticeDAO;
	@Inject
	private BoardFileDAO boardFileDAO;
	@Inject
	private FileUploader fileUploader;

	public void homeNoticeList(Model model) throws Exception {
		List<NoticeDTO> noticeList = noticeDAO.homeNoticeList();
		for(int i = 0; i < noticeList.size(); i++) {
			model.addAttribute("notice" + i, noticeList.get(i));
		}
	}
	
	// 글 삭제
	@Override
	public int delete(HttpSession session, int b_num) throws Exception {

		int result = 1; // 작업 성공 여부

		// DB에서 파일 삭제
		List<BoardFileDTO> files = boardFileDAO.selectList(b_num); // 파일정보 가져오기
		if (files.size() > 0) { // 파일이 있다면
			result = boardFileDAO.delteFilesWithB_num(b_num); // DB에서 파일 정보 삭제
		}

		// DB에서 글 삭제
		if (result > 0) { // 파일이 없거나 파일 삭제 성공하였다면
			result = noticeDAO.delete(b_num); // 글 삭제
		} else { // 실패 하였다면
			throw new SQLDataException(); // Exception 던져 Transaction
		}

		// 서버에서 파일 삭제
		if (result > 0) { // 글 삭제에 성공하였다면
			String path = session.getServletContext().getRealPath("resources/upload/files/notice"); // 파일 경로
			for (BoardFileDTO boardFileDTO : files) { // 모든 파일을
				boolean check = new File(path, boardFileDTO.getFname()).delete(); // 서버에서 삭제s
				if (check) {
					result = 1;
				} else {
					result = 0;
					throw new SQLDataException(); // Exception 던져 Transaction
				}
			}
		}

		return result;
	}

	// 파일 fname으로 파일 삭제하기
	public int fileDeleteWithFname(HttpSession session, String fname) throws Exception {
		
		int result = boardFileDAO.deleteFileWithFname(fname); // DB에서 파일 삭제 및 작업결과 받기
		boolean check = false; // 서버에서 파일 삭제 성공 여부
		
		if (result > 0) { // DB에서 파일 삭제 성공하였다면 
			String path = session.getServletContext().getRealPath("resources/upload/files/notice"); // 서버에서의 파일 경로
			check = new File(path, fname).delete(); // 서버에서 파일 삭제
		}
		
		if(!check) { // 서버에서 파일 삭제 실패하였다면
			result = 0;
			throw new SQLDataException();
		}
		return result;
	}

	// 글 수정
	@Override
	public String update(HttpSession session, RedirectAttributes redirectAttributes, List<MultipartFile> files,
			BoardDTO boardDTO) throws Exception {
		
		String message = "글 수정에 실패 하였습니다."; // 수정 실패시 alert 메시지
		String redirectPath = "redirect:./noticeUpdate?b_num=" + boardDTO.getB_num(); // 수정 실패시 redirect 할 경로
		int result = noticeDAO.update(boardDTO); // 글 수정
		if (result > 0) { // 글 수정 성공하였다면
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setB_num(boardDTO.getB_num()); // 파일 기본 정보
			String path = session.getServletContext().getRealPath("resources/upload/files/notice"); // 파일 경로
			result = this.filesUpload(files, boardFileDTO, path); // 파일 업로드
		}
		
		if(result > 0) {
			message = "글 수정에 성공 하였습니다."; // 수정 성공시 alert 메시지
			redirectPath = "redirect:./noticeView?b_num=" + boardDTO.getB_num();  // 수정 성공시 redirect 할 경로
		} else {
			throw new SQLDataException(); // Exception 던져 Transaction
		}
		
		redirectAttributes.addFlashAttribute("message", message);
		return redirectPath;
	}

	// 글 정보 가져오기
	@Override
	public ModelAndView selectOne(int b_num) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		NoticeDTO noticeDTO = (NoticeDTO) noticeDAO.selectOne(b_num);
		if(noticeDTO != null) {
			noticeDAO.hitUpdate(b_num);
			modelAndView.addObject("board", noticeDTO); // 글 가져오기
			modelAndView.addObject("fileCnt", boardFileDAO.fileCnt(b_num));
			modelAndView.addObject("files", boardFileDAO.selectList(b_num)); // 파일 가져오기
		} else {
			throw new Exception();
		}
		return modelAndView;
	}

	// 글 리스트
	@Override
	public ModelAndView selectList(BoardSearchInfo boardSearchInfo, Pager pager) throws Exception {
		System.out.println("NoticeService - selectList - GET");

		// 페이징 처리
		int totalRow = noticeDAO.getCount(boardSearchInfo); // 글의 총 갯수
		
		pager.setTotalRow(totalRow); // 페이저에 글의 총 갯수 세트 
		pager.paging(); // 페이징 처리

		// 글 리스트 가져오기
		List<BoardDTO> boardDTOs = noticeDAO.selectList(boardSearchInfo, pager);
		
		// ModelAndView에 데이터 저장
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("noticeList", boardDTOs);
		modelAndView.addObject("searchInfo", boardSearchInfo);
		modelAndView.addObject("pager", pager);
		modelAndView.setViewName("notice/noticeList");

		return modelAndView;

	}

	// 글 쓰기
	@Override
	public String insert(HttpSession session, RedirectAttributes redirectAttributes,
			BoardDTO boardDTO, List<MultipartFile> files) throws Exception {

		String message = "글 쓰기에 실패하였습니다."; // 결과 메시지
		String redirectPath = "redirect:./noticeWrite"; // redirect 할 주소

		int result = noticeDAO.insert(boardDTO); // notice를 DB에 insert 및 insert 결과 받기
		if (result > 0) { // 글을 DB에 insert 성공하였다면

			// 파일 업로드
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setB_num(boardDTO.getB_num());
			String path = session.getServletContext().getRealPath("resources/upload/files/notice");
			result = this.filesUpload(files, boardFileDTO, path); 

			if (result > 0) { // 파일 업로드에 성공 하였다면
				message = "글 쓰기에 성공 하였습니다.";
				redirectPath = "redirect:./noticeView?b_num=" + boardDTO.getB_num();
			}
		}

		redirectAttributes.addFlashAttribute("message", message);

		return redirectPath;
	}

	
	// ---------------- 서브 메서드 ----------------
	// 첨부 파일 한개 업로드
	public int fileUpload(MultipartFile file, BoardFileDTO boardFileDTO, String path) throws Exception {
		
		FileDTO fileDTO = fileUploader.upload(file, path); // 파일업로드 및 fname과 oname을 가져오기
		boardFileDTO.setOname(fileDTO.getOname()); // DTO에 fname 대입
		boardFileDTO.setFname(fileDTO.getFname()); // DTO에 oname 대입
		return boardFileDAO.insert(boardFileDTO); // DTO의 데이터를 DB에 저장
		
	}
	
	// 게임 파일 여러개 추가
	public int filesUpload(List<MultipartFile> files, BoardFileDTO boardFileDTO, String path) throws Exception {
		int result = 1;
		for (MultipartFile file : files) {
			if(file.getOriginalFilename()!="") { // 파일이 비어있지 않다면
				result *= this.fileUpload(file, boardFileDTO, path); // 파일 한개 업로드 메서드 호출
			}
		}
		return result;
	}

}

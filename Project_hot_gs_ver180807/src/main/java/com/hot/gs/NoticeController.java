package com.hot.gs;

import java.io.File;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hot.board.notice.NoticeDTO;
import com.hot.board.notice.NoticeService;
import com.hot.util.page.BoardSearchInfo;
import com.hot.util.page.Pager;

@Controller
@RequestMapping(value = "/notice/")
public class NoticeController {

	@Inject
	private NoticeService noticeService;

	// 글 삭제
	@RequestMapping(value = "noticeDelete", method = RequestMethod.POST)
	@ResponseBody
	public int delete(HttpSession session, int b_num) throws Exception {
		return noticeService.delete(session, b_num);
	}

	// 글 수정 - GET
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.GET)
	public ModelAndView update(int b_num) throws Exception {
		System.out.println("NoticeController - noticeUpdate - GET");
		ModelAndView modelAndView = noticeService.selectOne(b_num);
		modelAndView.setViewName("notice/noticeUpdate");
		return modelAndView;
	}

	// 글 수정 - POST
	@RequestMapping(value = "noticeUpdate", method = RequestMethod.POST)
	public String update(HttpSession session, RedirectAttributes redirectAttributes, List<MultipartFile> files,
			NoticeDTO noticeDTO) throws Exception {
		System.out.println("NoticeController - noticeUpdate - POST");
		return noticeService.update(session, redirectAttributes, files, noticeDTO);
	}

	// 글 수정 - 첨부파일 삭제
	@RequestMapping(value = "fileDeleteWithFname", method = RequestMethod.POST)
	@ResponseBody
	public int fileDeleteWithFname(HttpSession session, String fname) throws Exception {
		return noticeService.fileDeleteWithFname(session, fname);
	}

	// 첨부파일 다운로드
	@RequestMapping(value = "fileDownload") // servlet-context 의 beans:bean id 랑 일치
	public ModelAndView fileDownload(HttpSession session, String fname, String oname) throws Exception {
		String path = session.getServletContext().getRealPath("resources/upload/files/notice");
		File file = new File(path, fname);
		ModelAndView modelAndView = new ModelAndView("fileDownload", "file", file);
		modelAndView.addObject("oname", oname);
		return modelAndView;
	}

	// 글 보기
	@RequestMapping(value = "noticeView", method = RequestMethod.GET)
	public ModelAndView selectOne(int b_num) throws Exception {
		System.out.println("NoticeController - selectOne - GET");
		ModelAndView modelAndView = noticeService.selectOne(b_num);
		modelAndView.setViewName("notice/noticeView");
		return modelAndView;

	}

	// 글 리스트
	@RequestMapping(value = "noticeList", method = RequestMethod.GET)
	public ModelAndView selectList(BoardSearchInfo boardSearchInfo, Pager pager) throws Exception {
		System.out.println("NoticeController - selctList - GET");
		return noticeService.selectList(boardSearchInfo, pager);

	}

	// 글 쓰기 - GET
	@RequestMapping(value = "noticeWrite", method = RequestMethod.GET)
	public void insert() throws Exception {
	}

	// 글 쓰기 - POST
	@RequestMapping(value = "noticeWrite", method = RequestMethod.POST)
	public String insert(HttpSession session, RedirectAttributes redirectAttributes,
			NoticeDTO noticeDTO, List<MultipartFile> files) throws Exception {
		return noticeService.insert(session, redirectAttributes, noticeDTO, files);

	}

}

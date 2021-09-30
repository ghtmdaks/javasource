package com.hot.member;


import java.io.File;
import java.sql.SQLDataException;

import javax.inject.Inject;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hot.file.FileDTO;
import com.hot.member.file.MemberFileDAO;
import com.hot.member.file.MemberFileDTO;
import com.hot.util.file.FileUploader;


@Service
@Transactional
public class MemberService {
	
	
	@Inject
	private MemberDAO memberDAO;
	@Inject
	private MemberFileDAO memberFileDAO;
	@Inject
	private FileUploader fileUploader;
	
	public String imgUpdate(HttpSession session, RedirectAttributes ra, MultipartFile file, MemberFileDTO orgMemberFileDTO) throws Exception {

		// 기존 이미지 가져오기
		orgMemberFileDTO = memberFileDAO.selimg(orgMemberFileDTO.getEmail());
		String path = session.getServletContext().getRealPath("resources/upload/images/member");
		
		// 새로운 이미지 업로드
		MemberFileDTO newMemberFileDTO = new MemberFileDTO();
		FileDTO fileDTO = fileUploader.upload(file, path);
		newMemberFileDTO.setEmail(orgMemberFileDTO.getEmail());
		newMemberFileDTO.setOname(fileDTO.getOname());
		newMemberFileDTO.setFname(fileDTO.getFname());
		
		// DB의 이미지 정보 업데이트
		int result =memberFileDAO.imgUpdate(newMemberFileDTO);
		
		String message = "프로필 변경 실패";
		
		if(result > 0) { // 성공시
			message = "프로필 변경 성공";
			if(!orgMemberFileDTO.getFname().equals("default.jpg")) {
				new File(path, orgMemberFileDTO.getFname()).delete();
			}
			MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
			memberDTO.setFname(newMemberFileDTO.getFname());
			session.setAttribute("member", memberDTO);
			
		} else { // 실패시
			new File(path, newMemberFileDTO.getFname()).delete(); // 새로운 이미지 삭제
		}
		
		ra.addFlashAttribute("message", message);
		return "redirect:./memberMyPage";
	}
	

	public int insert(HttpSession session, MultipartFile files, MemberFileDTO memberFileDTO) throws Exception {
		
		String path = session.getServletContext().getRealPath("resources/upload/images/member");
		int result = 1;
		
		if(files.getOriginalFilename()!="") {
			FileDTO fileDTO = fileUploader.upload(files, path);
			memberFileDTO.setOname(fileDTO.getOname());
			memberFileDTO.setFname(fileDTO.getFname());
			result = memberFileDAO.insert(memberFileDTO);
		}
		
		return result;
		
	}

	
	public int nickchk(String nickname) throws Exception {
		System.out.println(nickname);
		int result = memberDAO.nickchk(nickname);
		return result;
	}
	
	
	
	public int chk(String email) throws Exception {
		System.out.println(email);
		int result = memberDAO.chk(email.toLowerCase());
		return result;
	}

	
	public int memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		System.out.println("Login Service");
		memberDTO.setEmail(memberDTO.getEmail().toLowerCase());
		memberDTO = memberDAO.memberLogin(memberDTO);
		int result = 0;
		if (memberDTO != null) {
			session.setAttribute("member", memberDTO);
			result = 1;
		}
		return result;
	}
	
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		System.out.println("memberJoin Service");
		memberDTO.setEmail(memberDTO.getEmail().toLowerCase());
		memberDTO.setKind("normal");
		int result = memberDAO.memberJoin(memberDTO);
		if(result > 0) {
			MemberFileDTO memberFileDTO = new MemberFileDTO();
			memberFileDTO.setEmail(memberDTO.getEmail());
			memberFileDTO.setFname("default.jpg");
			memberFileDTO.setOname("dafault.jpg");
			result *= memberFileDAO.insert(memberFileDTO);
			if (result < 1) {
				throw new SQLDataException();
			}
		}
		return result;
	}
	
	public int nicknameUpdate(MemberDTO memberDTO, RedirectAttributes ra, HttpSession session) throws Exception {
		System.out.println("nicknameUpdate Service");
		int result = memberDAO.memberUpdate(memberDTO);
		if(result == 1) {
			MemberDTO orgMemberDTO = (MemberDTO) session.getAttribute("member");
			orgMemberDTO.setNickname(memberDTO.getNickname());
			session.setAttribute("member", orgMemberDTO);
			System.out.println("왔구나!");
		} 
		return result;
	}
	
	public int memberDelete(MemberDTO memberDTO, HttpSession session) throws Exception {
		
		// 주문 삭제
		
		// 프로필 사진 삭제
		
		// 리뷰 삭제
			
		System.out.println("memberDelete Service");
		int result = memberDAO.memberDelete(memberDTO);
		if (result > 0) {
			session.invalidate();
		}
		return result;
	}

	public int pwUpdate(HttpSession session,RedirectAttributes redirectAttributes, String opw, String npw) {
		// session에서 멤버정보 가져오기
		int result = 0;
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
		
		String message = "비밀번호 수정에 실패하였습니다.";

		// 원래 비밀번호와 유저가 입력한 원래 비밀번호 비교
		if (!memberDTO.getPw().equals(opw)) {
			message = "기존 비밀번호를 잘 못 입력하셨습니다.";
		} else if (opw.equals(npw)) {
			message = "새로운 비밀번호가 기존 비밀번호랑 같습니다.";
		} else {
			memberDTO.setPw(npw);
			result = memberDAO.memberPwUpdate(memberDTO);
			if (result > 0) {
				message = "비밀번호가 수정 되였습니다.";
			} else {
				memberDTO.setPw(opw);
			}
			session.setAttribute("member", memberDTO);
		}
		redirectAttributes.addFlashAttribute("message",message);
		return result;
	}
	
	// ---------------- 서브 메서드 ----------------
	
	// 파일 한개 업로드, DB에 저장
	public int fileUpload(MultipartFile file, MemberFileDTO memberFileDTO, String path) throws Exception {
		int result = 1;
		if(file.getOriginalFilename() != "") {
			FileDTO fileDTO = fileUploader.upload(file, path); // 파일업로드 및 fname과 oname을 가져오기
			memberFileDTO.setOname(fileDTO.getOname()); // DTO에 fname 대입
			memberFileDTO.setFname(fileDTO.getFname()); // DTO에 oname 대입
			result =  memberFileDAO.insert(memberFileDTO); // DTO의 데이터를 DB에 저장
		}
		return result;
	}

}

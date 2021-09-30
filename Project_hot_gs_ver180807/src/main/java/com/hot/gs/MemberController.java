package com.hot.gs;

import javax.inject.Inject;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hot.member.MemberDTO;
import com.hot.member.MemberService;
import com.hot.member.file.MemberFileDTO;
import com.hot.orders.OrdersDTO;
import com.hot.orders.OrdersService;


@Controller
public class MemberController {
	
	@Inject
	private MemberService memberService;
	
	@Inject
	private OrdersService ordersService;
	
	@RequestMapping(value = "/member/myCart")
	public ModelAndView myCartList(HttpSession session, OrdersDTO ordersDTO) throws Exception {
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
		ordersDTO.setEmail(memberDTO.getEmail());
		return ordersService.myCartList(ordersDTO);
	}

	@RequestMapping(value = "/member/myGame", method=RequestMethod.GET)
	public ModelAndView myGameList(HttpSession session, OrdersDTO ordersDTO) throws Exception {
		MemberDTO memberDTO = (MemberDTO) session.getAttribute("member");
		ordersDTO.setEmail(memberDTO.getEmail());
		return ordersService.myGameList(ordersDTO);
	}
	
	@RequestMapping(value = "/member/imgUpdate", method=RequestMethod.POST)
	public String imgUpdate(HttpSession session, RedirectAttributes ra, MultipartFile file, MemberFileDTO memberFileDTO) throws Exception{
		System.out.println("email : " + memberFileDTO.getEmail());
		System.out.println("fname : " + memberFileDTO.getFname());
		System.out.println("oname : " + memberFileDTO.getOname());
		System.out.println("mf_num : " + memberFileDTO.getMf_num());
		System.out.println("fules : " + file.getName());
		System.out.println("files : " + file);
		
		memberService.imgUpdate(session, ra, file, memberFileDTO);
		
		return "redirect:./memberMyPage";
	}
	

	
	@RequestMapping(value = "/member/profile", method=RequestMethod.GET)
	@ResponseBody
	public void insert() throws Exception {System.out.println("profile.get");};
	
	@RequestMapping(value = "/member/profile", method=RequestMethod.POST)
	public ModelAndView insert(HttpSession session, MultipartFile files, MemberFileDTO memberFileDTO, ModelAndView mv) throws Exception {
		
		int result = memberService.insert(session, files, memberFileDTO);
		
		if(result > 0) {
			mv.addObject("message", "성공");
			mv.addObject("path", "memberMyPage");
			mv.setViewName("result/result");
		} else {
			mv.addObject("message", "실패");
			mv.addObject("path", "memberMyPage");
			mv.setViewName("result/result");
		}
		
		return mv;
	}

	
	@RequestMapping(value = "/member/nickchk", method=RequestMethod.POST)
	@ResponseBody
	public int nickchk(String nickname) throws Exception {
		System.out.println("오냐?" + nickname);
	
		return memberService.nickchk(nickname);
	}
	

	@RequestMapping(value = "/member/chk", method=RequestMethod.POST)
	@ResponseBody
	public int chk(String email) throws Exception {
		System.out.println("오냐?" + email);
	
		int result = memberService.chk(email);
		
		return result;
	}
	
	
	
	

	// 회원 탈퇴 페이지 이동
	@RequestMapping(value = "/member/memberDelete")
	public void memberDelete() throws Exception {}

	// 회원 탈퇴 
	@RequestMapping(value = "/member/memberDelete", method=RequestMethod.POST)
	@ResponseBody
	public int memberDelete(MemberDTO memberDTO, HttpSession session) throws Exception {
		return memberService.memberDelete(memberDTO, session);
	}

	// 회원 로그인 페이지 이동
	@RequestMapping(value = "/member/memberLogin")
	public void memberLogin() throws Exception {System.out.println("Login Get");}
	
	// 회원 로그인
	@RequestMapping(value = "/member/memberLogin", method=RequestMethod.POST)
	@ResponseBody
	public int memberLogin(MemberDTO memberDTO, HttpSession session) throws Exception {
		System.out.println("memberLogin Controller Post");
		return memberService.memberLogin(memberDTO, session);
	}
	
	// 회원 가입 페이지 이동
	@RequestMapping(value = "/member/memberJoin")
	public void memberJoin() throws Exception {System.out.println("Join Get");}
	
	// 회원 가입
	@RequestMapping(value = "/member/memberJoin", method=RequestMethod.POST)
	@ResponseBody
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		return memberService.memberJoin(memberDTO);
	}
	
	@RequestMapping(value = "/member/pwUpdate", method = RequestMethod.GET)
	public void pwUpdate() throws Exception {}
	
	
	@RequestMapping(value = "/member/pwUpdate", method = RequestMethod.POST)
	@ResponseBody
	public int pwUpdate(HttpSession session,RedirectAttributes redirectAttributes, String opw, String npw) {
		return memberService.pwUpdate(session, redirectAttributes, opw, npw);
	}

	// 정보 수정 페이지 이동
	@RequestMapping(value = "/member/memberUpdate", method = RequestMethod.GET)
	public void memberUpdate() throws Exception {}
	
	// 닉네임 수정
	@RequestMapping(value = "/member/nicknameUpdate", method=RequestMethod.POST)
	@ResponseBody
	public int nicknameUpdate(MemberDTO memberDTO, RedirectAttributes ra, HttpSession session) throws Exception {
		return memberService.nicknameUpdate(memberDTO, ra, session);
	}
	
	// 로그아웃
	@RequestMapping(value = "/member/memberLogout")	
	public String memberLogout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/";
	}
	
	// 마이 페이지 이동
	@RequestMapping(value = "/member/memberMyPage", method = RequestMethod.GET)
	public void memberMyPage(HttpSession session) throws Exception{}
	
		
}

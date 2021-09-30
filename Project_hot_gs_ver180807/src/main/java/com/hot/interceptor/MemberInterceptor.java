package com.hot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hot.member.MemberDTO;

public class MemberInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		boolean flag = true;
		MemberDTO memberDTO = (MemberDTO) request.getSession().getAttribute("member");

		String servletPath = request.getServletPath();
		if (servletPath.equals("/member/memberMyPage")) {
			if (memberDTO == null) {
				response.sendRedirect(request.getContextPath() + "/");
				flag = false;
			}
		} else if (servletPath.equals("/member/myCart") || servletPath.equals("/member/myGame")) {
			if(memberDTO == null || memberDTO.getKind().equals("admin")) {
				response.sendRedirect(request.getContextPath() + "/");
				flag = false;
			}
		}

		return flag;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}

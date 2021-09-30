package com.hot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hot.member.MemberDTO;

public class NoticeInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		boolean flag = true;

		String servletPath = request.getServletPath();
		if (servletPath.equals("/notice/noticeWrite") || servletPath.equals("/notice/noticeUpdate")
				|| servletPath.equals("/notice/noticeDelete") || servletPath.equals("/notice/fileDeleteWithFname")) {
			MemberDTO memberDTO = (MemberDTO) request.getSession().getAttribute("member");
			if (memberDTO == null || !memberDTO.getKind().equals("admin")) {
				response.sendRedirect(request.getContextPath() + "/noticeList");
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

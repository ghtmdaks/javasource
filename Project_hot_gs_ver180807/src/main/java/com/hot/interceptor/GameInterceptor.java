package com.hot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hot.member.MemberDTO;

public class GameInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		boolean flag = true;

		String servletPath = request.getServletPath();
		MemberDTO memberDTO = (MemberDTO) request.getSession().getAttribute("member");

		// 게임 관리 Interceptor
		if (servletPath.equals("/game/gameInsert") || servletPath.equals("/game/gameInfoUpdate")
				|| servletPath.equals("/game/gameImgUpdate") || servletPath.equals("/game/gameDelete")
				|| servletPath.equals("/game/gameSale") || servletPath.equals("/game/gameCancelSale")
				|| servletPath.equals("/game/gameRecommend") || servletPath.equals("/game/gameCancelRecommend")
				|| servletPath.equals("/game/mainImgUpdate") || servletPath.equals("/game/subImgDeleteWithFname")
				|| servletPath.equals("/game/imgsUpload")) {
			if (memberDTO == null || !memberDTO.getKind().equals("admin")) {
				response.sendRedirect(request.getContextPath() + "/game/gameList");
				flag = false;
			}
		} else if (servletPath.equals("/game/reviewWrite") || servletPath.equals("/game/reviewReply")) {
			String g_num = request.getParameter("g_num");
			if (memberDTO == null) {
				response.sendRedirect(request.getContextPath() + "/game/gameView?g_num=" + g_num);
				flag = false;
			}
		} else if (servletPath.equals("/game/reviewUpdate") || servletPath.equals("/game/reviewDelete")) {
			String g_num = request.getParameter("g_num");
			String email = request.getParameter("email");
			if (!memberDTO.getEmail().equals(email)) {
				response.sendRedirect(request.getContextPath() + "/game/gameView?g_num=" + g_num);
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

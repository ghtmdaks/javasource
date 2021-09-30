package com.hot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class OrdersInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		boolean flag = true;

		String servletPath = request.getServletPath();
		if (servletPath.equals("/orders/ordersInsert") || servletPath.equals("/orders/ordersDelete")
				|| servletPath.equals("/orders/deleteFromCart") || servletPath.equals("/orders/ordersPayment")) {
			Object memberDTO = request.getSession().getAttribute("member");
			if (memberDTO == null) {
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

package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends  HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String handlerStr=handler.toString();
		System.out.println(handler);
		if(!handlerStr.contains("LoginController")){
			HttpSession session=	request.getSession();
			if(session.getAttribute("uid")==null){				
				response.sendRedirect("invalidUser");
				return false;
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		response.setHeader("Cache-Control", "no-cache");
        response.addHeader("Cache-Control", "no-store");  
        response.addHeader("Cache-Control", "must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
		super.postHandle(request, response, handler, modelAndView);
	}

	
	
	
	

}

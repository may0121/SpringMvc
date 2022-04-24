package com.bjpowernode.controller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author may
 * @date 2022/4/19 14:24
 */
//可以实现接口也可以继承类 ，但是优先实现接口
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        验证是否登录
        if (request.getSession().getAttribute("users")==null){
            //在登录页面上打印信息
            request.getSession().setAttribute("msg","你还没有登录，请先登录！");
            //请求转发
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
            return false;//false 是不放行打回原来的位置
        }
     return true;//放行
    }
}

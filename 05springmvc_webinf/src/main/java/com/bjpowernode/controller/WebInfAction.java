package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author may
 * @date 2022/4/19 10:27
 */
@Controller
public class WebInfAction {
    @RequestMapping("/showIndex")
    public String showIndex(){
        System.out.println("访问index页面");
        return "index";
    }

    @RequestMapping("/main")
    public String main(){
        System.out.println("访问main页面");
        return "main";
    }

    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("访问showLogin页面");
        return "login";
    }

    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request){
        if ("may".equalsIgnoreCase(name)&&"1234".equalsIgnoreCase(pwd)){
            //将用户信息存到session作用域当中
            request.getSession().setAttribute("users",name);
          return "main" ;
        }else {
            request.setAttribute("msg","登录失败!用户名或密码不正确");
            return "login";
        }

    }
}

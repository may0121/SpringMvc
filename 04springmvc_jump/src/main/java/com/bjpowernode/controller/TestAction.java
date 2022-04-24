package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author may
 * @date 2022/4/17 21:47
 */
@Controller
public class TestAction {
    @RequestMapping("/one")
    public String one(){
        System.out.println("请求转发页面。。。");
        return "main";
    }

    @RequestMapping("/two")
    public String two(){
        System.out.println("请求转发action。。。");
        return "forward:/other.action";
    }

    @RequestMapping("/three")
    public String three(){
        System.out.println("重定向跳转页面。。。");
        return "redirect:/admin/main.jsp";
    }
    @RequestMapping("/four")
    public String four(){
        System.out.println("重定向跳转action。。。");
        return "redirect:/other.action";
    }

}

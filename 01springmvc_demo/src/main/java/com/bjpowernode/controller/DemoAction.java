package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author may
 * @date 2022/4/16 18:33
 */
@Controller
@RequestMapping("/test01")
public class DemoAction {

@RequestMapping("/demo")
    public String demo(){
        System.out.println("test01的服务器访问到了。。。。");
        return "main";
    }
}

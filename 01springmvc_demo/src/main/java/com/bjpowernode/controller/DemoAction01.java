package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author may
 * @date 2022/4/16 18:33
 */
@Controller
@RequestMapping("/test02")
public class DemoAction01 {

@RequestMapping("/demo")
    public String demo(){
        System.out.println("test02的服务器访问到了。。。。");
        return "main";
    }
}

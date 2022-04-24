package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author may
 * @date 2022/4/17 21:48
 */
@Controller
public class OtherAction {
    @RequestMapping("/other")
    public String other(){
        System.out.println("这是other。。。。");
        return "main";
    }
}

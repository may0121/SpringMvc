package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author may
 * @date 2022/4/17 13:28
 */
@Controller
public class Test {
    @RequestMapping(value = "/req",method = RequestMethod.GET)
    public String req(){

        System.out.println("get请求提交了。。。");
        return "main";
    }


    @RequestMapping(value = "/req",method = RequestMethod.POST)
    public String req1(){

        System.out.println("post请求提交了。。。");
        return "main";
    }
}

package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author may
 * @date 2022/4/17 13:59
 */
@Controller
public class DataTest {

    @RequestMapping("/one")
    public String one(String myname,int age){
        System.out.println("myname："+myname+"," +
                "age："+age);
        return "main";
    }

    //    对象封装数据方式
    @RequestMapping("/two")
        public String two(Users u){
    //        这里直接存入对象，姓名和年龄属性值会自动存在对象里面
        System.out.println("users="+u);
        return "main";
    }

    //动态站位符提交
    @RequestMapping("/three/{name}/{age}")
    public String three(
            @PathVariable String name,
            @PathVariable int age){
        System.out.println("name="+name+",age="+age);
        return "main";
    }
    //请求参数名称映射
    @RequestMapping("/four")
    public String four(
            @RequestParam("name")
            String uname,
            @RequestParam("age")
            int uage){
        System.out.println("name="+uname+",age="+uage);
        return "main";
    }
    //手动接收数据
    @RequestMapping("/five")
    public String five(HttpServletRequest request){
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name="+name+",age="+age);
        return "main";
    }
}

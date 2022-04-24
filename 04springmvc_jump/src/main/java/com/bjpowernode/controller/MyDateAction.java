package com.bjpowernode.controller;



import com.bjpowernode.controller.entity.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 */
@Controller
public class MyDateAction {

//    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
////    /**
////     * 日期:<input type="date" name="mydate"><br>
////     *
////     */
//    @RequestMapping("/mydate")
//    public String mydate(
//            @DateTimeFormat(pattern = "yyyy-MM-dd")
//            Date mydate){
//        System.out.println(mydate);
//      System.out.println(sf.format(mydate));
//      return "show";
//  }

    //类中全局日期处理
    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    //    /**
//     * 日期:<input type="date" name="mydate"><br>
//     *
//     */

    //注册一个全局日期处理注解
    @InitBinder
    public void InitBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sf,true));
    }
    @RequestMapping("/mydate")
    public String mydate(Date mydate, HttpServletRequest request) {
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
//        显示单个日期,实际上日期的类型是一个字符串而不是日期类型
        request.setAttribute("mydate",sf.format(mydate));
        return "show";

    }
    @RequestMapping("/list")
    public String list(HttpServletRequest request) throws ParseException {
        Student stu1 = new Student("张三",sf.parse("2000-01-01"));
        Student stu2 = new Student("李四",sf.parse("2001-01-01"));
        Student stu3 = new Student("王五",sf.parse("2002-01-01"));
        List<Student>list =new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        request.setAttribute("list",list);
        return "show";
    }

}

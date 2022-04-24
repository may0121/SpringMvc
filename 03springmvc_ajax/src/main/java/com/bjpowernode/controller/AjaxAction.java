package com.bjpowernode.controller;

import com.bjpowernode.controller.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author may
 * @date 2022/4/17 20:10
 */
@Controller
public class AjaxAction {
    //处理ajax请求,一定要加@ResponseBody
    @ResponseBody
    @RequestMapping("/ajax")
    public List<Student> ajax(){
        Student stu1 = new Student("张三",22);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",23);
        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //调用json转换工具ObjectMapper进行转换
        return list;  //===>springmvc负责转换成json
    }
}

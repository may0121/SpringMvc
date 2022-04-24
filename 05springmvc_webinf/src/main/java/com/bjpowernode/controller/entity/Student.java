package com.bjpowernode.controller.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author may
 * @date 2022/4/18 16:49
 */
public class Student {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Student() {
    }
}

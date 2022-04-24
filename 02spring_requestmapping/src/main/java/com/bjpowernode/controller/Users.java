package com.bjpowernode.controller;

/**
 * @author may
 * @date 2022/4/17 14:24
 */
public class Users {
    private String name;
    private int  age ;


    public Users() {
    }
    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

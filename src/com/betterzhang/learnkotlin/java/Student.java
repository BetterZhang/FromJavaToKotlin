package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 10:02
 * Desc   : description
 */
public final class Student extends People {

    private String school = null;

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("Hello Student");
    }

}

package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 10:00
 * Desc   : description
 */
public class People {

    private String name = null;

    public People(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello Java");
    }

    public final void sayGood() {
        System.out.println("Good");
    }

}

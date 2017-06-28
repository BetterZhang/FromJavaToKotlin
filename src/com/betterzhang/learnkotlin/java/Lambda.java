package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 1:23
 * Desc   : 匿名函数 ( Lambda 表达式 )
 */
public class Lambda {

    public static void main(String[] args) {

        new Thread(() -> System.out.println("Hello Java")).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Java");
            }
        }).start();
    }

}

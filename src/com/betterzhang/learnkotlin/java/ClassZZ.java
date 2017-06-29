package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/29 下午 4:57
 * Desc   : 获得class的实例
 */
public class ClassZZ {

    public static void main(String[] args) {
        Class<?> clazz = ClassZZ.class;
        System.out.println(clazz);

        ClassZZ c = new ClassZZ();
        Class<?> clazz2 = c.getClass();
        System.out.println(clazz2);
    }

}

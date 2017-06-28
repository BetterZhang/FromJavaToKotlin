package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 10:42
 * Desc   : 静态与非静态内部类
 */
public final class Outer {

    private int bar = 100;

    public static class Nested {
        public final String foo() {
            return "Hello Java";
        }
    }

    public final class Inner {
        public final int foo() {
            return bar;     // 可以访问外部类成员
        }
    }

    public static void main(String[] args) {
        System.out.println(new Outer.Nested().foo());
        System.out.println(new Nested().foo());
//        System.out.println(new Outer().Inner().foo());    // 不能在其他类中实例化非静态内部类
    }

}

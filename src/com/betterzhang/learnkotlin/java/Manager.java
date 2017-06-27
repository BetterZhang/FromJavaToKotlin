package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/27 下午 5:09
 * Desc   : description
 */
public class Manager {

    private Manager() {

    }

    public static Manager getInstance() {
        return new Manager();
    }

}

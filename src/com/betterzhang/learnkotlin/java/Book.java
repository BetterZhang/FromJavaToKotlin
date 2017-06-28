package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 9:54
 * Desc   : description
 */
public class Book implements Readable {

    @Override
    public String getContent() {
        return "Hello Java";
    }

}

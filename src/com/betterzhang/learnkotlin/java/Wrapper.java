package com.betterzhang.learnkotlin.java;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 下午 1:12
 * Desc   : 泛型
 */
public final class Wrapper<T> {

    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        Wrapper<String> wrapper = new Wrapper<>("Hello Java");
        System.out.println(wrapper.getItem());
    }

}

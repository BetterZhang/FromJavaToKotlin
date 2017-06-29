package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/28 上午 11:01
 * Desc   : 匿名内部类
 */

class View {

    interface OnClickListener {
        fun onClick()
    }

    var listener: OnClickListener? = null

    fun setOnClickListener(listener: OnClickListener) {
        this.listener = listener
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val view = View()
            view.setOnClickListener(object: OnClickListener {
                override fun onClick() {
                    TODO("not implemented")
                }
            })
        }
    }

}
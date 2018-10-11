package com.yyc.baselib.utils

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import com.orhanobut.logger.FormatStrategy
import com.yyc.baselib.BuildConfig


/**
 * Author: Austin
 * Date: 2018/10/8
 * Description: 日志工具类
 */

class L {

    companion object {
        fun initLogger() {
//        Logger.addLogAdapter(AndroidLogAdapter())
            /*val formatStrategy = PrettyFormatStrategy.newBuilder()
                    .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                    .methodCount(0)         // (Optional) How many method line to show. Default 2
                    .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
//                .logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
                    .tag("wc")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                    .build()

            Logger.addLogAdapter(AndroidLogAdapter(formatStrategy))*/
            Logger.addLogAdapter(object : AndroidLogAdapter() {
                override fun isLoggable(priority: Int, tag: String?): Boolean {
                    return BuildConfig.DEBUG
                }

            })
        }

        fun d(str: String) {
                Logger.d(str)
        }

        fun i(str: String) {
                Logger.i(str)
        }

        fun e(str: String) {
                Logger.e(str)
        }

        fun v(str: String) {
                Logger.e(str)
        }

        fun w(str: String) {
                Logger.e(str)
        }
    }


}
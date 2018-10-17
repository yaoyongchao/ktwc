package com.yyc.baselib

import android.app.Application
import android.content.Context
import com.yyc.baselib.injector.BaseApplication
import com.yyc.baselib.utils.L

/**
 * Author: Austin
 * Date: 2018/10/8
 * Description:
 */
class BaseNormalApplication: Application(){
    private var mContext: Context? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        mContext = applicationContext
        L.initLogger()
    }

    companion object {
//        val INSTANCE: BaseApplication by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED) {
//            BaseApplication()
//        }
        private var instance: BaseNormalApplication? = null
//        private var mContext: Context? = null
        fun instance() = instance!!
//        fun appContext() = mContext!!


    }
    fun getAppContext(): Context? {
        return mContext
    }



}
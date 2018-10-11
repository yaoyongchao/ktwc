package com.yyc.baselib

import android.app.Application
import android.content.Context
import com.yyc.baselib.http.RetrofitHelper
import com.yyc.baselib.utils.L

/**
 * Author: Austin
 * Date: 2018/10/8
 * Description:
 */
class BaseApplication: Application(){
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
        private var instance: BaseApplication? = null
//        private var mContext: Context? = null
        fun instance() = instance!!
//        fun appContext() = mContext!!


    }
    fun getAppContext(): Context? {
        return mContext
    }



}
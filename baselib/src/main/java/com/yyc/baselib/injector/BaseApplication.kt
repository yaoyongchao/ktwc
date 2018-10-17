package com.yyc.baselib.injector

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.util.Log
import com.yyc.baselib.injector.component.AppComponent
import com.yyc.baselib.injector.component.ApplicationComponent
import com.yyc.baselib.injector.component.DaggerAppComponent
import com.yyc.baselib.injector.component.DaggerApplicationComponent
import com.yyc.baselib.injector.module.AppModule
import com.yyc.baselib.injector.module.ApplicationModule
import com.yyc.baselib.injector.module.MyAppModule
import com.yyc.baselib.utils.L
import javax.inject.Inject

/**
 * Author: Austin
 * Date: 2018/10/16
 * Description: ｋｔ dagger2　基类
 */

class BaseApplication: Application() {
//    val component: AppComponent by lazy {
//        DaggerAppComponent.builder()
//                .appModule(AppModule(this))
//                .build()
//
//    }
    /*@Inject
    public lateinit var appContext: Context
    @Inject
    public lateinit var instance: BaseApplication
*/

//    var component: ApplicationComponent? = null
//        private set


    lateinit var mApplicationComponent: ApplicationComponent


    companion object {
        /*private var instance: Application ?= null
        fun instance() = instance!!
//        fun componentaa() = component*/

        lateinit var appContext: Context
//        lateinit var instance: BaseApplication
    }

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
        initViews()
    }

    private fun initAppInjection() {
        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()

        appContext=mApplicationComponent.context()
//        instance = mApplicationComponent.instance()
    }

    private fun initViews() {
        L.initLogger()
    }



}
package com.yyc.baselib.injector

import android.app.Application

import com.yyc.baselib.injector.component.AppComponent
import com.yyc.baselib.injector.component.ApplicationComponent
import com.yyc.baselib.injector.component.DaggerApplicationComponent

import com.yyc.baselib.injector.module.MyAppModule

class MvpApplication : Application() {
    public var component: ApplicationComponent? = null
        private set

    override fun onCreate() {
        super.onCreate()
        //        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        //        component = DaggerApplicationComponent.builder()
//        component = DaggerApplicationComponent.builder().myAppModule(MyAppModule(this)).build()
    }
}

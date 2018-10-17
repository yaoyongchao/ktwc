package com.yyc.baselib.injector.component

import android.content.Context
import com.yyc.baselib.injector.BaseApplication
import com.yyc.baselib.injector.MvpApplication
import com.yyc.baselib.injector.module.AppModule
import com.yyc.baselib.injector.module.ApplicationModule
import com.yyc.baselib.injector.module.MyAppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
//    fun inject(baseApplication: MvpApplication)

    fun context(): Context
    fun instance(): BaseApplication
}

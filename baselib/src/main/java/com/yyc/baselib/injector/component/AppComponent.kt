package com.yyc.baselib.injector.component

import com.yyc.baselib.injector.BaseApplication
import com.yyc.baselib.injector.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(baseApplication: BaseApplication)
}

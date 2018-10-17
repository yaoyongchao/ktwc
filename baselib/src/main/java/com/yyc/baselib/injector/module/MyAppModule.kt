package com.yyc.baselib.injector.module

import android.content.Context
import com.yyc.baselib.injector.BaseApplication
import com.yyc.baselib.injector.MvpApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MyAppModule(private val baseApplication: MvpApplication) {
    @Singleton
    @Provides
    fun provideAppContext(): Context = baseApplication.applicationContext

    @Singleton
    @Provides
    fun provideBaseApplicationContext(): MvpApplication = baseApplication

}
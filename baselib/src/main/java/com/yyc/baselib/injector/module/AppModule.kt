package com.yyc.baselib.injector.module

import android.content.Context
import com.yyc.baselib.injector.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val baseApplication: BaseApplication) {
    @Singleton
    @Provides
    fun provideAppContext(): Context = baseApplication.applicationContext

    @Singleton
    @Provides
    fun provideBaseApplicationContext(): BaseApplication = baseApplication

}
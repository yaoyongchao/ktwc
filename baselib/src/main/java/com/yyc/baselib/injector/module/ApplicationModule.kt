package com.yyc.baselib.injector.module

import android.content.Context
import com.yyc.baselib.injector.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/*
        Application级别Module
     */
@Module
class ApplicationModule(private val mainApplication: BaseApplication) {
    @Singleton
    @Provides
    fun provideContext(): Context {
        return this.mainApplication.applicationContext
    }

    @Singleton
    @Provides
    fun provideMainApplication(): BaseApplication {
        return this.mainApplication
    }

}
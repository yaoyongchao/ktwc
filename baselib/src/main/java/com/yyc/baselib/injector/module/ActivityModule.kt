package com.yyc.baselib.injector.module

import android.app.Activity
import com.yyc.mylib.inject.scope.ActivityScope
import dagger.Module
import dagger.Provides


@Module
class ActivityModule(private val activity: Activity) {
    @ActivityScope
    @Provides
    fun provoideActivity(): Activity  {
        return this.activity
    }
}
package com.yyc.baselib.injector.module

import android.app.Activity
import com.yyc.baselib.mvp.BaseModel
import com.yyc.mylib.inject.scope.ActivityScope
import dagger.Module
import dagger.Provides


@Module
class BasePresenterModule(private val model: BaseModel) {
    @Provides
    fun provoideModel(): BaseModel  {
        return this.model
    }
}
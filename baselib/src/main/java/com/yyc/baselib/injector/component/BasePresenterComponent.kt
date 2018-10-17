package com.yyc.baselib.injector.component

import android.app.Activity
import android.content.Context
import com.yyc.baselib.injector.module.ActivityModule
import com.yyc.baselib.injector.module.BasePresenterModule
import com.yyc.baselib.mvp.BaseModel
import com.yyc.mylib.inject.scope.ActivityScope
import dagger.Component

//@Component(modules = arrayOf(ActivityModule::class))
@ActivityScope
@Component(modules = arrayOf(BasePresenterModule::class))
interface BasePresenterComponent {
//    fun model(): BaseModel
}
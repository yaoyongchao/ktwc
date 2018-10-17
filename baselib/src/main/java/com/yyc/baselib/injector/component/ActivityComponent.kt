package com.yyc.baselib.injector.component

import android.app.Activity
import android.content.Context
import com.yyc.baselib.injector.module.ActivityModule
import com.yyc.mylib.inject.scope.ActivityScope
import dagger.Component

//@Component(modules = arrayOf(ActivityModule::class))
@ActivityScope
@Component(dependencies = arrayOf(ApplicationComponent::class),modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun activity(): Activity
    fun context(): Context
}
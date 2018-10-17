package com.yyc.customer.one

import com.yyc.baselib.injector.component.MvpActivityComponent
import com.yyc.customer.ForeActivity
import dagger.Component

@Component()
interface ForeComponent{
    fun inject(foreActivity: ForeActivity)
}

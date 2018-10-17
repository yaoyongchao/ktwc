package com.yyc.baselib.base

import android.os.Bundle
import com.yyc.baselib.injector.component.DaggerMvpActivityComponent
import com.yyc.baselib.mvp.BasePresenter
import com.yyc.baselib.mvp.BaseView
import com.yyc.baselib.utils.L
import javax.inject.Inject

abstract class MvpActivity<P : BasePresenter<*,*> >: BaseActivity(){
    @JvmField
    @Inject
    var mPresenter: P? =null//可空类型

    override fun onCreate(savedInstanceState: Bundle?) {
//        mPresenter = CreatUtilOne.getT(this,0)
        super.onCreate(savedInstanceState)
//        mPresenter?.attachView(this)
    }

    open override fun initView() {
    }

    override fun onDestroy() {
        super.onDestroy()
//        mPresenter?.dettachView()
    }
}
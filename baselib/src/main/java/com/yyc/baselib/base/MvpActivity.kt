package com.yyc.baselib.base

import android.os.Bundle
import com.yyc.baselib.injector.component.DaggerMvpActivityComponent
import com.yyc.baselib.mvp.BasePresenter
import com.yyc.baselib.mvp.BaseView
import com.yyc.baselib.utils.L
import javax.inject.Inject

abstract class MvpActivity</*V : BaseView, */  P : BasePresenter<*> /*Comparable<BasePresenter<*>>*/ >: BaseActivity(){
    @JvmField
    @Inject
    var mPresenter: P? =null//可空类型

    override fun onCreate(savedInstanceState: Bundle?) {
//        mPresenter = CreatUtilOne.getT(this,0)
        super.onCreate(savedInstanceState)
//        DaggerMvpActivityComponent.builder().build().inject(this)
//        L.e("P: $mPresenter" )
    }

    open override fun initView() {
//        mPresenter?.attachView(this as Nothing)
    }

    override fun onDestroy() {
        super.onDestroy()
//        mPresenter?.dettachView()
    }
}
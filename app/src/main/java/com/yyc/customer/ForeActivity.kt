package com.yyc.customer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yyc.baselib.base.MvpActivity
import com.yyc.customer.one.DaggerForeComponent
import com.yyc.customer.one.ForePresenter

class ForeActivity : MvpActivity<ForePresenter>() {
    override fun layoutId(): Int {
        return R.layout.activity_fore3
    }

    override fun initData() {
    }

    override fun initView() {
        DaggerForeComponent.builder().build().inject(this)
//        L.e("present:$mPresenter" + "---\n -- " )
//        presenter.Login("111")
//        mPresenter?.Login()
        mPresenter?.Login()




    }

}

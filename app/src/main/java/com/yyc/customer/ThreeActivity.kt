package com.yyc.customer

import com.yyc.baselib.base.BaseActivity
import com.yyc.baselib.base.User
import com.yyc.baselib.http.BaseObserver
import com.yyc.baselib.http.ServiceFactory
import com.yyc.baselib.utils.MyRxScheduler

class ThreeActivity : BaseActivity() {

    override fun layoutId(): Int {
        return R.layout.activity_three
    }

    override fun initData() {

    }

    override fun initView() {
        ServiceFactory.getService()
                .login1()
                .compose(MyRxScheduler.applySchedulers())
//                .compose<BaseEntity<User>>(RxSchedulers.ioMain<BaseEntity<User>>(this))
                //                .subscribeOn(Schedulers.io())
                //                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : BaseObserver<User>() {
                    override fun onSuccess(user: User?) {

                    }
                })

    }
}

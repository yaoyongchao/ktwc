package com.yyc.customer

import com.yyc.baselib.base.BaseActivity
import com.yyc.baselib.base.User
import com.yyc.baselib.http.BaseObserver
import com.yyc.baselib.http.ServiceFactory
import com.yyc.baselib.utils.L
import com.yyc.baselib.utils.MyRxScheduler

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class TwoActivity : BaseActivity() {

    override fun layoutId(): Int {
        return R.layout.activity_two
    }

    override fun initData() {

    }

    override fun initView() {
        ServiceFactory.getService()
                .login1()
                .compose(MyRxScheduler.ioMain())
                .subscribe(object : BaseObserver<User>(){
                    override fun onSuccess(t: User?) {
                        L.e("name: --- " + t!!.name + t!!.age)
                    }

                    override fun onFail(msg: String) {
                        super.onFail(msg)
                        L.e("$msg")
                    }
                })
                /*.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : BaseObserver<User>(this) {
                    override fun onSuccess(user: User?) {
                        L.d("aa" + user!!.name!!)
                    }
                })*/


    }
}

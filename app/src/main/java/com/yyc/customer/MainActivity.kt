package com.yyc.customer

import android.content.Intent
import com.yyc.baselib.BaseApplication
import com.yyc.baselib.base.BaseActivity
import com.yyc.baselib.base.User
import com.yyc.baselib.http.BaseObserver
import com.yyc.baselib.http.ServiceFactory
import com.yyc.baselib.utils.L
import com.yyc.baselib.utils.RxSchedulers
import com.yyc.baselib.utils.MyRxScheduler
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    override fun layoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
    }

    override fun initView() {



//        L.e("aa" + BaseApplication.INSTANCE.getAppContext())
        L.e("aa" + BaseApplication.instance())
        L.e("aa" + BaseApplication.instance().getAppContext())
        L.e("aa" )
//        L.e("aa" + BaseApplication.INSTANCE.getAppContext())


RxSchedulers
//        L.e("name:" + it.name + "--age:" + it.age)
        btn.setOnClickListener {
            var intent = Intent()
            intent.setClass(this,TwoActivity::class.java)
            startActivity(intent)
            /*ServiceFactory.getService().login1()
//                    .map(HttpResultFunc<User>())
//                    .subscribeOn(Schedulers.io())
//                    .observeOn(AndroidSchedulers.mainThread())
//                    .compose(SchedulerTransformer.applySchedulers())
                    .compose(MyRxScheduler.ioMain())
                    .subscribe(object : BaseObserver<User>(this){
                        override fun onSuccess(t: User?) {
                            L.e("name: --- " + t!!.name + t!!.age)
                        }

                        override fun onFail(msg: String) {
                            super.onFail(msg)
                            L.e("$msg")
                        }
                    })*/
//                    .compose(RxSchedulers.<BaseEntity<String>>ioMain(context = this))
//                    .compose(RxSchedulersOne.applySchedulers())
                    /*.subscribe(
                            {
                                L.e("onnext")
                            },
                            {
                                L.e("eoor")
                            },
                            {
                                L.e("onComplete")
                            }
                    )*/
                    /*.subscribeBy(
                            onComplete = {
                                L.e("onComplete")
                            },
                            onError = {
                                L.e("onError" + it.toString())
                            },
                            onNext = {
                                var user: User = it.data!!
                                L.e("onNext" + "--name:" + user.name + "--age:" + user.age )
                            }
                    )*/
        }

        /*tv.text = " nihao !"
        var s: Studen = Studen()
        s.age = 20

        L.e("aa")
        var a: RetrofitHelper = RetrofitHelper.INSTANCE
        var aa: RetrofitHelper = RetrofitHelper.INSTANCE

        L.i("-- "+ a + "--" + aa)*/




    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
}

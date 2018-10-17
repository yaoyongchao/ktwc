package com.yyc.customer.one

import com.yyc.baselib.mvp.BaseModel
import com.yyc.baselib.mvp.BasePresenter
import com.yyc.baselib.mvp.BaseView

interface ForeContract {
    interface ForeView: BaseView {
        fun Login()
    }
    abstract class ForePresenter(): BasePresenter<ForeContract.ForeView>() {
        abstract fun Login()

    }

    interface ForeModel: BaseModel {
        fun getData()

    }
}
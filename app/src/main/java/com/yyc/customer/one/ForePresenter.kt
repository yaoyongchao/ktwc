package com.yyc.customer.one

import com.yyc.baselib.utils.L
import javax.inject.Inject

class ForePresenter public @Inject
constructor(): ForeContract.ForePresenter<ForeModel>() {
    init {
        DaggerForeComponent.builder().build().inject(this)
    }
//    @Inject
//    lateinit var model: ForeModel
    override fun Login() {
//        L.e("present:" + model + "---++=" + getView())
    L.e("model: $model ----  ${getView()}" )
    model?.getData()
//        model.getData()
    }
}
package com.yyc.customer.one

import com.yyc.baselib.utils.L
import javax.inject.Inject

class ForePresenter public @Inject
constructor(): ForeContract.ForePresenter() {
    @Inject
    lateinit var model: ForeModel
    @Inject
    override fun Login() {
        L.e("present:" + model + "---++=" + getView())
        model.getData()
    }
}
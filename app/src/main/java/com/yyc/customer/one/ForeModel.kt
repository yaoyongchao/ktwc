package com.yyc.customer.one

import com.yyc.baselib.utils.L
import javax.inject.Inject

class ForeModel public @Inject
constructor(): ForeContract.ForeModel {
    override fun getData() {
        L.e("Ｍｏｄｅｌ　请求数据")
    }
}
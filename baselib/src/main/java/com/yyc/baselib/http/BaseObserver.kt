package com.yyc.baselib.http

import android.content.Context


import com.yyc.baselib.http.entity.BaseEntity
import com.yyc.baselib.utils.L
import io.reactivex.Observer

import io.reactivex.annotations.NonNull
import io.reactivex.disposables.Disposable

/**
 * Author: Austin
 * Date: 2018/10/9
 * Description:
 */
abstract class BaseObserver<T> () : Observer<BaseEntity<T>> {
//    private val mContext: Context
    private val SUCCESS_CODE = 0

    override fun onSubscribe(@NonNull d: Disposable) {

    }

    override fun onNext(@NonNull tBaseEntity: BaseEntity<T>) {
//        L.i("onNext")
        if (SUCCESS_CODE == tBaseEntity.code) {
            val t = tBaseEntity.data
            onSuccess(t)
        } else {
            L.i("onNext--Failure--code:" + tBaseEntity.code + "--Message:" + tBaseEntity.msg)
            onFail(tBaseEntity.msg)
        }

    }

    override fun onError(@NonNull e: Throwable) {
//        L.e("onError--" + e.toString())
//        ExceptionHandle.handleException(e)
    }

    override fun onComplete() {
//        L.d("onComplete")

    }

    abstract fun onSuccess(t: T?)

    open fun onFail(msg: String) {
//        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }
}

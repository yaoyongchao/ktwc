package com.yyc.baselib.mvp


import java.lang.ref.WeakReference
import javax.inject.Inject


/**
 * Author: Austin
 * Time: 2018/7/18
 * Description: presenter同时持有Model和View
 */

abstract class BasePresenter</*M,*/ V> {
//    @JvmField
//    @Inject
//    var model: M? =null//可空类型
//    var model: BaseModel? =null//可空类型
//    var model: BaseModel? = null
    private val view: V? = null
    private var mViewRef: WeakReference<V>? = null

    val isAttach: Boolean
        get() = mViewRef != null && mViewRef!!.get() != null

    fun attachModelView(/*M pModel,*/pView: V) {
        //        this.model = pModel;
        mViewRef = WeakReference(pView)
    }

    /**
     * 绑定的方法
     * 在onCreate()中调用
     * @param pView
     */
    fun attachView(pView: V) {
        mViewRef = WeakReference(pView)
    }

    fun getView(): V? {
        return if (isAttach) {
            mViewRef!!.get()
        } else {
            null
        }
    }

    /**
     * 解绑
     * 在onDestroy方法中调用，防止内存泄漏
     */
    fun dettachView() {
        if (null != mViewRef) {
            mViewRef!!.clear()
            mViewRef = null
        }
    }

}

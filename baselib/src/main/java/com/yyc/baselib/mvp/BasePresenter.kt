package com.yyc.baselib.mvp


import android.util.Log
import com.yyc.baselib.injector.component.DaggerBasePresenterComponent
import com.yyc.baselib.injector.module.BasePresenterModule
import com.yyc.baselib.utils.CreatUtilOne
import java.lang.ref.WeakReference
import javax.inject.Inject


/**
 * Author: Austin
 * Time: 2018/7/18
 * Description: presenter同时持有Model和View
 */

abstract class BasePresenter<M : BaseModel, V> {
//    @JvmField
//    @Inject
//    var model: M? =null//可空类型
//    var model: BaseModel? =null//可空类型
    var model: BaseModel? = null
    private val view: V? = null
    private var mViewRef: WeakReference<V>? = null

    val isAttach: Boolean
        get() = mViewRef != null && mViewRef!!.get() != null

    fun attachModelView(/*M pModel,*/pView: V) {
        //        this.model = pModel;
        mViewRef = WeakReference(pView)
        model =  CreatUtilOne.getT(this,0)
        Log.e("aa","---" + model)
    }

    /**
     * 绑定的方法
     * 在onCreate()中调用
     * @param pView
     */
    fun attachView(pView: V) {
        mViewRef = WeakReference(pView)
        Log.e("aa","attachView")
        model =  CreatUtilOne.getT(this,0)
        Log.e("aa","---" + model)
//        DaggerBasePresenterComponent.builder().build().
//        DaggerBasePresenterComponent.builder().
//        DaggerBasePresenterComponent.builder().basePresenterModule(BasePresenterModule(M as BaseModel))
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

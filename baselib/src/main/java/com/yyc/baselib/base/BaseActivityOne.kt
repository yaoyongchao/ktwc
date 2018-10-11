/*
package com.yyc.baselib.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.yyc.baselib.mvp.BaseModel
import com.yyc.baselib.mvp.BasePresenter
import com.yyc.baselib.utils.CreatUtil

*/
/**
 * @Author: Austin
 * @Date: 2018/10/10
 * @Description:
 *//*

abstract class BaseActivityOne<T : BasePresenter<*, *>, M : BaseModel> : AppCompatActivity() {

    var mPresenter: T? = null
    var mModel: M? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = CreatUtil.getT<T>(this, 0)
        mModel = CreatUtil.getT<M>(this, 1)
        if (this != null && mModel !=null)
//            mPresenter!!.attachModelView(mModel, this)
    }
}
*/

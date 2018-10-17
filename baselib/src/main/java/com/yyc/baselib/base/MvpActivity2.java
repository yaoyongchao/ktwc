/*
package com.yyc.baselib.base;

import android.os.Bundle;
import android.util.Log;

import com.yyc.baselib.injector.BaseApplication;
import com.yyc.baselib.injector.component.ActivityComponent;
import com.yyc.baselib.injector.component.DaggerActivityComponent;
import com.yyc.baselib.injector.component.DaggerApplicationComponent;
import com.yyc.baselib.injector.module.ActivityModule;
import com.yyc.baselib.mvp.BaseModel;
import com.yyc.baselib.mvp.BasePresenter;

import org.jetbrains.annotations.Nullable;

import javax.inject.Inject;

import kotlin.jvm.JvmField;

*/
/**
 * @Author: Austin
 * @Date: 2018/10/17
 * @Description:
 *//*

public abstract class MvpActivity2<P extends BasePresenter, M extends BaseModel> extends BaseActivity {

    @JvmField
    @Inject
    public P mPresenter;

    @JvmField
    @Inject
    public M mModel;
//    var mPresenter: P? =null//可空类型

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        DaggerActivityComponent.builder().applicationComponent(new Applica).activityModule(new ActivityModule(this))
//        initInject;
        initInject(DaggerActivityComponent.builder().applicationComponent(((BaseApplication)getApplication()).mApplicationComponent)
                .activityModule(new ActivityModule(this))
                .build());

        if (mPresenter != null)
            mPresenter.attachView(this);
        Log.e("aa", mPresenter + "-----" + mModel);
    }

    protected abstract void initInject(ActivityComponent activityComponent);
}
*/

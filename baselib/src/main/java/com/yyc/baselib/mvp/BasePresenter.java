package com.yyc.baselib.mvp;

import com.yyc.baselib.utils.CreatUtil;

import java.lang.ref.WeakReference;


/**
 * Author: Austin
 * Time: 2018/7/18
 * Description: presenter同时持有Model和View
 */

public abstract class BasePresenter<M, V> {
    public M model;
    public V view;
    public WeakReference<V> mViewRef;

    public void attachModelView(M pModel, V pView) {
        this.model = pModel;
        mViewRef = new WeakReference<>(pView);
    }

    public boolean isAttach() {
        return mViewRef != null && mViewRef.get() != null;
    }

    public V getView() {
        if (isAttach()) {
            return mViewRef.get();
        } else {
            return null;
        }
    }

    public void onDettach() {
        if (null != mViewRef) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

}

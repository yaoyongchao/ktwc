package com.yyc.baselib.mvp;


import java.lang.ref.WeakReference;


/**
 * Author: Austin
 * Time: 2018/7/18
 * Description: presenter同时持有Model和View
 */

public abstract class BasePresenterOne</*M,*/ V> {
    public BaseModel model;
    private V view;
    private WeakReference<V> mViewRef;

    public void attachModelView(/*M pModel,*/ V pView) {
//        this.model = pModel;
        mViewRef = new WeakReference<>(pView);
    }
    /**
     * 绑定的方法
     * 在onCreate()中调用
     * @param pView
     */
    public void attachView(V pView) {
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

    /**
     * 解绑
     * 在onDestroy方法中调用，防止内存泄漏
     */
    public void dettachView() {
        if (null != mViewRef) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

}

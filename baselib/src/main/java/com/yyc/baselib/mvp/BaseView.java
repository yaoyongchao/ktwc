package com.yyc.baselib.mvp;

/**
 * Author: Austin
 * Time: 2018/7/18
 * Description:
 */

public interface BaseView {
//    void showLoading();
//    void showError();

    /**
     * @descriptoin  请求前加载progress
     * @author   dc
     * @date 2017/2/16 11:00
     */
//    void showProgress();
//    void disimissProgress();
//    void loadDataSuccess(T data);

    void loadDataError(String error);
    void loadDataSuccess(Object obj);


}

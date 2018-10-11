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
    void showProgress();

    /**
     * @descriptoin  请求结束之后隐藏progress
     * @author   dc
     * @date 2017/2/16 11:01
     */
    void disimissProgress();

    /**
     * @descriptoin  请求数据成功
     * @author   dc
     * @param data 数据类型
     * @date 2017/2/16 11:01
     */
//    void loadDataSuccess(T data);

    /**
     * @descriptoin  请求数据错误
     * @author   dc
     * @param throwable 异常类型
     * @date 2017/2/16 11:01
     */
    void loadDataError(Throwable throwable);


}

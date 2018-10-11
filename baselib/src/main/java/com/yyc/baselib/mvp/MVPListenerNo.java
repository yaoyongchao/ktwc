package com.yyc.baselib.mvp;

/**
 * Author: Austin
 * Time: 2018/7/18
 * Description: Model层数据处理后的回调接口。表示成功后不需要回调参数
 */
public interface MVPListenerNo {
    void onSuccess();

    void onError(String error);
}

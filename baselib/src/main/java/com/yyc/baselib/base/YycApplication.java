package com.yyc.baselib.base;

import android.app.Application;
import android.content.Context;

/**
 * Author: Austin
 * Date: 2018/10/9
 * Description:
 */
public class YycApplication extends Application {
    private static Context mContext;
    public  static  YycApplication  app;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        mContext = getAppContext();
    }

    public  static  YycApplication  getInstance(){
        return  app;
    }


    public static   Context getAppContext() {
        return mContext;
    }
}

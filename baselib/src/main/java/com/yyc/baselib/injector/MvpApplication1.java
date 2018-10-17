/*
package com.yyc.baselib.injector;

import android.app.Application;

import com.yyc.baselib.injector.component.ApplicationComponent;
import com.yyc.baselib.injector.component.DaggerApplicationComponent;
import com.yyc.baselib.injector.module.MyAppModule;

public class MvpApplication1 extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
//        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
//        component = DaggerApplicationComponent.builder()
        component = DaggerApplicationComponent.builder().myAppModule(new MyAppModule(this)).build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
*/

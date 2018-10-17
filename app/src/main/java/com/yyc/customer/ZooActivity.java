package com.yyc.customer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import javax.inject.Inject;

public class ZooActivity extends AppCompatActivity {
//    @Inject
//    Zoo zoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoo);

//        DaggerActivityComponent.builder()
//                .build()
//                .inject(this);
//        zoo.setName("zs");
//        Log.e("aa",zoo.getName());
    }
}

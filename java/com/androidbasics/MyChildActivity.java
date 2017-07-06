package com.androidbasics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by tasol on 5/7/17.
 */

public class MyChildActivity extends MyMasterActivity implements TestInterface{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("@@@WWe"," Childs");
    }
    @Override
    public void getName(String name) {
        Log.v("@@@WWe"," Child Implements Call "+name);
    }
}

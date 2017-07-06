package com.androidbasics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by tasol on 5/7/17.
 */

public class MyMasterActivity extends Activity {
    TestInterface testInterface;
    public static  MyMasterActivity masterActivity;
    public Context context;
    public TestInterface getTestInterface() {
        return testInterface;
    }

    public void setTestInterface(TestInterface testInterface) {
        this.testInterface = testInterface;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        testInterface=(TestInterface)this;
        Log.v("@@@WWE","Master ");
        setTestInterface(testInterface);
        if(getTestInterface()!=null){
            final Timer timer=new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    getTestInterface().getName("Hello World "+new Date());
                    timer.cancel();
                }
            },1000,1000);

        }

    }


}

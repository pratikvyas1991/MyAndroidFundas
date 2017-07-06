package com.androidbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText=(TextView)findViewById(R.id.tvText);
//        doFinish();
//        onDestroy();
        tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doFinish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("@@@WWe"," OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("@@@WWe"," OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("@@@WWe"," OnDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("@@@WWe"," OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("@@@WWe"," OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("@@@WWe"," OnPaused");
    }

    public void doFinish(){
//        finish();
        Intent intent=new Intent(MainActivity.this,FragDashActivity.class);
        intent.putExtra("positions",1);
        startActivity(intent);


    }
}

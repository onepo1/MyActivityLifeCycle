package com.example.edu.myactivitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity  {
    final String TAG = "States";
    final String ACTIVITY = "ThirdActivity";
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView3 = (TextView) findViewById(R.id.textView3);

        Log.i(TAG,"third : onCreate");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"third : onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"third : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"third : onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"third : onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"third : onRestart");
    }
}

package com.example.edu.myactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    final String TAG = "States";
    final String ACTIVITY = "SecondActivity";
    Button btn_second;
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_second = (Button) findViewById(R.id.btn_second);
        btn_second.setOnClickListener(this);
        textView2 = (TextView) findViewById(R.id.textView2);

        Log.i(TAG,"second : onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"second : onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"second : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"second : onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"second : onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"second : onRestart");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}

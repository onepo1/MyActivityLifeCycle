package com.example.edu.myactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG = "States";
    final String ACTIVITY = "MainActivity";
    Button btn_first;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_first = (Button) findViewById(R.id.btn_first);
        btn_first.setOnClickListener(this);
        textView1 = (TextView) findViewById(R.id.textView1);

        Log.i(TAG,"first : onCreate");

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"first : onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"first : onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"first : onPause");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"first : onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"first : onRestart");
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

package com.example.hanif.iak_beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"onCreate");//membantu bgmn carany tau data itu sampai
        //Log.d untuk developer dan Log.e untuk error
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG,"onRestart");
    }
}

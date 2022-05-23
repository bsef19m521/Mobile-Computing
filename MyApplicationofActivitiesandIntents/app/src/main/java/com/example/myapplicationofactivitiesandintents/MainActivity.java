package com.example.myapplicationofactivitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC", "MA onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC", "MA onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC", "MA onPause");

    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC", "MA onSTop");

    }
    @Override
    protected void onDestroy() {
        Log.d("ALC", "MA onDestroy");
        super.onDestroy();
    }
}
package com.example.kaspe.courseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Exercise2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1_3);
        Log.i("Exercise2_2","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Exercise2_2","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Exercise2_2","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Exercise2_2","onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Exercise2_2","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Exercise2_2","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Exercise2_2","onDestroy");
    }
}

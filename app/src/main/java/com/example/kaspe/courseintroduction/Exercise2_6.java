package com.example.kaspe.courseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Exercise2_6 extends AppCompatActivity {

    ProgressBar progressBar;
    int progress = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2_6);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(progress);
    }

    public void changeProgress(View v) {
        switch (v.getId()) {
            case R.id.minus:
                if(progress >= 10)
                progress -= 10;
                break;
            case R.id.plus:
                if(progress <= 90)
                progress += 10;
        }
        progressBar.setProgress(progress);
    }
}

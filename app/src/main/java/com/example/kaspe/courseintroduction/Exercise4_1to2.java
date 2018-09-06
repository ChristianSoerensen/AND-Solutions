package com.example.kaspe.courseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Exercise4_1to2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise4_1to2);
        textView = findViewById(R.id.textView);
    }

    public void changeText(View v){
        textView.setText(getResources().getString(R.string.app_name));
    }
}

package com.example.kaspe.courseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exercise2_3to4 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2_3to4);

        button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Exercise2_3to4.this, "This is a toast!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void button2(View v) {
        Toast.makeText(Exercise2_3to4.this, "This is a toast!", Toast.LENGTH_SHORT).show();
    }
}

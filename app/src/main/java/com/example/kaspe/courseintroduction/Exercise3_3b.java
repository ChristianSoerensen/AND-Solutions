package com.example.kaspe.courseintroduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class Exercise3_3b extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise3_3b);

        button = findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();

        int data = bundle.getInt("someNumber");

        Toast.makeText(this, "The number: " + data, Toast.LENGTH_SHORT).show();
    }

    public void destroyActivity(View v) {
        Intent returnIntent = new Intent();
        String time = Calendar.getInstance().getTime().toString();
        returnIntent.putExtra("someStringKey",time);
        setResult(1,returnIntent);
        finish();
    }
}

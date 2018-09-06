package com.example.kaspe.courseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

public class Exercise4_3to5 extends AppCompatActivity {

    ImageView imageView;
    Switch aswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise4_3to5);
        imageView = findViewById(R.id.imageView);
        aswitch = findViewById(R.id.switch1);
    }

    public void clickSwitch(View v) {
        if (((Switch) v).isChecked())
            imageView.setImageResource(R.drawable.raichu);
        else
            imageView.setImageResource(R.drawable.pikachu);
    }
}

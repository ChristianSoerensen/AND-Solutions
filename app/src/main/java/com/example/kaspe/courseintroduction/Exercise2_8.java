package com.example.kaspe.courseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Exercise2_8 extends AppCompatActivity {

    int result = 0;
    TextView display;
    boolean clearDisplay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2_8);
        display = findViewById(R.id.display);
        display.setText("0");
    }

    //Use the same onClick attribute for all Views and use a switch statement
    public void clicked(View v) {
        if (clearDisplay) {
            display.setText("");
            clearDisplay = false;
        }

        switch (v.getId()) {
            case R.id.one:
                //The same as display.setText(display.getText().toString() + 1);
                display.append(String.valueOf(1));
                break;
            case R.id.two:
                display.append(String.valueOf(2));
                break;
            case R.id.three:
                display.append(String.valueOf(3));
                break;
            case R.id.four:
                display.append(String.valueOf(4));
                break;
            case R.id.five:
                display.append(String.valueOf(5));
                break;
            case R.id.six:
                display.append(String.valueOf(6));
                break;
            case R.id.seven:
                display.append(String.valueOf(7));
                break;
            case R.id.eight:
                display.append(String.valueOf(8));
                break;
            case R.id.nine:
                display.append(String.valueOf(9));
                break;
            case R.id.zero:
                display.append(String.valueOf(0));
                break;
            case R.id.clear:
                clearDisplay = true;
                display.setText("0");
                result = 0;
                break;
            case R.id.plus:
                clearDisplay = true;
                if (!display.getText().toString().isEmpty())
                    result += Integer.parseInt(display.getText().toString());
                display.setText(Integer.toString(result));
        }
    }
}
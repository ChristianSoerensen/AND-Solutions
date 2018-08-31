package com.example.kaspe.courseintroduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Exercise2_7 extends AppCompatActivity {

    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2_7);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
    }

    public void loginButton(View v) {
        if (email.getText().toString().equals("user@email.com") && password.getText().toString().equals("ILOVEAND")) {
            Toast.makeText(this, "Welcome user!", Toast.LENGTH_SHORT).show();
        }
    }
}

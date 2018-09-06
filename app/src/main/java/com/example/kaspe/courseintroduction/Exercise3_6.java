package com.example.kaspe.courseintroduction;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercise3_6 extends AppCompatActivity {

    EditText edit_to;
    EditText edit_subject;
    EditText edit_body;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise3_6);

        edit_to = findViewById(R.id.edit_to);
        edit_subject = findViewById(R.id.edit_subject);
        edit_body = findViewById(R.id.edit_body);
        button = findViewById(R.id.button);
    }

    public void sendNow(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{edit_to.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT, edit_subject.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, edit_body.getText().toString());

        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }

    }
}

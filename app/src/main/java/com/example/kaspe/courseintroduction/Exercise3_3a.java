package com.example.kaspe.courseintroduction;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exercise3_3a extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise3_3a);
        button = findViewById(R.id.button);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this,Exercise3_3b.class);
        intent.putExtra("someNumber",42);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 0 && resultCode == 1) {
            String returnValue = data.getExtras().getString("someStringKey");
            Toast.makeText(this, returnValue, Toast.LENGTH_SHORT).show();
        }
    }
}

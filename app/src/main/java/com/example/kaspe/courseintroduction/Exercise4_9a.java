package com.example.kaspe.courseintroduction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Exercise4_9a extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise4_9a);
        textView = findViewById(R.id.textView);
        PreferenceManager.setDefaultValues(this,R.xml.preferences,false);
    }

    public void accessSettings(View v){
        Intent intent = new Intent(this,Exercise4_9b.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        String listKeyValue = sharedPrefs.getString("listKey","No value yet");
        textView.setText(listKeyValue);
    }
}

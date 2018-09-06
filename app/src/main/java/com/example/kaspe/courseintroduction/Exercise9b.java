package com.example.kaspe.courseintroduction;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Exercise9b extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content,new Exercise9c()).commit();
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean checkboxValue = sharedPrefs.getBoolean("checkboxKey",false);
        Toast.makeText(this, "Checkbox value: "+ checkboxValue, Toast.LENGTH_SHORT).show();
    }
}

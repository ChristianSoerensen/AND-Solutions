package com.example.kaspe.courseintroduction;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;

public class Exercise9c extends PreferenceFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}

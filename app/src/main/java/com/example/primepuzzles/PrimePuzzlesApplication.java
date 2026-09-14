package com.example.primepuzzles;

import android.app.Application;
import android.content.SharedPreferences;

import androidx.appcompat.app.AppCompatDelegate;

public class PrimePuzzlesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SharedPreferences preferences =
                getSharedPreferences(
                        "PrimePuzzlesProgress",
                        MODE_PRIVATE
                );

        boolean darkMode =
                preferences.getBoolean(
                        "DARK_MODE",
                        true
                );

        if (darkMode) {

            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_YES
            );

        } else {

            AppCompatDelegate.setDefaultNightMode(
                    AppCompatDelegate.MODE_NIGHT_NO
            );
        }
    }
}
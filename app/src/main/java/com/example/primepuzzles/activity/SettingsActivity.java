package com.example.primepuzzles.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import com.example.primepuzzles.R;

public class SettingsActivity extends AppCompatActivity {

    private ImageButton backButton;

    private Switch soundSwitch;
    private Switch vibrationSwitch;

    private SharedPreferences preferences;
    private Switch themeSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);

        preferences = getSharedPreferences(
                "PrimePuzzlesProgress",
                MODE_PRIVATE
        );

        backButton = findViewById(R.id.backButton);

        soundSwitch = findViewById(R.id.soundSwitch);
        vibrationSwitch = findViewById(R.id.vibrationSwitch);
        themeSwitch = findViewById(R.id.themeSwitch);

        // Load saved settings
        boolean soundEnabled =
                preferences.getBoolean(
                        "SOUND_ENABLED",
                        true
                );

        boolean vibrationEnabled =
                preferences.getBoolean(
                        "VIBRATION_ENABLED",
                        true
                );

        boolean darkMode =
                preferences.getBoolean(
                        "DARK_MODE",
                        true
                );

        themeSwitch.setChecked(darkMode);

        soundSwitch.setChecked(soundEnabled);
        vibrationSwitch.setChecked(vibrationEnabled);

        // Back button
        backButton.setOnClickListener(v -> {
            finish();
        });

        // Sound setting
        soundSwitch.setOnCheckedChangeListener(
                (buttonView, isChecked) -> {

                    preferences.edit()
                            .putBoolean(
                                    "SOUND_ENABLED",
                                    isChecked
                            )
                            .apply();
                }
        );

        // Vibration setting
        vibrationSwitch.setOnCheckedChangeListener(
                (buttonView, isChecked) -> {

                    preferences.edit()
                            .putBoolean(
                                    "VIBRATION_ENABLED",
                                    isChecked
                            )
                            .apply();
                }
        );

        themeSwitch.setOnCheckedChangeListener(
                (buttonView, isChecked) -> {

                    preferences.edit()
                            .putBoolean(
                                    "DARK_MODE",
                                    isChecked
                            )
                            .apply();

                    if (isChecked) {

                        AppCompatDelegate
                                .setDefaultNightMode(
                                        AppCompatDelegate
                                                .MODE_NIGHT_YES
                                );

                    } else {

                        AppCompatDelegate
                                .setDefaultNightMode(
                                        AppCompatDelegate
                                                .MODE_NIGHT_NO
                                );
                    }
                }
        );
    }
}
package com.example.primepuzzles.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatDelegate;

import com.example.primepuzzles.R;

public class MainActivity extends AppCompatActivity {

    private LinearLayout playQuizCard;
    private LinearLayout categoriesCard;
    private LinearLayout howToPlayCard;
    private ImageButton settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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

            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate.MODE_NIGHT_YES
                    );

        } else {

            AppCompatDelegate
                    .setDefaultNightMode(
                            AppCompatDelegate.MODE_NIGHT_NO
                    );
        }

        setContentView(R.layout.activity_main);

        // Find views
        playQuizCard = findViewById(R.id.playQuizCard);
        categoriesCard = findViewById(R.id.categoriesCard);
        howToPlayCard = findViewById(R.id.howToPlayCard);
        settingsButton = findViewById(R.id.settingsButton);
        LinearLayout progressCard = findViewById(R.id.progressCard);
        LinearLayout dailyChallengeCard =
                findViewById(R.id.dailyChallengeCard);

        LinearLayout aboutCard =
                findViewById(R.id.aboutCard);

        aboutCard.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    AboutActivity.class
            );

            startActivity(intent);
        });

        progressCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            StatsActivity.class
                    );

            startActivity(intent);
        });

        // PLAY QUIZ
        playQuizCard.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    CategoryActivity.class
            );

            startActivity(intent);

        });

        // Categories
        categoriesCard.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    CategoryActivity.class
            );

            startActivity(intent);

        });

        // Daily Challenge
        dailyChallengeCard.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    DailyChallengeActivity.class
            );

            startActivity(intent);
        });

        // How to Play
        howToPlayCard.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    HowToPlayActivity.class
            );

            startActivity(intent);
        });

        // Settings
        settingsButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    SettingsActivity.class
            );

            startActivity(intent);
        });
    }

    @Override
    public void onBackPressed() {

        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Exit Prime Puzzles?")

                .setMessage(
                        "Are you sure you want to exit Prime Puzzles?"
                )

                .setNegativeButton(
                        "CANCEL",
                        (dialog, which) -> dialog.dismiss()
                )

                .setPositiveButton(
                        "EXIT",
                        (dialog, which) -> finishAffinity()
                )

                .show();
    }
}
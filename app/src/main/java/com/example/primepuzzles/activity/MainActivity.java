package com.example.primepuzzles.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

public class MainActivity extends AppCompatActivity {

    private LinearLayout playQuizCard;
    private LinearLayout categoriesCard;
    private LinearLayout levelsCard;
    private LinearLayout howToPlayCard;
    private ImageButton settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Find views
        playQuizCard = findViewById(R.id.playQuizCard);
        categoriesCard = findViewById(R.id.categoriesCard);
        levelsCard = findViewById(R.id.levelsCard);
        howToPlayCard = findViewById(R.id.howToPlayCard);
        settingsButton = findViewById(R.id.settingsButton);

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

        // Levels
        levelsCard.setOnClickListener(v -> {
            Toast.makeText(
                    MainActivity.this,
                    "Levels coming soon!",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // How to Play
        howToPlayCard.setOnClickListener(v -> {
            Toast.makeText(
                    MainActivity.this,
                    "How to Play coming soon!",
                    Toast.LENGTH_SHORT
            ).show();
        });

        // Settings
        settingsButton.setOnClickListener(v -> {
            Toast.makeText(
                    MainActivity.this,
                    "Settings coming soon!",
                    Toast.LENGTH_SHORT
            ).show();
        });
    }
}
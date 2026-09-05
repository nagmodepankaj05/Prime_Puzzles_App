package com.example.primepuzzles.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

public class LevelActivity extends AppCompatActivity {

    private ImageButton backButton;
    private TextView categoryName;

    private String selectedCategory;

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_level);

        // SharedPreferences
        preferences = getSharedPreferences(
                "PrimePuzzlesProgress",
                MODE_PRIVATE
        );

        // Get selected category
        selectedCategory = getIntent().getStringExtra("CATEGORY");

        // Find views
        backButton = findViewById(R.id.backButton);
        categoryName = findViewById(R.id.categoryName);

        // Display category name
        if (selectedCategory != null) {
            categoryName.setText(selectedCategory);
        }

        // Back button
        backButton.setOnClickListener(v -> {
            finish();
        });

        // Setup levels
        setupLevel(
                R.id.level1Card,
                1,
                true
        );

        setupLevel(
                R.id.level2Card,
                2,
                isLevelUnlocked(2)
        );

        setupLevel(
                R.id.level3Card,
                3,
                isLevelUnlocked(3)
        );

        setupLevel(
                R.id.level4Card,
                4,
                isLevelUnlocked(4)
        );

        setupLevel(
                R.id.level5Card,
                5,
                isLevelUnlocked(5)
        );

        setupLevel(
                R.id.level6Card,
                6,
                isLevelUnlocked(6)
        );
    }


    // =========================================
    // CHECK LEVEL UNLOCK
    // =========================================

    private boolean isLevelUnlocked(int level) {

        // Level 1 is always unlocked
        if (level == 1) {
            return true;
        }

        String key =
                selectedCategory + "_LEVEL_" + level;

        return preferences.getBoolean(
                key,
                false
        );
    }


    // =========================================
    // SETUP LEVEL CARD
    // =========================================

    private void setupLevel(
            int cardId,
            int level,
            boolean unlocked
    ) {

        View levelCard = findViewById(cardId);

        if (unlocked) {

            // Unlocked appearance
            levelCard.setAlpha(1.0f);

            levelCard.setOnClickListener(v -> {

                Intent intent = new Intent(
                        LevelActivity.this,
                        QuizActivity.class
                );

                intent.putExtra(
                        "CATEGORY",
                        selectedCategory
                );

                intent.putExtra(
                        "LEVEL",
                        level
                );

                startActivity(intent);
            });

        } else {

            // Locked appearance
            levelCard.setAlpha(0.5f);

            levelCard.setOnClickListener(v -> {

                Toast.makeText(
                        LevelActivity.this,
                        "Complete the previous level first.",
                        Toast.LENGTH_SHORT
                ).show();

            });
        }
    }
}
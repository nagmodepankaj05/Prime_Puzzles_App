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
    private TextView level2LockIcon;
    private TextView level3LockIcon;
    private TextView level4LockIcon;
    private TextView level5LockIcon;
    private TextView level6LockIcon;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_level);

        // =========================================
        // SharedPreferences
        // =========================================

        preferences = getSharedPreferences(
                "PrimePuzzlesProgress",
                MODE_PRIVATE
        );

        // =========================================
        // Get selected category
        // =========================================

        selectedCategory =
                getIntent().getStringExtra("CATEGORY");

        // =========================================
        // Find views
        // =========================================

        backButton = findViewById(R.id.backButton);
        categoryName = findViewById(R.id.categoryName);
        level2LockIcon = findViewById(R.id.level2LockIcon);
        level3LockIcon = findViewById(R.id.level3LockIcon);
        level4LockIcon = findViewById(R.id.level4LockIcon);
        level5LockIcon = findViewById(R.id.level5LockIcon);
        level6LockIcon = findViewById(R.id.level6LockIcon);

        // =========================================
        // Display category name
        // =========================================

        if (selectedCategory != null) {
            categoryName.setText(selectedCategory);
        }

        // =========================================
        // Back button
        // =========================================

        backButton.setOnClickListener(v -> {
            finish();
        });

        // =========================================
        // Setup all levels
        // =========================================

        setupLevelCard(R.id.level1Card, 1);
        setupLevelCard(R.id.level2Card, 2);
        setupLevelCard(R.id.level3Card, 3);
        setupLevelCard(R.id.level4Card, 4);
        setupLevelCard(R.id.level5Card, 5);
        setupLevelCard(R.id.level6Card, 6);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (preferences != null) {

            setupLevelCard(R.id.level1Card, 1);
            setupLevelCard(R.id.level2Card, 2);
            setupLevelCard(R.id.level3Card, 3);
            setupLevelCard(R.id.level4Card, 4);
            setupLevelCard(R.id.level5Card, 5);
            setupLevelCard(R.id.level6Card, 6);
        }
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

    private void setupLevelCard(int cardId, int level) {

        View levelCard = findViewById(cardId);

        boolean unlocked = isLevelUnlocked(level);

        String completedKey =
                selectedCategory
                        + "_LEVEL_"
                        + level
                        + "_COMPLETED";

        boolean completed =
                preferences.getBoolean(
                        completedKey,
                        false
                );

        // =========================================
        // UPDATE LOCK / UNLOCK ICON
        // =========================================

        if (level > 1) {
            updateLockIcon(level, unlocked);
        }

        // =========================================
        // UNLOCKED LEVEL
        // =========================================

        if (unlocked) {

            // Normal appearance
            levelCard.setAlpha(1.0f);

            levelCard.setOnClickListener(v -> {

                // Press animation
                v.animate()
                        .scaleX(0.96f)
                        .scaleY(0.96f)
                        .setDuration(80)
                        .withEndAction(() -> {

                            v.animate()
                                    .scaleX(1.0f)
                                    .scaleY(1.0f)
                                    .setDuration(80)
                                    .start();

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
                        })
                        .start();
            });

        }

        // =========================================
        // LOCKED LEVEL
        // =========================================

        else {

            // Make locked level look disabled
            levelCard.setAlpha(0.45f);

            levelCard.setOnClickListener(v -> {

                Toast.makeText(
                        LevelActivity.this,
                        "🔒 Complete the previous level first.",
                        Toast.LENGTH_SHORT
                ).show();

                // Shake animation
                v.animate()
                        .translationX(8)
                        .setDuration(50)
                        .withEndAction(() -> {

                            v.animate()
                                    .translationX(-8)
                                    .setDuration(50)
                                    .withEndAction(() -> {

                                        v.animate()
                                                .translationX(0)
                                                .setDuration(50)
                                                .start();

                                    })
                                    .start();

                        })
                        .start();
            });
        }
    }

    private void updateLockIcon(int level, boolean unlocked) {

        String icon = unlocked ? "🔓" : "🔒";

        switch (level) {

            case 2:
                if (level2LockIcon != null) {
                    level2LockIcon.setText(icon);
                }
                break;

            case 3:
                if (level3LockIcon != null) {
                    level3LockIcon.setText(icon);
                }
                break;

            case 4:
                if (level4LockIcon != null) {
                    level4LockIcon.setText(icon);
                }
                break;

            case 5:
                if (level5LockIcon != null) {
                    level5LockIcon.setText(icon);
                }
                break;

            case 6:
                if (level6LockIcon != null) {
                    level6LockIcon.setText(icon);
                }
                break;
        }
    }
}
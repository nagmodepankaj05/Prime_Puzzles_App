package com.example.primepuzzles.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

public class ResultActivity extends AppCompatActivity {

    private TextView resultTitle;
    private TextView resultCategory;
    private TextView scoreText;
    private TextView percentageText;
    private TextView resultMessage;
    private TextView unlockMessage;

    private Button nextLevelButton;
    private Button retryButton;
    private Button backToLevelsButton;

    private String category;
    private int level;
    private int score;
    private int totalQuestions;

    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);


        // Get result data
        category = getIntent().getStringExtra("CATEGORY");

        level = getIntent().getIntExtra("LEVEL", 1);

        score = getIntent().getIntExtra("SCORE", 0);

        totalQuestions =
                getIntent().getIntExtra("TOTAL", 10);


        // Find views
        resultTitle = findViewById(R.id.resultTitle);
        resultCategory = findViewById(R.id.resultCategory);
        scoreText = findViewById(R.id.scoreText);
        percentageText = findViewById(R.id.percentageText);
        resultMessage = findViewById(R.id.resultMessage);
        unlockMessage = findViewById(R.id.unlockMessage);

        nextLevelButton =
                findViewById(R.id.nextLevelButton);

        retryButton =
                findViewById(R.id.retryButton);

        backToLevelsButton =
                findViewById(R.id.backToLevelsButton);


        // SharedPreferences
        preferences =
                getSharedPreferences(
                        "PrimePuzzlesProgress",
                        MODE_PRIVATE
                );


        // Calculate percentage
        int percentage =
                (score * 100) / totalQuestions;


        // Display result
        scoreText.setText(
                score + " / " + totalQuestions
        );

        percentageText.setText(
                percentage + "%"
        );

        resultCategory.setText(
                category + " • Level " + level
        );


        // Check whether player passed
        boolean passed = percentage >= 60;


        if (passed) {

            resultTitle.setText("🎉 Excellent!");

            resultMessage.setText(
                    "Congratulations! You passed this level."
            );


            // Unlock next level
            int nextLevel = level + 1;

            String unlockKey =
                    category + "_LEVEL_" + nextLevel;


            preferences
                    .edit()
                    .putBoolean(unlockKey, true)
                    .apply();


            unlockMessage.setText(
                    "🔓 Level "
                            + nextLevel
                            + " Unlocked!"
            );


            nextLevelButton.setVisibility(
                    android.view.View.VISIBLE
            );


            // Go to next level
            nextLevelButton.setOnClickListener(v -> {

                Intent intent =
                        new Intent(
                                ResultActivity.this,
                                QuizActivity.class
                        );

                intent.putExtra(
                        "CATEGORY",
                        category
                );

                intent.putExtra(
                        "LEVEL",
                        nextLevel
                );

                startActivity(intent);

                finish();

            });

        } else {

            resultTitle.setText("Keep Trying! 💪");

            resultMessage.setText(
                    "You need at least 60% to unlock the next level."
            );


            unlockMessage.setText(
                    "🔒 Level "
                            + (level + 1)
                            + " is locked"
            );


            nextLevelButton.setVisibility(
                    android.view.View.GONE
            );

        }


        // Retry current level
        retryButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            ResultActivity.this,
                            QuizActivity.class
                    );

            intent.putExtra(
                    "CATEGORY",
                    category
            );

            intent.putExtra(
                    "LEVEL",
                    level
            );

            startActivity(intent);

            finish();

        });


        // Back to level screen
        backToLevelsButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            ResultActivity.this,
                            LevelActivity.class
                    );

            intent.putExtra(
                    "CATEGORY",
                    category
            );

            startActivity(intent);

            finish();

        });

    }
}
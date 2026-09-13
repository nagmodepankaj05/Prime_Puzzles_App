package com.example.primepuzzles.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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
        category =
                getIntent().getStringExtra("CATEGORY");

        level =
                getIntent().getIntExtra("LEVEL", 1);

        score =
                getIntent().getIntExtra("SCORE", 0);

        totalQuestions =
                getIntent().getIntExtra("TOTAL", 10);


        // Find views
        resultTitle =
                findViewById(R.id.resultTitle);

        resultCategory =
                findViewById(R.id.resultCategory);

        scoreText =
                findViewById(R.id.scoreText);

        percentageText =
                findViewById(R.id.percentageText);

        resultMessage =
                findViewById(R.id.resultMessage);

        unlockMessage =
                findViewById(R.id.unlockMessage);

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
        int percentage = 0;

        if (totalQuestions > 0) {

            percentage =
                    (score * 100) / totalQuestions;
        }


        // Display score
        scoreText.setText(
                score + " / " + totalQuestions
        );


        // Display percentage
        percentageText.setText(
                percentage + "%"
        );


        // Display category and level
        resultCategory.setText(
                category + " • Level " + level
        );


        // Check pass/fail
        // Save quiz statistics
        saveQuizStatistics();

        // Check pass/fail
        boolean passed = percentage >= 60;


        if (passed) {

            showPassedResult();

        } else {

            showFailedResult();
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


        // Back to levels
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


    // ================================
    // PASSED RESULT
    // ================================

    private void showPassedResult() {

        resultTitle.setText("🎉 Excellent!");

        // Save completed level
        String completedKey =
                category + "_LEVEL_" + level + "_COMPLETED";

        preferences
                .edit()
                .putBoolean(
                        completedKey,
                        true
                )
                .apply();

        resultMessage.setText(
                getPerformanceMessage()
        );


        // Check if this is the final level
        if (level < 6) {

            int nextLevel =
                    level + 1;


            // Unlock next level
            String unlockKey =
                    category + "_LEVEL_" + nextLevel;


            preferences
                    .edit()
                    .putBoolean(
                            unlockKey,
                            true
                    )
                    .apply();


            // Display unlock message
            unlockMessage.setVisibility(
                    View.VISIBLE
            );

            unlockMessage.setText(
                    "🔓 Level "
                            + nextLevel
                            + " Unlocked!"
            );


            // Show next level button
            nextLevelButton.setVisibility(
                    View.VISIBLE
            );


            // Next level button
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

            // Final Level completed
            unlockMessage.setVisibility(
                    View.VISIBLE
            );

            unlockMessage.setText(
                    "🏆 Congratulations! You completed all levels!"
            );


            // No next level
            nextLevelButton.setVisibility(
                    View.GONE
            );
        }
    }


    // ================================
    // FAILED RESULT
    // ================================

    private void showFailedResult() {

        resultTitle.setText(
                "Keep Trying! 💪"
        );


        resultMessage.setText(
                "You need at least 60% to unlock the next level."
        );


        unlockMessage.setVisibility(
                View.VISIBLE
        );


        unlockMessage.setText(
                "🔒 Level "
                        + (level + 1)
                        + " is locked"
        );


        // Hide next level button
        nextLevelButton.setVisibility(
                View.GONE
        );
    }


    // ================================
    // PERFORMANCE MESSAGE
    // ================================

    private String getPerformanceMessage() {

        int percentage =
                (score * 100) / totalQuestions;


        if (percentage == 100) {

            return "🔥 Perfect Score! Amazing work!";

        } else if (percentage >= 80) {

            return "🌟 Excellent performance! Keep going!";

        } else if (percentage >= 60) {

            return "👍 Great job! You passed the level!";

        } else {

            return "Keep practicing and try again!";
        }
    }

    // =================================
// SAVE QUIZ STATISTICS
// =================================

    private void saveQuizStatistics() {

        // Get current total quizzes
        int totalQuizzes =
                preferences.getInt(
                        "TOTAL_QUIZZES",
                        0
                );

        // Increase quiz count
        totalQuizzes++;

        preferences
                .edit()
                .putInt(
                        "TOTAL_QUIZZES",
                        totalQuizzes
                )
                .apply();


        // Calculate percentage
        int percentage = 0;

        if (totalQuestions > 0) {

            percentage =
                    (score * 100) / totalQuestions;
        }


        // Get previous best score
        int bestScore =
                preferences.getInt(
                        "BEST_SCORE",
                        0
                );


        // Save new best score
        if (percentage > bestScore) {

            preferences
                    .edit()
                    .putInt(
                            "BEST_SCORE",
                            percentage
                    )
                    .apply();
        }
    }
}
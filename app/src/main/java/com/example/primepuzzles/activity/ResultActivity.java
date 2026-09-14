package com.example.primepuzzles.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

import java.util.Calendar;

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

    private boolean isDailyChallenge;

    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);

        // ==========================================
        // Get Daily Challenge Status
        // ==========================================

        isDailyChallenge =
                getIntent().getBooleanExtra(
                        "DAILY_CHALLENGE",
                        false
                );

        // ==========================================
        // Get Result Data
        // ==========================================

        category =
                getIntent().getStringExtra(
                        "CATEGORY"
                );

        level =
                getIntent().getIntExtra(
                        "LEVEL",
                        1
                );

        score =
                getIntent().getIntExtra(
                        "SCORE",
                        0
                );

        totalQuestions =
                getIntent().getIntExtra(
                        "TOTAL",
                        10
                );

        // ==========================================
        // Find Views
        // ==========================================

        resultTitle =
                findViewById(
                        R.id.resultTitle
                );

        resultCategory =
                findViewById(
                        R.id.resultCategory
                );

        scoreText =
                findViewById(
                        R.id.scoreText
                );

        percentageText =
                findViewById(
                        R.id.percentageText
                );

        resultMessage =
                findViewById(
                        R.id.resultMessage
                );

        unlockMessage =
                findViewById(
                        R.id.unlockMessage
                );

        nextLevelButton =
                findViewById(
                        R.id.nextLevelButton
                );

        retryButton =
                findViewById(
                        R.id.retryButton
                );

        backToLevelsButton =
                findViewById(
                        R.id.backToLevelsButton
                );

        // ==========================================
        // SharedPreferences
        // ==========================================

        preferences =
                getSharedPreferences(
                        "PrimePuzzlesProgress",
                        MODE_PRIVATE
                );

        // ==========================================
        // Calculate Percentage
        // ==========================================

        int percentage = 0;

        if (totalQuestions > 0) {

            percentage =
                    (score * 100) / totalQuestions;
        }

        // ==========================================
        // Mark Daily Challenge Completed
        // ==========================================

        if (isDailyChallenge) {

            String todayDate =
                    getTodayDate();

            String dailyCompletedKey =
                    "DAILY_COMPLETED_" + todayDate;

            preferences
                    .edit()
                    .putBoolean(
                            dailyCompletedKey,
                            true
                    )
                    .apply();
        }

        // ==========================================
        // Display Score
        // ==========================================

        scoreText.setText(
                score + " / " + totalQuestions
        );

        // ==========================================
        // Display Percentage
        // ==========================================

        percentageText.setText(
                percentage + "%"
        );

        // ==========================================
        // Display Category & Level
        // ==========================================

        if (isDailyChallenge) {

            resultCategory.setText(
                    "Daily Challenge • "
                            + category
            );

        } else {

            resultCategory.setText(
                    category
                            + " • Level "
                            + level
            );
        }

        // ==========================================
        // Save Statistics
        // ==========================================

        saveQuizStatistics();

        // ==========================================
        // Check Pass / Fail
        // ==========================================

        boolean passed =
                percentage >= 60;

        if (passed) {

            showPassedResult();

        } else {

            showFailedResult();
        }

        // ==========================================
        // Retry Button
        // ==========================================

        retryButton.setOnClickListener(v -> {

            // --------------------------------------
            // Do NOT allow Daily Challenge retry
            // --------------------------------------

            if (isDailyChallenge) {

                return;
            }

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

            intent.putExtra(
                    "DAILY_CHALLENGE",
                    false
            );

            startActivity(intent);

            finish();
        });

        // ==========================================
        // Back Button
        // ==========================================

        backToLevelsButton.setOnClickListener(v -> {

            if (isDailyChallenge) {

                // ------------------------------
                // Daily Challenge → Home
                // ------------------------------

                Intent intent =
                        new Intent(
                                ResultActivity.this,
                                MainActivity.class
                        );

                intent.setFlags(
                        Intent.FLAG_ACTIVITY_CLEAR_TOP |
                                Intent.FLAG_ACTIVITY_SINGLE_TOP
                );

                startActivity(intent);

                finish();

            } else {

                // ------------------------------
                // Normal Level → Levels
                // ------------------------------

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
            }
        });
    }


    // ==============================================
    // PASSED RESULT
    // ==============================================

    private void showPassedResult() {

        resultTitle.setText(
                "🎉 Excellent!"
        );

        resultMessage.setText(
                getPerformanceMessage()
        );

        // ==========================================
        // DAILY CHALLENGE
        // ==========================================

        if (isDailyChallenge) {

            unlockMessage.setVisibility(
                    View.VISIBLE
            );

            unlockMessage.setText(
                    "🏆 Daily Challenge Completed!"
            );

            // --------------------------------------
            // No Next Level
            // --------------------------------------

            nextLevelButton.setVisibility(
                    View.GONE
            );

            // --------------------------------------
            // Disable Retry
            // --------------------------------------

            retryButton.setVisibility(
                    View.GONE
            );

            // --------------------------------------
            // Change Back Button Text
            // --------------------------------------

            backToLevelsButton.setText(
                    "BACK TO HOME"
            );

            return;
        }

        // ==========================================
        // NORMAL LEVEL
        // ==========================================

        // Save completed level

        String completedKey =
                category
                        + "_LEVEL_"
                        + level
                        + "_COMPLETED";

        preferences
                .edit()
                .putBoolean(
                        completedKey,
                        true
                )
                .apply();

        // ==========================================
        // Check Final Level
        // ==========================================

        if (level < 6) {

            int nextLevel =
                    level + 1;

            // --------------------------------------
            // Unlock Next Level
            // --------------------------------------

            String unlockKey =
                    category
                            + "_LEVEL_"
                            + nextLevel;

            preferences
                    .edit()
                    .putBoolean(
                            unlockKey,
                            true
                    )
                    .apply();

            // --------------------------------------
            // Display Unlock Message
            // --------------------------------------

            unlockMessage.setVisibility(
                    View.VISIBLE
            );

            unlockMessage.setText(
                    "🔓 Level "
                            + nextLevel
                            + " Unlocked!"
            );

            // --------------------------------------
            // Show Next Level Button
            // --------------------------------------

            nextLevelButton.setVisibility(
                    View.VISIBLE
            );

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

                intent.putExtra(
                        "DAILY_CHALLENGE",
                        false
                );

                startActivity(intent);

                finish();
            });

        } else {

            // ======================================
            // Final Level Completed
            // ======================================

            unlockMessage.setVisibility(
                    View.VISIBLE
            );

            unlockMessage.setText(
                    "🏆 Congratulations! "
                            + "You completed all levels!"
            );

            nextLevelButton.setVisibility(
                    View.GONE
            );
        }
    }


    // ==============================================
    // FAILED RESULT
    // ==============================================

    private void showFailedResult() {

        resultTitle.setText(
                "Keep Trying! 💪"
        );

        // ==========================================
        // DAILY CHALLENGE
        // ==========================================

        if (isDailyChallenge) {

            resultMessage.setText(
                    "You completed today's "
                            + "Daily Challenge!"
            );

            unlockMessage.setVisibility(
                    View.VISIBLE
            );

            unlockMessage.setText(
                    "🏆 Daily Challenge Completed!"
            );

            // --------------------------------------
            // No Retry
            // --------------------------------------

            retryButton.setVisibility(
                    View.GONE
            );

            // --------------------------------------
            // No Next Level
            // --------------------------------------

            nextLevelButton.setVisibility(
                    View.GONE
            );

            // --------------------------------------
            // Back To Home
            // --------------------------------------

            backToLevelsButton.setText(
                    "BACK TO HOME"
            );

            return;
        }

        // ==========================================
        // NORMAL LEVEL FAILED
        // ==========================================

        resultMessage.setText(
                "You need at least 60% "
                        + "to unlock the next level."
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


    // ==============================================
    // PERFORMANCE MESSAGE
    // ==============================================

    private String getPerformanceMessage() {

        if (totalQuestions <= 0) {

            return "Quiz completed!";
        }

        int percentage =
                (score * 100) / totalQuestions;

        if (percentage == 100) {

            return "🔥 Perfect Score! "
                    + "Amazing work!";

        } else if (percentage >= 80) {

            return "🌟 Excellent performance! "
                    + "Keep going!";

        } else if (percentage >= 60) {

            return "👍 Great job! "
                    + "You passed the level!";

        } else {

            return "Keep practicing "
                    + "and try again!";
        }
    }


    // ==============================================
    // GET TODAY'S DATE
    // ==============================================

    private String getTodayDate() {

        Calendar calendar =
                Calendar.getInstance();

        int year =
                calendar.get(Calendar.YEAR);

        int month =
                calendar.get(Calendar.MONTH) + 1;

        int day =
                calendar.get(Calendar.DAY_OF_MONTH);

        return year
                + "-"
                + month
                + "-"
                + day;
    }


    // ==============================================
    // SAVE QUIZ STATISTICS
    // ==============================================

    private void saveQuizStatistics() {

        // ==========================================
        // Total Quizzes
        // ==========================================

        int totalQuizzes =
                preferences.getInt(
                        "TOTAL_QUIZZES",
                        0
                );

        totalQuizzes++;

        preferences
                .edit()
                .putInt(
                        "TOTAL_QUIZZES",
                        totalQuizzes
                )
                .apply();

        // ==========================================
        // Calculate Percentage
        // ==========================================

        int percentage = 0;

        if (totalQuestions > 0) {

            percentage =
                    (score * 100)
                            / totalQuestions;
        }

        // ==========================================
        // Previous Best Score
        // ==========================================

        int bestScore =
                preferences.getInt(
                        "BEST_SCORE",
                        0
                );

        // ==========================================
        // Save New Best Score
        // ==========================================

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
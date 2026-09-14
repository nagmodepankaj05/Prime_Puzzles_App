package com.example.primepuzzles.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

public class StatsActivity extends AppCompatActivity {

    private ImageButton backButton;

    private TextView totalQuizzesText;
    private TextView bestScoreText;
    private TextView completedLevelsText;

    private TextView upscProgressText;
    private TextView mpscProgressText;
    private TextView upscPercentageText;
    private TextView mpscPercentageText;

    private TextView upscCurrentLevelText;
    private TextView mpscCurrentLevelText;
    private ProgressBar upscProgressBar;
    private ProgressBar mpscProgressBar;

    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_stats);


        // SharedPreferences
        preferences =
                getSharedPreferences(
                        "PrimePuzzlesProgress",
                        MODE_PRIVATE
                );


        // Find views
        backButton =
                findViewById(R.id.backButton);

        totalQuizzesText =
                findViewById(R.id.totalQuizzesText);

        bestScoreText =
                findViewById(R.id.bestScoreText);

        completedLevelsText =
                findViewById(R.id.completedLevelsText);

        upscProgressText =
                findViewById(R.id.upscProgressText);

        mpscProgressText =
                findViewById(R.id.mpscProgressText);

        upscProgressBar =
                findViewById(R.id.upscProgressBar);

        mpscProgressBar =
                findViewById(R.id.mpscProgressBar);

        upscPercentageText =
                findViewById(R.id.upscPercentageText);

        mpscPercentageText =
                findViewById(R.id.mpscPercentageText);

        upscCurrentLevelText =
                findViewById(R.id.upscCurrentLevelText);

        mpscCurrentLevelText =
                findViewById(R.id.mpscCurrentLevelText);

        // Back button
        backButton.setOnClickListener(v -> {
            finish();
        });


        // Display statistics
        displayStatistics();
    }


    @Override
    protected void onResume() {
        super.onResume();

        if (preferences != null) {
            displayStatistics();
        }
    }


    // =================================
    // DISPLAY STATISTICS
    // =================================

    private void displayStatistics() {

        // Total quizzes
        int totalQuizzes =
                preferences.getInt(
                        "TOTAL_QUIZZES",
                        0
                );


        // Best score
        int bestScore =
                preferences.getInt(
                        "BEST_SCORE",
                        0
                );


        // Completed levels
        int totalCompletedLevels =
                getTotalCompletedLevels();


        totalQuizzesText.setText(
                String.valueOf(totalQuizzes)
        );


        bestScoreText.setText(
                bestScore + "%"
        );


        completedLevelsText.setText(
                totalCompletedLevels + " / 12"
        );

        // Category progress
        updateCategoryProgress(
                "UPSC",
                upscProgressText,
                upscProgressBar,
                upscPercentageText,
                upscCurrentLevelText
        );

        updateCategoryProgress(
                "MPSC",
                mpscProgressText,
                mpscProgressBar,
                mpscPercentageText,
                mpscCurrentLevelText
        );
    }


    // =================================
    // COUNT COMPLETED LEVELS
    // =================================

    private int getTotalCompletedLevels() {

        int count = 0;


        // Check all categories currently
        // used by the app
        String[] categories = {
                "UPSC",
                "MPSC"
        };


        for (String category : categories) {

            for (int level = 1; level <= 6; level++) {

                String key =
                        category
                                + "_LEVEL_"
                                + level
                                + "_COMPLETED";


                if (preferences.getBoolean(
                        key,
                        false
                )) {

                    count++;
                }
            }
        }


        return count;
    }


    // =================================
    // CATEGORY PROGRESS
    // =================================

    private void updateCategoryProgress(
            String category,
            TextView progressText,
            ProgressBar progressBar,
            TextView percentageText,
            TextView currentLevelText) {

        int completed = 0;

        for (int level = 1; level <= 6; level++) {

            String key =
                    category
                            + "_LEVEL_"
                            + level
                            + "_COMPLETED";

            if (preferences.getBoolean(
                    key,
                    false
            )) {
                completed++;
            }
        }

        int percentage =
                (completed * 100) / 6;

        progressText.setText(
                completed + " / 6 levels completed"
        );

        percentageText.setText(
                percentage + "%"
        );

        progressBar.setProgress(
                completed
        );

        int currentLevel = 1;

        for (int level = 1; level <= 6; level++) {

            String completedKey =
                    category
                            + "_LEVEL_"
                            + level
                            + "_COMPLETED";

            if (preferences.getBoolean(
                    completedKey,
                    false
            )) {
                currentLevel = level + 1;
            } else {
                break;
            }
        }

        if (currentLevel > 6) {

            currentLevelText.setText(
                    "🏆 All 6 levels completed!"
            );

        } else {

            currentLevelText.setText(
                    "🔓 Current Level: "
                            + currentLevel
            );
        }
    }
}
package com.example.primepuzzles.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

import java.util.Calendar;

public class DailyChallengeActivity extends AppCompatActivity {

    private ImageButton backButton;

    private TextView dateText;
    private TextView categoryText;
    private TextView levelText;
    private TextView statusText;

    private Button startButton;

    private SharedPreferences preferences;

    private String todayDate;

    private String dailyCategory;
    private int dailyLevel;

    private final String[] categories = {
            "General Knowledge",
            "Computer & Technology",
            "Science",
            "History",
            "Sports",
            "UPSC",
            "MPSC"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_daily_challenge);

        // ==========================================
        // SharedPreferences
        // ==========================================

        preferences = getSharedPreferences(
                "PrimePuzzlesProgress",
                MODE_PRIVATE
        );

        // ==========================================
        // Find Views
        // ==========================================

        backButton = findViewById(R.id.backButton);

        dateText = findViewById(R.id.dateText);
        categoryText = findViewById(R.id.categoryText);
        levelText = findViewById(R.id.levelText);
        statusText = findViewById(R.id.statusText);

        startButton = findViewById(R.id.startButton);

        // ==========================================
        // Get Today's Date
        // ==========================================

        todayDate = getTodayDate();

        // ==========================================
        // Generate Today's Challenge
        // ==========================================

        generateDailyChallenge();

        // ==========================================
        // Display Today's Challenge
        // ==========================================

        dateText.setText(
                "Today's Challenge • " + todayDate
        );

        categoryText.setText(
                dailyCategory
        );

        levelText.setText(
                "Level " + dailyLevel + " • 10 Questions"
        );

        // ==========================================
        // Check If Today's Challenge Is Completed
        // ==========================================

        boolean completed = preferences.getBoolean(
                "DAILY_COMPLETED_" + todayDate,
                false
        );

        if (completed) {

            // --------------------------------------
            // Already Completed
            // --------------------------------------

            statusText.setText(
                    "✅ Completed for today!"
            );

            startButton.setText(
                    "COMPLETED"
            );

            startButton.setEnabled(false);

            startButton.setAlpha(0.5f);

        } else {

            // --------------------------------------
            // Not Completed
            // --------------------------------------

            statusText.setText(
                    "🎯 Complete today's challenge!"
            );

            startButton.setText(
                    "START CHALLENGE"
            );

            startButton.setEnabled(true);

            startButton.setAlpha(1.0f);

            startButton.setOnClickListener(v -> {

                // ==================================
                // Double Check Completion
                // ==================================

                boolean alreadyCompleted =
                        preferences.getBoolean(
                                "DAILY_COMPLETED_" + todayDate,
                                false
                        );

                if (alreadyCompleted) {

                    statusText.setText(
                            "✅ You already completed today's challenge!"
                    );

                    startButton.setText(
                            "COMPLETED"
                    );

                    startButton.setEnabled(false);

                    startButton.setAlpha(0.5f);

                    return;
                }

                // ==================================
                // Start Daily Challenge
                // ==================================

                Intent intent = new Intent(
                        DailyChallengeActivity.this,
                        QuizActivity.class
                );

                intent.putExtra(
                        "CATEGORY",
                        dailyCategory
                );

                intent.putExtra(
                        "LEVEL",
                        dailyLevel
                );

                intent.putExtra(
                        "DAILY_CHALLENGE",
                        true
                );

                startActivity(intent);
            });
        }

        // ==========================================
        // Back Button
        // ==========================================

        backButton.setOnClickListener(v -> {
            finish();
        });
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

        return year + "-" + month + "-" + day;
    }

    // ==============================================
    // GENERATE DAILY CHALLENGE
    // ==============================================

    private void generateDailyChallenge() {

        Calendar calendar =
                Calendar.getInstance();

        int dayOfYear =
                calendar.get(Calendar.DAY_OF_YEAR);

        int year =
                calendar.get(Calendar.YEAR);

        /*
         * Use the current date to generate
         * a predictable challenge.
         *
         * Same date = same challenge.
         * New date = new challenge.
         */

        int categoryIndex =
                (dayOfYear + year) % categories.length;

        int level =
                (dayOfYear % 6) + 1;

        dailyCategory =
                categories[categoryIndex];

        dailyLevel =
                level;
    }
}
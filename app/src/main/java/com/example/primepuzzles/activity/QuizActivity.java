package com.example.primepuzzles.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.Question;
import com.example.primepuzzles.QuestionBank;
import com.example.primepuzzles.R;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView quizCategory;
    private TextView quizLevel;
    private TextView questionCounter;
    private TextView questionText;
    private TextView scoreText;
    private SharedPreferences preferences;
    private TextView optionA;
    private TextView optionB;
    private TextView optionC;
    private TextView optionD;

    private TextView timerText;

    private Button nextButton;
    private Button fiftyFiftyButton;
    private Button skipButton;
    private Button audienceButton;
    private ImageButton backButton;
    private ProgressBar questionProgress;

    private CountDownTimer countDownTimer;
    private Vibrator vibrator;

    private static final long QUESTION_TIME = 30000;

    private List<Question> questions;

    private int currentQuestion = 0;
    private int score = 0;
    private int points = 0;

    private int selectedAnswer = 0;

    private String selectedCategory;
    private int selectedLevel;

    private SharedPreferences settingsPreferences;

    private boolean soundEnabled;
    private boolean vibrationEnabled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_quiz);


        preferences = getSharedPreferences(
                "PrimePuzzlesProgress",
                MODE_PRIVATE
        );

        vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        // =========================================
        // GET CATEGORY AND LEVEL
        // =========================================

        selectedCategory =
                getIntent().getStringExtra("CATEGORY");

        selectedLevel =
                getIntent().getIntExtra("LEVEL", 1);


        // =========================================
        // FIND VIEWS
        // =========================================

        quizCategory = findViewById(R.id.quizCategory);
        quizLevel = findViewById(R.id.quizLevel);
        scoreText = findViewById(R.id.scoreText);
        questionCounter = findViewById(R.id.questionCounter);
        questionText = findViewById(R.id.questionText);

        optionA = findViewById(R.id.optionA);
        optionB = findViewById(R.id.optionB);
        optionC = findViewById(R.id.optionC);
        optionD = findViewById(R.id.optionD);

        timerText = findViewById(R.id.timerText);

        nextButton = findViewById(R.id.nextButton);
        backButton = findViewById(R.id.backButton);

        questionProgress =
                findViewById(R.id.questionProgress);

        fiftyFiftyButton = findViewById(R.id.fiftyFiftyButton);
        skipButton = findViewById(R.id.skipButton);
        audienceButton = findViewById(R.id.audienceButton);

        // =========================================
        // DISPLAY CATEGORY
        // =========================================

        if (selectedCategory != null) {
            quizCategory.setText(selectedCategory);
        }

        quizLevel.setText("Level " + selectedLevel);


        // =========================================
        // LOAD QUESTIONS
        // =========================================

        questions =
                QuestionBank.getQuestions(
                        selectedCategory,
                        selectedLevel
                );


        // =========================================
        // CHECK QUESTIONS
        // =========================================

        if (questions == null || questions.isEmpty()) {

            Toast.makeText(
                    QuizActivity.this,
                    "Questions for this level are coming soon.",
                    Toast.LENGTH_LONG
            ).show();

            finish();

            return;
        }


        // =========================================
        // SHOW FIRST QUESTION
        // =========================================

        showQuestion();


        // =========================================
        // OPTION CLICK LISTENERS
        // =========================================

        optionA.setOnClickListener(v ->
                selectAnswer(1)
        );

        optionB.setOnClickListener(v ->
                selectAnswer(2)
        );

        optionC.setOnClickListener(v ->
                selectAnswer(3)
        );

        optionD.setOnClickListener(v ->
                selectAnswer(4)
        );


        // =========================================
        // NEXT BUTTON
        // =========================================

        nextButton.setOnClickListener(v -> {

            if (selectedAnswer == 0) {

                Toast.makeText(
                        QuizActivity.this,
                        "Please select an answer",
                        Toast.LENGTH_SHORT
                ).show();

                return;
            }

            moveToNextQuestion();

        });


        // =========================================
        // BACK BUTTON
        // =========================================

        backButton.setOnClickListener(v -> {

            if (countDownTimer != null) {
                countDownTimer.cancel();
            }

            finish();

        });

        fiftyFiftyButton.setOnClickListener(v -> {

            useFiftyFifty();

        });

        skipButton.setOnClickListener(v -> {

            skipQuestion();

        });
        audienceButton.setOnClickListener(v -> {

            showAudiencePoll();

        });
        loadSettings();
    }

    private void loadSettings() {

        settingsPreferences = getSharedPreferences(
                "PrimePuzzlesProgress",
                MODE_PRIVATE
        );

        soundEnabled = settingsPreferences.getBoolean(
                "SOUND_ENABLED",
                true
        );

        vibrationEnabled = settingsPreferences.getBoolean(
                "VIBRATION_ENABLED",
                true
        );
    }

    // =============================================
    // START TIMER
    // =============================================

    private void startTimer() {

        // Cancel previous timer
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }


        countDownTimer =
                new CountDownTimer(
                        QUESTION_TIME,
                        1000
                ) {

                    @Override
                    public void onTick(long millisUntilFinished) {

                        long seconds =
                                millisUntilFinished / 1000;

                        timerText.setText(
                                String.valueOf(seconds)
                        );

                    }


                    @Override
                    public void onFinish() {

                        timerText.setText("0");

                        // Time-up sound
                        playTimeoutSound();

                        // Strong vibration
                        vibrate(500);

                        Toast.makeText(
                                QuizActivity.this,
                                "Time's up!",
                                Toast.LENGTH_SHORT
                        ).show();

                        // Automatically move to next question
                        moveToNextQuestion();

                    }

                };


        countDownTimer.start();

    }

    private void useFiftyFifty() {

        if (fiftyFiftyButton.isEnabled() == false) {
            return;
        }

        Question current = questions.get(currentQuestion);

        int correctAnswer = current.getCorrectAnswer();

        int removed = 0;

        if (correctAnswer != 1 && removed < 2) {
            optionA.setEnabled(false);
            optionA.setAlpha(0.3f);
            removed++;
        }

        if (correctAnswer != 2 && removed < 2) {
            optionB.setEnabled(false);
            optionB.setAlpha(0.3f);
            removed++;
        }

        if (correctAnswer != 3 && removed < 2) {
            optionC.setEnabled(false);
            optionC.setAlpha(0.3f);
            removed++;
        }

        if (correctAnswer != 4 && removed < 2) {
            optionD.setEnabled(false);
            optionD.setAlpha(0.3f);
            removed++;
        }

        fiftyFiftyButton.setEnabled(false);
        fiftyFiftyButton.setAlpha(0.5f);
    }

    private void unlockNextLevel() {

        // Calculate percentage
        int percentage =
                (score * 100) / questions.size();

        // Unlock only if score is 60% or more
        if (percentage >= 60) {

            // Current level + 1
            int nextLevel = selectedLevel + 1;

            // There are only 6 levels
            if (nextLevel <= 6) {

                String key =
                        selectedCategory + "_LEVEL_" + nextLevel;

                preferences.edit()
                        .putBoolean(key, true)
                        .apply();
            }
        }
    }

    private void skipQuestion() {

        if (!skipButton.isEnabled()) {
            return;
        }

        // Stop current timer
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        // Move to next question
        currentQuestion++;

        // More questions available
        if (currentQuestion < questions.size()) {

            selectedAnswer = 0;

            // Disable skip after using it
            skipButton.setEnabled(false);
            skipButton.setAlpha(0.5f);

            // Show next question
            showQuestion();

            // Update score display
            updateScoreDisplay();

        }

        // No more questions
        else {
            unlockNextLevel();

            Intent intent = new Intent(
                    QuizActivity.this,
                    ResultActivity.class
            );

            intent.putExtra(
                    "CATEGORY",
                    selectedCategory
            );

            intent.putExtra(
                    "LEVEL",
                    selectedLevel
            );

            intent.putExtra(
                    "SCORE",
                    score
            );

            intent.putExtra(
                    "TOTAL",
                    questions.size()
            );

            intent.putExtra(
                    "POINTS",
                    points
            );

            startActivity(intent);

            finish();
        }
    }

    private void showAudiencePoll() {

        if (!audienceButton.isEnabled()) {
            return;
        }

        Question current = questions.get(currentQuestion);

        int correctAnswer = current.getCorrectAnswer();

        int[] percentages = generatePoll(correctAnswer);

        String message =
                "A: " + percentages[0] + "%\n" +
                        "B: " + percentages[1] + "%\n" +
                        "C: " + percentages[2] + "%\n" +
                        "D: " + percentages[3] + "%";

        new androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("📊 Audience Poll")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();

        audienceButton.setEnabled(false);
        audienceButton.setAlpha(0.5f);
    }

    private int[] generatePoll(int correctAnswer) {

        int[] percentages = new int[4];

        int correctPercentage = 45 + (int) (Math.random() * 26);

        int remaining = 100 - correctPercentage;

        percentages[correctAnswer - 1] = correctPercentage;

        int first = (int) (Math.random() * (remaining + 1));

        int second =
                (int) (Math.random() * (remaining - first + 1));

        int third =
                remaining - first - second;

        int index = 0;

        for (int i = 0; i < 4; i++) {

            if (i == correctAnswer - 1) {
                continue;
            }

            if (index == 0) {
                percentages[i] = first;
            } else if (index == 1) {
                percentages[i] = second;
            } else {
                percentages[i] = third;
            }

            index++;
        }

        return percentages;
    }
    // =============================================
    // MOVE TO NEXT QUESTION
    // =============================================

    private void moveToNextQuestion() {

        // Stop timer
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }


        // Move to next question
        currentQuestion++;


        // =========================================
        // MORE QUESTIONS AVAILABLE
        // =========================================

        if (currentQuestion < questions.size()) {

            selectedAnswer = 0;

            showQuestion();
            updateScoreDisplay();
        }


        // =========================================
        // QUIZ FINISHED
        // =========================================

        else {

            Intent intent =
                    new Intent(
                            QuizActivity.this,
                            ResultActivity.class
                    );


            intent.putExtra(
                    "CATEGORY",
                    selectedCategory
            );


            intent.putExtra(
                    "LEVEL",
                    selectedLevel
            );


            // Number of correct answers
            intent.putExtra(
                    "SCORE",
                    score
            );


            // Total questions
            intent.putExtra(
                    "TOTAL",
                    questions.size()
            );


            // Total points
            intent.putExtra(
                    "POINTS",
                    points
            );


            startActivity(intent);

            finish();

        }

    }


    // =============================================
    // SHOW QUESTION
    // =============================================

    private void showQuestion() {

        Question question =
                questions.get(currentQuestion);


        // =========================================
        // QUESTION COUNTER
        // =========================================

        questionCounter.setText(
                (currentQuestion + 1)
                        + " / "
                        + questions.size()
        );


        // =========================================
        // PROGRESS BAR
        // =========================================

        questionProgress.setMax(
                questions.size()
        );


        questionProgress.setProgress(
                currentQuestion + 1
        );


        // =========================================
        // QUESTION
        // =========================================

        questionText.setText(
                question.getQuestion()
        );


        // =========================================
        // OPTIONS
        // =========================================

        optionA.setText(
                "A. " + question.getOptionA()
        );

        optionB.setText(
                "B. " + question.getOptionB()
        );

        optionC.setText(
                "C. " + question.getOptionC()
        );

        optionD.setText(
                "D. " + question.getOptionD()
        );


        // =========================================
        // RESET OPTIONS
        // =========================================

        resetOptions();

        selectedAnswer = 0;


        // =========================================
        // NEXT / FINISH BUTTON
        // =========================================

        if (currentQuestion ==
                questions.size() - 1) {

            nextButton.setText("FINISH");

        } else {

            nextButton.setText("NEXT");

        }


        // =========================================
        // START TIMER
        // =========================================

        startTimer();

    }

    private void updateScoreDisplay() {

        scoreText.setText(
                "⭐ Points: " + points
        );

    }

    // =============================================
    // SELECT ANSWER
    // =============================================

    private void selectAnswer(int answer) {

        // Prevent selecting another answer
        if (selectedAnswer != 0) {
            return;
        }

        selectedAnswer = answer;

        // Stop timer
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        Question question =
                questions.get(currentQuestion);

        int correctAnswer =
                question.getCorrectAnswer();


        // =========================================
        // CORRECT ANSWER
        // =========================================

        if (answer == correctAnswer) {

            score++;

            points += 10;
            updateScoreDisplay();

            showCorrectAnswer(answer);

            // Sound
            playCorrectSound();

            // Vibration
            vibrate(100);

            Toast.makeText(
                    QuizActivity.this,
                    "Correct! +10 points",
                    Toast.LENGTH_SHORT
            ).show();

        }

        // =========================================
        // WRONG ANSWER
        // =========================================

        else {

            showWrongAnswer(
                    answer,
                    correctAnswer
            );

            // Sound
            playWrongSound();

            // Vibration
            vibrate(250);

            Toast.makeText(
                    QuizActivity.this,
                    "Wrong answer!",
                    Toast.LENGTH_SHORT
            ).show();

        }


        // Disable all options
        disableOptions();

    }

    private void showCorrectAnswer(int answer) {

        TextView selectedOption = getOptionView(answer);

        if (selectedOption != null) {

            selectedOption.setBackgroundResource(
                    R.drawable.pp_card_correct
            );

            selectedOption.animate()
                    .scaleX(1.05f)
                    .scaleY(1.05f)
                    .setDuration(150)
                    .start();
        }
    }
    private TextView getOptionView(int answer) {

        if (answer == 1) {
            return optionA;
        }

        if (answer == 2) {
            return optionB;
        }

        if (answer == 3) {
            return optionC;
        }

        if (answer == 4) {
            return optionD;
        }

        return null;
    }

    private void showWrongAnswer(
            int selectedAnswer,
            int correctAnswer
    ) {

        TextView wrongOption =
                getOptionView(selectedAnswer);

        TextView correctOption =
                getOptionView(correctAnswer);


        // Wrong answer
        if (wrongOption != null) {

            wrongOption.setBackgroundResource(
                    R.drawable.pp_card_wrong
            );

            // Shake animation
            wrongOption.animate()
                    .translationX(15)
                    .setDuration(70)
                    .withEndAction(() -> {

                        wrongOption.animate()
                                .translationX(-15)
                                .setDuration(70)
                                .withEndAction(() -> {

                                    wrongOption.animate()
                                            .translationX(0)
                                            .setDuration(70)
                                            .start();

                                })
                                .start();

                    })
                    .start();
        }


        // Correct answer
        if (correctOption != null) {

            correctOption.setBackgroundResource(
                    R.drawable.pp_card_correct
            );
        }
    }

    private void disableOptions() {

        optionA.setEnabled(false);
        optionB.setEnabled(false);
        optionC.setEnabled(false);
        optionD.setEnabled(false);

    }

    // =============================================
    // RESET OPTIONS
    // =============================================

    private void resetOptions() {

        optionA.setBackgroundResource(R.drawable.pp_card);
        optionB.setBackgroundResource(R.drawable.pp_card);
        optionC.setBackgroundResource(R.drawable.pp_card);
        optionD.setBackgroundResource(R.drawable.pp_card);

        // Reset animations
        optionA.setTranslationX(0);
        optionB.setTranslationX(0);
        optionC.setTranslationX(0);
        optionD.setTranslationX(0);

        optionA.setScaleX(1f);
        optionA.setScaleY(1f);

        optionB.setScaleX(1f);
        optionB.setScaleY(1f);

        optionC.setScaleX(1f);
        optionC.setScaleY(1f);

        optionD.setScaleX(1f);
        optionD.setScaleY(1f);

        // Enable options
        optionA.setEnabled(true);
        optionB.setEnabled(true);
        optionC.setEnabled(true);
        optionD.setEnabled(true);

        optionA.setAlpha(1.0f);
        optionB.setAlpha(1.0f);
        optionC.setAlpha(1.0f);
        optionD.setAlpha(1.0f);

        optionA.setBackgroundTintList(null);
        optionB.setBackgroundTintList(null);
        optionC.setBackgroundTintList(null);
        optionD.setBackgroundTintList(null);

    }


    // =============================================
// VIBRATION
// =============================================

    private void vibrate(long duration) {

        if (!vibrationEnabled) {
            return;
        }

        if (vibrator == null) {
            return;
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            vibrator.vibrate(
                    VibrationEffect.createOneShot(
                            duration,
                            VibrationEffect.DEFAULT_AMPLITUDE
                    )
            );

        } else {

            vibrator.vibrate(duration);
        }
    }


// =============================================
// CORRECT SOUND
// =============================================

    private void playCorrectSound() {

        if (!soundEnabled) {
            return;
        }

        MediaPlayer mediaPlayer =
                MediaPlayer.create(
                        this,
                        R.raw.correct
                );

        if (mediaPlayer != null) {

            mediaPlayer.setOnCompletionListener(mp -> {
                mp.release();
            });

            mediaPlayer.start();
        }
    }


// =============================================
// WRONG SOUND
// =============================================

    private void playWrongSound() {

        if (!soundEnabled) {
            return;
        }

        MediaPlayer mediaPlayer =
                MediaPlayer.create(
                        this,
                        R.raw.wrong
                );

        if (mediaPlayer != null) {

            mediaPlayer.setOnCompletionListener(mp -> {
                mp.release();
            });

            mediaPlayer.start();
        }
    }


// =============================================
// TIMEOUT SOUND
// =============================================

    private void playTimeoutSound() {

        if (!soundEnabled) {
            return;
        }

        MediaPlayer mediaPlayer =
                MediaPlayer.create(
                        this,
                        R.raw.timeout
                );

        if (mediaPlayer != null) {

            mediaPlayer.setOnCompletionListener(mp -> {
                mp.release();
            });

            mediaPlayer.start();
        }
    }

    // =============================================
    // ACTIVITY DESTROY
    // =============================================

    @Override
    protected void onDestroy() {

        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        super.onDestroy();

    }

}
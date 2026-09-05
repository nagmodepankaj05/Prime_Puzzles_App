package com.example.primepuzzles.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

public class CategoryActivity extends AppCompatActivity {

    private ImageButton backButton;

    private LinearLayout generalKnowledgeCard;
    private LinearLayout computerCard;
    private LinearLayout scienceCard;
    private LinearLayout historyCard;
    private LinearLayout sportsCard;
    private LinearLayout upscCard;
    private LinearLayout mpscCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_category);

        // Find views
        backButton = findViewById(R.id.backButton);

        generalKnowledgeCard = findViewById(R.id.generalKnowledgeCard);
        computerCard = findViewById(R.id.computerCard);
        scienceCard = findViewById(R.id.scienceCard);
        historyCard = findViewById(R.id.historyCard);
        sportsCard = findViewById(R.id.sportsCard);
        upscCard = findViewById(R.id.upscCard);
        mpscCard = findViewById(R.id.mpscCard);

        // Back button
        backButton.setOnClickListener(v -> {
            finish();
        });


        // General Knowledge
        generalKnowledgeCard.setOnClickListener(v -> {

            openLevelScreen("General Knowledge");

        });


        // Computer & Technology
        computerCard.setOnClickListener(v -> {

            openLevelScreen("Computer & Technology");

        });


        // Science
        scienceCard.setOnClickListener(v -> {

            openLevelScreen("Science");

        });


        // History
        historyCard.setOnClickListener(v -> {

            openLevelScreen("History");

        });


        // Sports
        sportsCard.setOnClickListener(v -> {

            openLevelScreen("Sports");

        });


        // UPSC
        upscCard.setOnClickListener(v -> {

            openLevelScreen("UPSC");

        });


        // MPSC
        mpscCard.setOnClickListener(v -> {

            openLevelScreen("MPSC");

        });
    }


    private void openLevelScreen(String category) {

        Intent intent = new Intent(
                CategoryActivity.this,
                LevelActivity.class
        );

        intent.putExtra("CATEGORY", category);

        startActivity(intent);
    }
}
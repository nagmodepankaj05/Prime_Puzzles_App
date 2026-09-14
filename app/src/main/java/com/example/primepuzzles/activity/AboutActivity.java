package com.example.primepuzzles.activity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

public class AboutActivity extends AppCompatActivity {

    private ImageButton backButton;
    private TextView versionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);

        backButton = findViewById(R.id.backButton);
        versionText = findViewById(R.id.versionText);

        // App version
        versionText.setText("Version 1.0");

        // Back button
        backButton.setOnClickListener(v -> {
            finish();
        });
    }
}
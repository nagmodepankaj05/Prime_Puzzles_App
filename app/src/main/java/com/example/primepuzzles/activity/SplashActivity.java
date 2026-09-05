package com.example.primepuzzles.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.primepuzzles.R;

public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        ImageView logoImage = findViewById(R.id.logoImage);

        // Initial state of logo
        logoImage.setAlpha(0f);
        logoImage.setScaleX(0.7f);
        logoImage.setScaleY(0.7f);

        // Logo animation
        logoImage.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(1000)
                .setInterpolator(new AccelerateDecelerateInterpolator())
                .start();

        // Open Home Screen after 2.5 seconds
        new Handler().postDelayed(() -> {

            Intent intent = new Intent(
                    SplashActivity.this,
                    MainActivity.class
            );

            startActivity(intent);

            finish();

        }, SPLASH_DURATION);
    }
}
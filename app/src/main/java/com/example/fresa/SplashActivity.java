package com.example.fresa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
<<<<<<< HEAD
=======

>>>>>>> origin/master
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}
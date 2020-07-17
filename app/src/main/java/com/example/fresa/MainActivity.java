package com.example.fresa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        Objects.requireNonNull(getSupportActionBar()).hide();
=======

        Objects.requireNonNull(getSupportActionBar()).hide();

>>>>>>> origin/master
    }
}
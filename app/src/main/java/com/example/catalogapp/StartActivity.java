package com.example.catalogapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.catalogapp.authentication.UserRegisterActivity;

public class StartActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button btn = findViewById(R.id.buttonstart);

        btn.setOnClickListener(v -> startActivity(new Intent(this, UserRegisterActivity.class)));
    }
}
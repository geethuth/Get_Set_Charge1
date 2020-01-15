package com.example.getsetcharge1.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.getsetcharge1.R;

public class pickupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);
        getSupportActionBar().hide();
    }
}

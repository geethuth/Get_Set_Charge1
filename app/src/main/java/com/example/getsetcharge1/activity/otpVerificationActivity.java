package com.example.getsetcharge1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.getsetcharge1.R;

public class otpVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        getSupportActionBar().hide();
    }

    public void homeMethod(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }
}

package com.example.getsetcharge1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.getsetcharge1.R;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        getSupportActionBar().hide();

    }


    public void pickupstation(View view) {
        Intent intent = new Intent(this, pickupActivity.class);
        startActivity(intent);
    }


}

package com.example.getsetcharge1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class InitialActivity extends AppCompatActivity {

    Button login, signup;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);
        getSupportActionBar().hide();
        viewFlipper = findViewById(R.id.ViewFlipper);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
    }

    public void login(View view) {
        viewFlipper.showPrevious();
        login.setTextColor(getResources().getColor(R.color.bluegrey));
        login.setBackground(
                ContextCompat.getDrawable(this,
                        R.drawable.white_bg));
        login.setTypeface(Typeface.create("serif", Typeface.BOLD));

        signup.setTextColor(getResources().getColor(R.color.white));
        signup.setBackground(
                ContextCompat.getDrawable(this,
                        R.drawable.blueberry_bg));
        signup.setTypeface(Typeface.create("serif", Typeface.NORMAL));
    }

    public void signup(View view) {
        viewFlipper.showNext();
        login.setTextColor(getResources().getColor(R.color.white));
        login.setBackground(
                ContextCompat.getDrawable(this,
                        R.drawable.blueberry_bg));
        login.setTypeface(Typeface.create("serif", Typeface.NORMAL));

        signup.setTextColor(getResources().getColor(R.color.bluegrey));
        signup.setBackground(
                ContextCompat.getDrawable(this,
                        R.drawable.white_bg));
        signup.setTypeface(Typeface.create("serif", Typeface.BOLD));
    }

    public void homeMethod(View view) {

    }

    public void signupSubmit(View view) {
        viewFlipper.showPrevious();
        login.setTextColor(getResources().getColor(R.color.bluegrey));
        login.setBackground(
                ContextCompat.getDrawable(this,
                        R.drawable.white_bg));
        login.setTypeface(Typeface.create("serif", Typeface.BOLD));

        signup.setTextColor(getResources().getColor(R.color.white));
        signup.setBackground(
                ContextCompat.getDrawable(this,
                        R.drawable.blueberry_bg));
        signup.setTypeface(Typeface.create("serif", Typeface.NORMAL));    }
}

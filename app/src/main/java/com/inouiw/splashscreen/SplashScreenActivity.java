package com.inouiw.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        SplashModule.printToast(SplashScreenActivity.this, "This is my first Module",false);
    }
}

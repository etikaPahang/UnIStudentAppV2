package com.unistudent.app.unistudentappv2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 21/10/2017.
 */

public class SplashActivity extends AppCompatActivity{
    private static int SPLASH_TIME_OUT = 5000;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginOptionintent = new Intent(SplashActivity.this, MenuActivity.class);
                startActivity(loginOptionintent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}

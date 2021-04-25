package com.example.splashscreendemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Duration for splash screen
    private static int SPLASH_SCREEN_TIME_OUT=6000;

    //Variables
    Animation top_animation;
    Animation bottom_animation;
    ImageView mesLogo;
    TextView mesText, imccText;
    TextView bottom_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Start Animations
        top_animation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottom_animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Define Variables
        mesLogo = findViewById(R.id.mesLogo);
        mesText = findViewById(R.id.mesText);
        imccText = findViewById(R.id.imccText);
        bottom_text = findViewById(R.id.bottom_text);

        //Set Animation
        mesLogo.setAnimation(top_animation);
        mesText.setAnimation(top_animation);
        imccText.setAnimation(top_animation);
        bottom_text.setAnimation(bottom_animation);

        //Set Duration for splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this, LoginScreen.class);
                //Intent is used to switch from one activity to another.

                startActivity(i);
                //invoke the SecondActivity.

                finish();
                //the current activity will get finished.
            }
        }, SPLASH_SCREEN_TIME_OUT);
    }
}
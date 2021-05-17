package com.example.splashscreendemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.scwang.wave.MultiWaveHeader;

public class LoginScreen extends AppCompatActivity {

    //Variables
    Animation top_animation;
    ImageView loginLogo;
    ImageView websiteLogo, facebookLogo, instagramLogo;
    TextView newUserText;
    Button loginButton;
    MultiWaveHeader waveHeader, waveFooter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        //Start animation
        top_animation = AnimationUtils.loadAnimation(this, R.anim.top_animation);

        //Define variables
        loginLogo = findViewById(R.id.loginLogo);
        websiteLogo = findViewById(R.id.websiteLogo);
        facebookLogo = findViewById(R.id.facebookLogo);
        instagramLogo = findViewById(R.id.instagramLogo);
        newUserText = findViewById(R.id.newUserText);
        loginButton = findViewById(R.id.loginButton);
        waveHeader = findViewById(R.id.wave_header);
        waveFooter = findViewById(R.id.wave_footer);
        //Set animation
        loginLogo.setAnimation(top_animation);

        //Setting wave animation
        waveHeader = findViewById(R.id.wave_header);
        waveFooter = findViewById(R.id.wave_footer);

        waveHeader.setVelocity(1);
        waveHeader.setProgress(1);
        waveHeader.isRunning();
        waveHeader.setGradientAngle(45);
        waveHeader.setWaveHeight(40);
        waveHeader.setStartColor(Color.RED);
        waveHeader.setCloseColor(Color.CYAN);

        waveFooter.setVelocity(1);
        waveFooter.setProgress(1);
        waveFooter.isRunning();
        waveFooter.setGradientAngle(45);
        waveFooter.setWaveHeight(40);
        waveFooter.setStartColor(Color.MAGENTA);
        waveFooter.setCloseColor(Color.YELLOW);

        //Set onClickListener on Logo ImageViews
        websiteLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://imcc.mespune.in");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }

        });

        facebookLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/imccmes");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }

        });

        instagramLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.instagram.com/mesimcc");
            }

            private void gotoUrl(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }

        });

        //Set onClickListener for Registration on newUserText
        newUserText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Jump on next activity
                startActivity(new Intent(LoginScreen.this, Registration.class));
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginScreen.this,Dashboard.class));
            }
        });

    }
}
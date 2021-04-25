package com.example.splashscreendemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    //Variables
    Animation top_animation;
    ImageView loginLogo;
    ImageView websiteLogo, facebookLogo, instagramLogo;
    TextView newUserText;
    Button loginButton;

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
        //Set animation
        loginLogo.setAnimation(top_animation);

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
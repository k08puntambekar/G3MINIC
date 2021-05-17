package com.example.splashscreendemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.scwang.wave.MultiWaveHeader;

public class Registration extends AppCompatActivity {

    MultiWaveHeader waveHeader, waveFooter;
    ImageView back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        back_arrow = findViewById(R.id.back_arrow);
        waveHeader = findViewById(R.id.wave_header);
        waveFooter = findViewById(R.id.wave_footer);

        //Setting wave animation
        waveHeader.setVelocity(1);
        waveHeader.setProgress(1);
        waveHeader.isRunning();
        waveHeader.setGradientAngle(45);
        waveHeader.setWaveHeight(40);
        waveHeader.setStartColor(Color.MAGENTA);
        waveHeader.setCloseColor(Color.YELLOW);


        waveFooter.setVelocity(1);
        waveFooter.setProgress(1);
        waveFooter.isRunning();
        waveFooter.setGradientAngle(45);
        waveFooter.setWaveHeight(40);
        waveFooter.setStartColor(Color.RED);
        waveFooter.setCloseColor(Color.CYAN);

        back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registration.this, LoginScreen.class));
            }
        });

    }
}
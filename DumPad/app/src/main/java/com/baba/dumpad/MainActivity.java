package com.baba.dumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ButtonId();
         mediaplayar();

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 m1.start();
                 b1.setSoundEffectsEnabled(false);
             }
         });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
                b2.setSoundEffectsEnabled(false);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3.start();
                b3.setSoundEffectsEnabled(false);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m4.start();
                b4.setSoundEffectsEnabled(false);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m5.start();
                b5.setSoundEffectsEnabled(false);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m6.start();
                b6.setSoundEffectsEnabled(false);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m7.start();
                b7.setSoundEffectsEnabled(false);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m8.start();
                b8.setSoundEffectsEnabled(false);
            }
        });

    }

    public void ButtonId(){
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);

    }
    public void mediaplayar(){
        m1=MediaPlayer.create(getApplicationContext(),R.raw.one);
        m2=MediaPlayer.create(getApplicationContext(),R.raw.two);
        m3=MediaPlayer.create(getApplicationContext(),R.raw.three);
        m4=MediaPlayer.create(getApplicationContext(),R.raw.four);
        m5=MediaPlayer.create(getApplicationContext(),R.raw.fv);
        m6=MediaPlayer.create(getApplicationContext(),R.raw.sixth);
        m7=MediaPlayer.create(getApplicationContext(),R.raw.seventh);
        m8=MediaPlayer.create(getApplicationContext(),R.raw.eighth);


    }

    }


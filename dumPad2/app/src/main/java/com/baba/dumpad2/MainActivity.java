package com.baba.dumpad2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    SoundPool soundPool;
    int a=1;
    int b=1;
    int c=1;
    int d=1;
    int e=1;
    int f=1;
    int g=1;
    int h=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonId();
        soundPool = new SoundPool(2,AudioManager.STREAM_MUSIC,0);
         a = soundPool.load(getApplicationContext(),R.raw.one,1);
        b = soundPool.load(getApplicationContext(),R.raw.two,1);
        c = soundPool.load(getApplicationContext(),R.raw.three,1);
        d = soundPool.load(getApplicationContext(),R.raw.four,1);
        e = soundPool.load(getApplicationContext(),R.raw.fv,1);
        f = soundPool.load(getApplicationContext(),R.raw.sixth,1);
        g = soundPool.load(getApplicationContext(),R.raw.seventh,1);
        h = soundPool.load(getApplicationContext(),R.raw.eighth,1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(a,1,0,1,0,0);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(b,1,0,1,0,0);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(c,1,0,1,0,0);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(d,1,0,1,0,0);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(e,1,0,1,0,0);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(f,1,0,1,0,0);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(g,1,0,1,0,0);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(h,1,0,1,0,0);
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

}

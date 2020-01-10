package com.example.silofono;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Do, re, mi, fa, sol, la, si, Doagudo;
    static MediaPlayer mpDo, mpRe, mpMi, mpFa, mpSol, mpLa, mpSi, mpDoagudo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected  void onResume() {
        super.onResume();

        //ASIGNACION DEL SONIDO AL BOTTON DO
        final MediaPlayer mp0 = MediaPlayer.create(this, R.raw.note1);
        Do = (Button)findViewById(R.id.buttonDo);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.note2);
        re = (Button)findViewById(R.id.buttonRE);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.note3);
        mi = (Button)findViewById(R.id.buttonMI);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.note4);
        fa = (Button)findViewById(R.id.buttonFA);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.note5);
        sol = (Button)findViewById(R.id.buttonSOL);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.note6);
        la = (Button)findViewById(R.id.buttonLA);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.note7);
        si = (Button)findViewById(R.id.buttonSI);

        Do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp0.start();
                mp1.start();
                mp2.start();
                mp3.start();
                mp4.start();
                mp5.start();
                mp6.start();


            }
        });



    }
}

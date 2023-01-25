package com.example.feliz_cumple;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.happy_birthday);
        mediaPlayer.start();

        TextView titulo = (TextView) findViewById(R.id.titulo);
        Animation animTitulo = AnimationUtils.loadAnimation(this,R.anim.anim_titulo);
        titulo.startAnimation(animTitulo);

        TextView subtitulo1 = (TextView) findViewById(R.id.subtitulo1);
        TextView subtitulo2 = (TextView) findViewById(R.id.subtitulo2);
        Animation animSubTitulos = AnimationUtils.loadAnimation(this,R.anim.slideup);
        subtitulo1.startAnimation(animSubTitulos);
        subtitulo2.startAnimation(animSubTitulos);
    }
}
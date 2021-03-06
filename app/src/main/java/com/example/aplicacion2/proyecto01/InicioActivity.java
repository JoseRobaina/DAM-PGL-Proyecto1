package com.example.aplicacion2.proyecto01;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageView load = (ImageView) findViewById(R.id.imageViewLoading);
        load.setBackgroundResource(R.drawable.loading);

        AnimationDrawable frameAnimation = (AnimationDrawable) load.getBackground();
        frameAnimation.start();

        Handler handler = new Handler();


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        }, 5000); // 5 segundos de "delay"

    }
}

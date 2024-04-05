package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Splashscreenok extends AppCompatActivity {
    Animation up,down;
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splashscreenok);

        imageView = findViewById(R.id.appsplash);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        imageView.setAnimation(down);


        textView = findViewById(R.id.appname);
        up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        textView.setAnimation(up);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(),MainActivity.class ));

            }
        },3750);
    }
}
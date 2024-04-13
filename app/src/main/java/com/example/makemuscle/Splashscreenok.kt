package com.example.makemuscle

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Splashscreenok : AppCompatActivity() {
    private lateinit var up: Animation
    private lateinit var down: Animation
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreenok)

        imageView = findViewById(R.id.appsplash)
        down = AnimationUtils.loadAnimation(applicationContext, R.anim.down)
        imageView.animation = down

        textView = findViewById(R.id.appname)
        up = AnimationUtils.loadAnimation(applicationContext, R.anim.up)
        textView.animation = up

        Handler().postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }, 3000)
    }
}


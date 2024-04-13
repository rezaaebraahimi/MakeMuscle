package com.example.makemuscle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolBar))

        val buttons = arrayOf<Button>(
            findViewById(R.id.startChest),
            findViewById(R.id.startShoulder),
            findViewById(R.id.startBack),
            findViewById(R.id.startBt),
            findViewById(R.id.startLeg)
        )

        for (button in buttons) {
            button.setOnClickListener(this)
        }
    }

    override fun onClick(v: View) {
        val targetActivity: Class<*>? = when (v.id) {
            R.id.startChest -> ChestActivity::class.java
            R.id.startShoulder -> ShoulderActivity::class.java
            R.id.startBack -> BackActivity::class.java
            R.id.startBt -> BtActivity::class.java
            R.id.startLeg -> LegActivity::class.java
            else -> null
        }

        targetActivity?.let {
            startActivity(Intent(this, it))
        }
    }

    fun food(v: View) {
        startActivity(Intent(this, FoodActivity::class.java))
    }

}
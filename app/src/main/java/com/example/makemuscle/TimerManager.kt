package com.example.makemuscle

import android.content.Context
import android.content.Intent
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView

class TimerManager(
    private val mtextView: TextView,
    private val startBtn: Button,
    private val buttonValue: String,
    private val context: Context
) {
    private var countDownTimer: CountDownTimer? = null
    private var mTimeLeftInMillis: Long = 0
    private var mTimeRunning = false

    fun stopTimer() {
        if (mTimeRunning) {
            countDownTimer?.cancel()
            mTimeRunning = false
            startBtn.text = "Start"
        }
    }

    fun startTimer() {
        countDownTimer?.cancel()

        val value1 = mtextView.text
        val num1 = value1.toString()
        val num2 = num1.substring(0, 2)
        val num3 = num1.substring(3, 5)

        val number = Integer.parseInt(num2) * 60 + Integer.parseInt(num3)
        mTimeLeftInMillis = number * 1000L

        countDownTimer = object : CountDownTimer(mTimeLeftInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                mTimeLeftInMillis = millisUntilFinished
                updateTimer()
            }

            override fun onFinish() {
                var newvalue = buttonValue.toInt() + 1
                if (newvalue <= 7) {
                    val intent = Intent(context, context.javaClass)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    intent.putExtra("value", newvalue.toString())
                    context.startActivity(intent)
                } else {
                    newvalue = 1
                    val intent = Intent(context, context.javaClass)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    intent.putExtra("value", newvalue.toString())
                    context.startActivity(intent)
                }
            }
        }.start()
        startBtn.text = "Pause"
        mTimeRunning = true
    }

    fun isRunning(): Boolean {
        return mTimeRunning
    }

    private fun updateTimer() {
        val minutes = (mTimeLeftInMillis / 1000) / 60
        val seconds = (mTimeLeftInMillis / 1000) % 60

        val timeLeftText = String.format("%02d:%02d", minutes, seconds)
        mtextView.text = timeLeftText
    }
}

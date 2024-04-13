package com.example.makemuscle;

import android.content.Intent;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TimerManager extends AppCompatActivity{
    private CountDownTimer countDownTimer;
    private final TextView mtextView;
    private final Button startBtn;
    private long mTimeLeftInMillis;
    private boolean mTimeRunning;
    private final String buttonValue;

    public TimerManager(TextView textView, Button button, String value) {
        this.mtextView = textView;
        this.startBtn = button;
        this.buttonValue = value;
    }

    public void stopTimer() {
        if (mTimeRunning) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            mTimeRunning = false;
            startBtn.setText("Start");
        }
    }

    public void startTimer() {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        final CharSequence value1 = mtextView.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);

        final int number = Integer.parseInt(num2) * 60 + Integer.parseInt(num3);
        mTimeLeftInMillis = number * 1000L;

        countDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {
                int newvalue = Integer.parseInt(buttonValue) + 1;
                if (newvalue <= 7) {
                    Intent intent = new Intent(getApplicationContext(), getClass());
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value", String.valueOf(newvalue));
                    mtextView.getContext().startActivity(intent);
                } else {
                    newvalue = 1;
                    Intent intent = new Intent(getApplicationContext(), getClass());
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value", String.valueOf(newvalue));
                    mtextView.getContext().startActivity(intent);
                }
            }
        }.start();
        startBtn.setText("Pause");
        mTimeRunning = true;
    }

    public boolean isRunning() {
        return mTimeRunning;
    }

    private void updateTimer() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftText = String.format("%02d:%02d", minutes, seconds);
        mtextView.setText(timeLeftText);
    }
}

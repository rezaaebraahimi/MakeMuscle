package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class BtListActivity extends AppCompatActivity {

    String buttonValue;
    Button startBtn;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimeRunning;
    private long MTimeLeftinmills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        Intent intent = getIntent();
        buttonValue = intent.getStringExtra("value");


        int intValue = Integer.parseInt(buttonValue);

        switch (intValue){

            case 1:
                setContentView(R.layout.activity_declinebicep);
                break;
            case 2:
                setContentView(R.layout.activity_hammercurls);
                break;
            case 3:
                setContentView(R.layout.activity_overheadtriceps);
                break;
            case 4:
                setContentView(R.layout.activity_frenchpress);
                break;
        }

        startBtn = findViewById(R.id.startSet);
        mtextview = findViewById(R.id.time);

        startBtn.setOnClickListener(v -> {
            if(MTimeRunning){
                stopTimer();

            }
            else {

                startTimer();
            }
        });

    }

    private void stopTimer(){

        countDownTimer.cancel();
        MTimeRunning=false;
        startBtn.setText("Start");
    }

    private void startTimer() {

        final CharSequence value1 = mtextview.getText();
        String num1 = value1.toString();
        String num2 = num1.substring(0,2);
        String num3 = num1.substring(3,5);

        final int number = Integer.parseInt(num2) * 60+ Integer.parseInt(num3);
        MTimeLeftinmills = number *1000L;

        countDownTimer = new CountDownTimer(MTimeLeftinmills, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                MTimeLeftinmills = millisUntilFinished;
                updateTimer();

            }

            @Override
            public void onFinish() {

                int newvalue = Integer.parseInt(buttonValue) + 1;
                if (newvalue <= 7){

                    Intent intent = new Intent(BtListActivity.this, BtListActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value", String.valueOf(newvalue));
                    startActivity(intent);

                }

                else {
                    newvalue = 1;
                    Intent intent = new Intent(BtListActivity.this, BtListActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value", String.valueOf(newvalue));
                    startActivity(intent);

                }
            }
        }.start();
        startBtn.setText("Pause");
        MTimeRunning=true;

    }


    private void updateTimer(){


        int minutes = (int) MTimeLeftinmills/60000;
        int second = (int) MTimeLeftinmills%60000 /1000;

        String timeLeftText="";
        if (minutes<10)
            timeLeftText="0";
        timeLeftText = timeLeftText+minutes+":";
        if (second<10)
            timeLeftText+="0";
        timeLeftText+=second;
        mtextview.setText(timeLeftText);

    }


    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
}

package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class ChestListActivity extends AppCompatActivity {
    String buttonValue;
    Button startBtn;
    TextView mtextview;
    private TimerManager timerManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        Intent intent = getIntent();
        buttonValue = intent.getStringExtra("value");
        int intValue = Integer.parseInt(buttonValue);

        switch (intValue){

            case 1:
                setContentView(R.layout.activity_flatchest);
                break;
            case 2:
                setContentView(R.layout.activity_inclinechest);
                break;
            case 3:
                setContentView(R.layout.activity_flatchestfly);
                break;
            case 4:
                setContentView(R.layout.activity_inclinechestfly);
                break;
        }


        startBtn = findViewById(R.id.startSet);
        mtextview = findViewById(R.id.time);
        timerManager = new TimerManager(mtextview, startBtn,buttonValue,ChestListActivity.this);


        startBtn.setOnClickListener(v -> {
            if(timerManager.isRunning()){
                timerManager.stopTimer();
            }
            else {

                timerManager.startTimer();
            }
        });
    }


    @Override
    public void onBackPressed() {


        super.onBackPressed();
    }
}
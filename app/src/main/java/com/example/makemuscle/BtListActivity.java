package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class BtListActivity extends AppCompatActivity {

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
        timerManager = new TimerManager(mtextview, startBtn,buttonValue,BtListActivity.this);

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

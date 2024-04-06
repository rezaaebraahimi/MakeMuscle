package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class ShoulderListActivity extends AppCompatActivity {

    String buttonValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_shoulder_list);

        Intent intent = getIntent();
        buttonValue = intent.getStringExtra("value");

        int intValue = Integer.valueOf(buttonValue);

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


    }
}
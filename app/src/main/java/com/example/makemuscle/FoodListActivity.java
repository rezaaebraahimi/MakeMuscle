package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FoodListActivity extends AppCompatActivity {

    String buttonValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        buttonValue = intent.getStringExtra("value");
        int intValue = Integer.parseInt(buttonValue);

        switch (intValue){

            case 1:
                setContentView(R.layout.activity_tip1);
                break;
            case 2:
                setContentView(R.layout.activity_tip2);
                break;
            case 3:
                setContentView(R.layout.activity_tip3);
                break;
            case 4:
                setContentView(R.layout.activity_tip4);
                break;
            case 5:
                setContentView(R.layout.activity_tip6);
                break;
            case 6:
                setContentView(R.layout.activity_tip7);
                break;

        }
    }
}
package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BackListActivity extends AppCompatActivity {

    String buttonValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_back_list);


        Intent intent = getIntent();
        buttonValue = intent.getStringExtra("value");

        int intValue = Integer.valueOf(buttonValue);

        switch (intValue){

            case 1:
                setContentView(R.layout.activity_armrow);
                break;
            case 2:
                setContentView(R.layout.activity_uprightrow);
                break;
            case 3:
                setContentView(R.layout.activity_bentoverrow);
                break;
            case 4:
                setContentView(R.layout.activity_shrugs);
                break;
        }

    }
}
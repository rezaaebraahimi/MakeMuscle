package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        LinearLayout tip1 = findViewById(R.id.tip1);
        LinearLayout tip2 = findViewById(R.id.tip2);
        LinearLayout tip3 = findViewById(R.id.tip3);
        LinearLayout tip4 = findViewById(R.id.tip4);
        LinearLayout tip6 = findViewById(R.id.tip6);
        LinearLayout tip7 = findViewById(R.id.tip7);

        tip1.setOnClickListener(v -> {
            Intent intent = new Intent(FoodActivity.this, Tip1Activity.class);
            startActivity(intent);
        });

        tip2.setOnClickListener(v -> {
            Intent intent = new Intent(FoodActivity.this, Tip2Activity.class);
            startActivity(intent);
        });

        tip3.setOnClickListener(v -> {
            Intent intent = new Intent(FoodActivity.this, Tip3Activity.class);
            startActivity(intent);
        });

        tip4.setOnClickListener(v -> {
            Intent intent = new Intent(FoodActivity.this, Tip4Activity.class);
            startActivity(intent);
        });

        tip6.setOnClickListener(v -> {
            Intent intent = new Intent(FoodActivity.this, Tip6Activity.class);
            startActivity(intent);
        });

        tip7.setOnClickListener(v -> {
            Intent intent = new Intent(FoodActivity.this, Tip7Activity.class);
            startActivity(intent);
        });
    }
}

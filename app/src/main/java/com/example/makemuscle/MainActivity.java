package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }


    public void food(View v){
        Intent  intent = new Intent(MainActivity.this,FoodActivity.class);
        startActivity(intent);

    }

    public void chestWork(View v){
        Intent  intent = new Intent(MainActivity.this,ChestActivity.class);
        startActivity(intent);

    }

    public void shoulderWork(View v){
        Intent  intent = new Intent(MainActivity.this,ShoulderActivity.class);
        startActivity(intent);

    }

    public void backWork(View v){
        Intent  intent = new Intent(MainActivity.this,BackActivity.class);
        startActivity(intent);

    }

    public void btWork(View v){
        Intent  intent = new Intent(MainActivity.this,BtActivity.class);
        startActivity(intent);

    }

    public void legWork(View v){
        Intent  intent = new Intent(MainActivity.this,LegActivity.class);
        startActivity(intent);

    }

}
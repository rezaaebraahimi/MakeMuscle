package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {


    Button button1,button2,button3,button4,button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        button1 = findViewById(R.id.startChest);
        button2 = findViewById(R.id.startShoulder);
        button3 = findViewById(R.id.startBack);
        button4 = findViewById(R.id.startBt);
        button5 = findViewById(R.id.startLeg);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChestActivity.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ShoulderActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BackActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BtActivity.class);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LegActivity.class);
                startActivity(intent);
            }
        });


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
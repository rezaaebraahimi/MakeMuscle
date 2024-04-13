package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class FoodActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.tip1, R.id.tip2, R.id.tip3, R.id.tip4, R.id.tip6, R.id.tip7
        };

    }


    public void imageButtonClicked(View view){
        for (int i=0; i< newArray.length; i++){
            if (view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(FoodActivity.this,FoodListActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }

        }

    }
}

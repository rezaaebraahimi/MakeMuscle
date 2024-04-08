package com.example.makemuscle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class BackActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_back);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);



        newArray = new int[]{
                R.id.armRow,R.id.uprightRow,R.id.bentOverRow,R.id.shrugs
        };

    }


    public void imageButtonClicked(View view){
        for (int i=0; i< newArray.length; i++){
            if (view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(BackActivity.this,BackListActivity.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }

        }

    }
}
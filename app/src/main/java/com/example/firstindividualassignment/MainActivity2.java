package com.example.firstindividualassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String data1 = intent.getStringExtra("Name and id");
        TextView textData1 = findViewById(R.id.textDisplayinfo);
        textData1.setText(data1);
        String data2 = intent.getStringExtra("Experience info");
        TextView textData2 = findViewById(R.id.textDisplayinfo2);
        textData2.setText(data2);



    }
}
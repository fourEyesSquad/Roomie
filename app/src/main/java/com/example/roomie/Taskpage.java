package com.example.roomie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Taskpage extends AppCompatActivity {

    RecyclerView rvTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taskpage);
        rvTask = findViewById(R.id.rvTweet);
    }
}
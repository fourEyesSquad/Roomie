package com.example.roomie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


// TODO: We need to be clear whether to extend AppCompatActivity or ParseObject in Task. ParseObject type is required for ParseApplication line 13.

public class Task extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
    }
}
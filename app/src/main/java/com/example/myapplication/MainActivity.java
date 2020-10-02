package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      button btnClick ;
      do
        String a = findViewById(editTextTextPersonName);
        Toast.makeText(this, "Con me em", Toast.LENGTH_SHORT).show();
    }
}
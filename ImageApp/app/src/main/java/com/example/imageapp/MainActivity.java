package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void newCat(View view){

        Log.i("Test ","Button Clicked");

        ImageView image =(ImageView) findViewById(R.id.pen1id);
        image.setImageResource(R.drawable.peng2);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
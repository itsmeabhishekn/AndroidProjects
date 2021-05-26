package com.example.rupeeconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void usdToInr(View view){

        EditText usdAmount = (EditText) findViewById(R.id.usdId);
        Log.i("amount recieved,it is =", usdAmount.getText().toString());
        Double usdDouble = Double.parseDouble(String.valueOf(usdAmount.getText()));
        double inrAmount = usdDouble * 72.88 ;
        Toast.makeText(MainActivity.this,"र"+inrAmount, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
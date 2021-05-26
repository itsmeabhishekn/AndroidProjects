package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void loginClicked(View view){
        EditText uname = (EditText) findViewById(R.id.uname);
        EditText pswd =(EditText) findViewById(R.id.pswd);

        Toast.makeText(MainActivity.this,uname.getText().toString()+" , your login is succesfull",Toast.LENGTH_LONG).show();
        Log.i("user name = ",uname.getText().toString());
        Log.i("password =",pswd.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
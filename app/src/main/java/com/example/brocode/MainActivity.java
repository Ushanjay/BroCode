package com.example.brocode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void opensecond(View view) {
        Intent intent =new Intent( this,MainActivity2.class);
        startActivity(intent);
    }

    public void openthird(View view) {
        Intent intent =new Intent( this,MainActivity3.class);
        startActivity(intent);
    }
}
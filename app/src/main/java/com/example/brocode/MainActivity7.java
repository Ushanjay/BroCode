package com.example.brocode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void opensecond(View view) {
        Intent intent =new Intent( this,MainActivity8.class);
        startActivity(intent);
    }

    public void openthird(View view) {
        Intent intent =new Intent( this,MainActivity9.class);
        startActivity(intent);
    }

    public void openfourth(View view) {
        Intent intent =new Intent( this,MainActivity3.class);
        startActivity(intent);
    }
}
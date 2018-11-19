package com.example.dm3_2_08.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void camareroClick(View view){
        Intent intent = new Intent(this, CamareroActivity.class);
        startActivity(intent);
    }
}

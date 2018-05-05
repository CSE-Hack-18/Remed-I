package com.example.dergham.er;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent myintent = new Intent (MainActivity.this,RegistersActivity.class);


           MainActivity.this.startActivity(myintent);
    }
}

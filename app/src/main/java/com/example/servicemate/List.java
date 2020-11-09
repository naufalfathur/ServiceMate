package com.example.servicemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class List extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().hide();
        RelativeLayout app_layer = (RelativeLayout) findViewById (R.id.linearLayoutFN);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, Payment.class));
            }
        });

        LinearLayout app_layer2 = (LinearLayout) findViewById (R.id.paid);
        app_layer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(List.this, MainActivity.class));
            }
        });

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                findViewById(R.id.linearLayoutFN).setVisibility(View.VISIBLE);
                findViewById(R.id.linearLayoutFN2).setVisibility(View.VISIBLE);
                findViewById(R.id.linearLayoutFN3).setVisibility(View.VISIBLE);
                findViewById(R.id.linearLayoutFN4).setVisibility(View.VISIBLE);
                findViewById(R.id.titlea).setVisibility(View.VISIBLE);
                findViewById(R.id.price).setVisibility(View.VISIBLE);
                findViewById(R.id.price2).setVisibility(View.VISIBLE);
                findViewById(R.id.wait).setVisibility(View.INVISIBLE);
                findViewById(R.id.progressBar).setVisibility(View.INVISIBLE);
            }
        },3000);
    }
}
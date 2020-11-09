package com.example.servicemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class partspaid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partspaid);
        getSupportActionBar().hide();
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.Layouthome);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(partspaid.this, MainActivity.class));
            }
        });
    }
}
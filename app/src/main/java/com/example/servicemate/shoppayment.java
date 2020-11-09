package com.example.servicemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class shoppayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppayment);
        getSupportActionBar().hide();
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.paid);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(shoppayment.this, "Payment Successful", Toast.LENGTH_LONG).show();
                startActivity(new Intent(shoppayment.this, partspaid.class));
            }
        });
    }
}
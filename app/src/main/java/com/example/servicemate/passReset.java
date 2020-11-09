package com.example.servicemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.servicemate.ui.login.LoginActivity;

public class passReset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_reset);
        getSupportActionBar().hide();
        Button button = (Button)findViewById(R.id.fPass);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(passReset.this, "Email Sent", Toast.LENGTH_LONG).show();
                Intent intent =new Intent(passReset.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
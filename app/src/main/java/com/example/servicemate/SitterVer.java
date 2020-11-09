package com.example.servicemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.servicemate.ui.login.LoginActivity;

public class SitterVer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitter_ver);
        getSupportActionBar().hide();
    }
    public void gotoMain(View view) {
        startActivity(new Intent(SitterVer.this, LoginActivity.class));
    }
}
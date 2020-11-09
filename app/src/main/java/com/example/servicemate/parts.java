package com.example.servicemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class parts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parts);
        getSupportActionBar().hide();
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.paid);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(parts.this, shoppayment.class));
            }
        });

    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_pirates:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.radio_ninjas:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.radio_ninjas2:
                if (checked)
                    // Ninjas rule
                    break;
        }
    }
        public void onRadioButtonClicked2(View view) {
            // Is the button now checked?
            boolean checked2 = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_pirates2:
                    if (checked2)
                        // Pirates are the best
                        break;
                case R.id.radio_ninjas3:
                    if (checked2)
                        // Ninjas rule
                        break;
                case R.id.radio_ninjas4:
                    if (checked2)
                        // Ninjas rule
                        break;
            }
    }
}
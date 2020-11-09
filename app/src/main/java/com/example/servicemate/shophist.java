package com.example.servicemate;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class shophist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shophist);
        getSupportActionBar().hide();
        LinearLayout app_layer = (LinearLayout) findViewById (R.id.paid);
        app_layer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(shophist.this, MainActivity.class));
            }
        });
        Button closeButton = (Button) findViewById(R.id.cancel);
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Uncomment the below code to Set the message and title from the strings.xml file
                builder.setMessage("a") .setTitle("a");

                //Setting message manually and performing action on button click
                builder.setMessage("Do you want to cancel ? (This action must be final)")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                LinearLayout layout = findViewById(R.id.first);
// Gets the layout params that will allow you to resize the layout
                                ViewGroup.LayoutParams params = layout.getLayoutParams();
// Changes the height and width to the specified *pixels*
                                params.height = 0;
                                layout.setLayoutParams(params);
                                Toast.makeText(shophist.this, "Buy cancelled", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Alert");
                alert.show();
            }
        });
    }

    public void cancel(View view) {
        LinearLayout layout = findViewById(R.id.first);
// Gets the layout params that will allow you to resize the layout
        ViewGroup.LayoutParams params = layout.getLayoutParams();
// Changes the height and width to the specified *pixels*
        params.height = 0;
        layout.setLayoutParams(params);
        Toast.makeText(shophist.this, "Buy cancelled", Toast.LENGTH_SHORT).show();
    }
}
package com.example.servicemate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class SitterRegister extends AppCompatActivity {
    private static int RESULT_LOAD_IMAGE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitter_register);
        getSupportActionBar().hide();
        final LinearLayout app_layer2 = (LinearLayout) findViewById (R.id.linearLayout);
        Button button = (Button)findViewById(R.id.testing);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                RelativeLayout.LayoutParams parameter = (RelativeLayout.LayoutParams) app_layer2.getLayoutParams();
                parameter.setMargins(0,0,0,0); // left, top, right, bottom
                app_layer2.setLayoutParams(parameter);
                findViewById(R.id.testing).setVisibility(View.INVISIBLE);
                findViewById(R.id.testing1).setVisibility(View.INVISIBLE);
            }
        });
        Button buttonLoadImage = (Button) findViewById(R.id.buttonLoadID);
        buttonLoadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });
        Button buttonLoadImage2 = (Button) findViewById(R.id.buttonLoadCV);
        buttonLoadImage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });
    }
    public void gotoMain(View view) {
        startActivity(new Intent(SitterRegister.this, SitterVer.class));
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();


        }


    }
}
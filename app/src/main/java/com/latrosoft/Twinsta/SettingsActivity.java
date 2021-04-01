package com.latrosoft.Twinsta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.latrosoft.Twinsta.Models.Status;
import com.latrosoft.Twinsta.Utils.Common;


public class SettingsActivity extends AppCompatActivity {

    private ImageView mImageView;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_activity);
        mImageView= (ImageView)findViewById(R.id.back);
        mEditText=(EditText) findViewById(R.id.path);

        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });




    }

}

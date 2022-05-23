package com.example.myactivitiesandintentsapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public abstract class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
//        textView = findViewById(com.google.android.material.R.id.text);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String str = editText.getText().toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(str));
            startActivity(intent);

            }
        });
    }
}





package com.example.visitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button bttn,bttn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bttn=(Button) findViewById(R.id.btn);
        bttn2=(Button) findViewById(R.id.btn2);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1 = new Intent(getApplicationContext(), AddActivity.class);
                startActivity(ob1);
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob3 = new Intent(getApplicationContext(), ViewAllActivity.class);
                startActivity(ob3);
            }
        });

    }
}
package com.example.visitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1,b2;
    String getFname,getLname,getPurpose,getWhom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        e1=(EditText) findViewById(R.id.et1);
        e2=(EditText) findViewById(R.id.et2);
        e3=(EditText) findViewById(R.id.et3);
        e4=(EditText) findViewById(R.id.et4);
        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFname=e1.getText().toString();
                getLname=e2.getText().toString();
                getPurpose=e3.getText().toString();
                getWhom=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getFname+getLname+getPurpose+getWhom,Toast.LENGTH_LONG).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);
            }
        });

    }
}
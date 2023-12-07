package com.example.rssispy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private Button eBPFbutton;
    private Button Scanbutton;
    private Button Aboutbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eBPFbutton = findViewById(R.id.eBPFbt);
        eBPFbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,eBPF.class);
                startActivity(intent);
            }
        });
        Scanbutton = findViewById(R.id.Scanbt);
        Scanbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Scan.class);
                startActivity(intent);
            }
        });
        Aboutbutton = findViewById(R.id.Aboutbt);
        Aboutbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,About.class);
                startActivity(intent);
            }
        });
    }
}
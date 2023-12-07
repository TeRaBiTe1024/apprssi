package com.example.rssispy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Scan extends AppCompatActivity {
    private Button Homebutton;
    private Button scanRead;
    private EditText scant;
    public String read_scan()
    {
        return "ScaNNNN RSSI";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan);
        Homebutton = findViewById(R.id.homesc);
        scant = findViewById(R.id.Scantext);
        scanRead = findViewById(R.id.Scanreadbt);
        Homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scan.this,MainActivity.class);
                startActivity(intent);
            }
        });
        scanRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scant.setText(read_scan());
            }
        });

    }
}
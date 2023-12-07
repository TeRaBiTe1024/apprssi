package com.example.rssispy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class eBPF extends AppCompatActivity {
    private Button Homebutton;
    private Button eBPFRead;
    private EditText ebpft;
    public String read_ebpf()
    {
        return "ScaNNNN";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebpf);
        Homebutton = findViewById(R.id.Homeebpf);
        ebpft = findViewById(R.id.eBPFtext);
        Homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(eBPF.this,MainActivity.class);
                startActivity(intent);
            }
        });
        eBPFRead = findViewById(R.id.ReadeBPF);
        eBPFRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ebpft.setText(read_ebpf());
            }
        });
    }
}

package com.ncr.vk185201assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen4 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);

        textView=findViewById(R.id.application);
        String data=getIntent().getStringExtra("data");
        textView.setText(data);
    }
}
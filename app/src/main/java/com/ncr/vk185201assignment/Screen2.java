package com.ncr.vk185201assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Screen2 extends AppCompatActivity {
    EditText qualification;
    EditText percentage;
    EditText college;
    Button next1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        qualification=findViewById(R.id.qualification);
        percentage=findViewById(R.id.percentage);
        college=findViewById(R.id.college);
        next1=findViewById(R.id.next1);

       String data=getIntent().getStringExtra("data");
        //Toast.makeText(this, data.toString(), Toast.LENGTH_SHORT).show();
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Screen2.this,Screen3.class);
                intent.putExtra("data",data+"\n"+"Qualification :"+qualification.getText().toString()+"\n"+"Percentage  :"+percentage.getText().toString()+"\n"+"College    :"+college.getText().toString()+"\n"
                        );
                startActivity(intent);
            }
        });

    }
}
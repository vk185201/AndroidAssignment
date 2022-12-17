package com.ncr.vk185201assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Screen3 extends AppCompatActivity {
    EditText skills;
    Button next2;
    CheckBox checkBox;
    CheckBox android;
    CheckBox csharp;
    String skill1,skill2,skill3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        skills=findViewById(R.id.skills);
        next2=findViewById(R.id.next2);
        checkBox=(CheckBox) findViewById(R.id.checkBox);
        android=(CheckBox) findViewById(R.id.android);
        csharp=(CheckBox) findViewById(R.id.csharp);

        String data=getIntent().getStringExtra("data");
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked())
                    skill1="Java";
            }
        });
        csharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(csharp.isChecked())
                    skill3="Csharp";
            }
        });
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(android.isChecked())
                    skill2="Android";
            }
        });
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Screen3.this,Screen4.class);
                intent.putExtra("data",data+"SkillSet  :" + skill1+","+skill2+","+skill3+","+skills.getText().toString()+"\n");
                startActivity(intent);
            }
        });

    }
}
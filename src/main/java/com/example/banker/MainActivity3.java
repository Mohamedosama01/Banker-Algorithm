package com.example.banker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button b3 = findViewById(R.id.button3);
        Intent intent = getIntent();
        int s1 = intent.getIntExtra("value1", 0);
        int s2 = intent.getIntExtra("value2", 0);
        int s3 = intent.getIntExtra("value3", 0);
        int s4 = intent.getIntExtra("value4", 0);
        int s5 = intent.getIntExtra("value5", 0);
        int s6 = intent.getIntExtra("value6", 0);
        int s7 = intent.getIntExtra("value7", 0);
        int s8 = intent.getIntExtra("value8", 0);
        int s9 = intent.getIntExtra("value9", 0);
        int s10 = intent.getIntExtra("value10", 0);
        int s11 = intent.getIntExtra("value11", 0);
        int s12 = intent.getIntExtra("value12", 0);
        int s13 = intent.getIntExtra("value13", 0);
        int s14 = intent.getIntExtra("value14", 0);
        int s15 = intent.getIntExtra("value15", 0);
        int s16 = intent.getIntExtra("value16", 0);
        int s17 = intent.getIntExtra("value17", 0);
        int s18 = intent.getIntExtra("value18", 0);
        int m1 = s10 - s1;
        int m2 = s11 - s2;
        int m3 = s12 - s3;
        int m4 = s13 - s4;
        int m5 = s14 - s5;
        int m6 = s15 - s6;
        int m7 = s16 - s7;
        int m8 = s17 - s8;
        int m9 = s18 - s9;
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p1r1,p1r2,p1r3,p2r1,p2r2,p2r3,p3r1,p3r2,p3r3;
                EditText e1 = findViewById(R.id.edit19);
                EditText e2 = findViewById(R.id.edit20);
                EditText e3 = findViewById(R.id.edit21);
                EditText e4 = findViewById(R.id.edit22);
                EditText e5 = findViewById(R.id.edit23);
                EditText e6 = findViewById(R.id.edit24);
                EditText e7 = findViewById(R.id.edit25);
                EditText e8 = findViewById(R.id.edit26);
                EditText e9 = findViewById(R.id.edit27);
                p1r1 = Integer.toString(m1);
                p1r2 = Integer.toString(m2);
                p1r3 = Integer.toString(m3);
                p2r1 = Integer.toString(m4);
                p2r2 = Integer.toString(m5);
                p2r3 = Integer.toString(m6);
                p3r1 = Integer.toString(m7);
                p3r2 = Integer.toString(m8);
                p3r3 = Integer.toString(m9);
                e1.setText(p1r1);
                e2.setText(p1r2);
                e3.setText(p1r3);
                e4.setText(p2r1);
                e5.setText(p2r2);
                e6.setText(p2r3);
                e7.setText(p3r1);
                e8.setText(p3r2);
                e9.setText(p3r3);
            }
        });
        Button b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(MainActivity3.this,MainActivity4.class);
                i3.putExtra("value11",s1);
                i3.putExtra("value22",s2);
                i3.putExtra("value33",s3);
                i3.putExtra("value44",s4);
                i3.putExtra("value55",s5);
                i3.putExtra("value66",s6);
                i3.putExtra("value77",s7);
                i3.putExtra("value88",s8);
                i3.putExtra("value99",s9);
                startActivity(i3);
            }
        });
    }
}
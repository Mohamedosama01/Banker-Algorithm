package com.example.banker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    String p;
    int A1,A2,A3;
    int N1,N2,N3;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        int s1 = intent.getIntExtra("value11", 0);
        int s2 = intent.getIntExtra("value22", 0);
        int s3 = intent.getIntExtra("value33", 0);
        int s4 = intent.getIntExtra("value44", 0);
        int s5 = intent.getIntExtra("value55", 0);
        int s6 = intent.getIntExtra("value66", 0);
        int s7 = intent.getIntExtra("value77", 0);
        int s8 = intent.getIntExtra("value88", 0);
        int s9 = intent.getIntExtra("value99", 0);
        Button b5 = findViewById(R.id.button5);
        Button b6 = findViewById(R.id.button6);
        Button b7 = findViewById(R.id.button7);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p1r1, p1r2, p1r3;
                 e1 = findViewById(R.id.editA1);
                 e2 = findViewById(R.id.editA2);
                 e3 = findViewById(R.id.editA3);
                p1r1 = e1.getText().toString();
                p1r2 = e2.getText().toString();
                p1r3 = e3.getText().toString();
                 A1 = Integer.parseInt(p1r1);
                 A2 = Integer.parseInt(p1r2);
                 A3 = Integer.parseInt(p1r3);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText e1 = findViewById(R.id.editP);
                p = e1.getText().toString();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p1r1, p1r2, p1r3;
                String newA1,newA2,newA3;
                EditText t = findViewById(R.id.editsafe);
                EditText er = findViewById(R.id.error);
                EditText e11 = findViewById(R.id.editN1);
                EditText e22 = findViewById(R.id.editN2);
                EditText e33 = findViewById(R.id.editN3);
                p1r1 = e11.getText().toString();
                p1r2 = e22.getText().toString();
                p1r3 = e33.getText().toString();
                N1 = Integer.parseInt(p1r1);
                N2 = Integer.parseInt(p1r2);
                N3 = Integer.parseInt(p1r3);
                if (p.equals("p1") || p.equals("P1")) {
                    if (N1 <= A1 && N2 <= A2 && N3 <= A3) {
                       A1 = A1 + s1;
                        A2 = A2 + s2;
                        A3 = A3 + s3;
                        newA1 = Integer.toString(A1);
                        newA2 = Integer.toString(A2);
                        newA3 = Integer.toString(A3);
                        e1.setText(newA1);
                        e2.setText(newA2);
                        e3.setText(newA3);
                        t.setText("P1");
                        er.setText(" ");
                    }
                    else
                        er.setText("NO RESOURCES AVAILABLE");
                    //t.setText(" ");
                }
               else if (p.equals("p2") || p.equals("P2")) {
                    if (N1 <= A1 && N2 <= A2 && N3 <= A3) {
                        A1 = A1 + s4;
                        A2 = A2 + s5;
                        A3 = A3 + s6;
                        newA1 = Integer.toString(A1);
                        newA2 = Integer.toString(A2);
                        newA3 = Integer.toString(A3);
                        e1.setText(newA1);
                        e2.setText(newA2);
                        e3.setText(newA3);
                        t.setText("P2");
                        er.setText(" ");
                    } else
                        er.setText("NO RESOURCES AVAILABLE");
                        //t.setText(" ");
                }
                else if (p.equals("p3") || p.equals("P3")) {
                    if (N1 <= A1 && N2 <= A2 && N3 <= A3) {
                        A1 = A1 + s7;
                        A2 = A2 + s8;
                        A3 = A3 + s9;
                        newA1 = Integer.toString(A1);
                        newA2 = Integer.toString(A2);
                        newA3 = Integer.toString(A3);
                        e1.setText(newA1);
                        e2.setText(newA2);
                        e3.setText(newA3);
                        t.setText("P3");
                        er.setText(" ");
                    }
                    else
                        er.setText("NO RESOURCES AVAILABLE");
                    //t.setText(" ");
                }
            }
        });
    }
}
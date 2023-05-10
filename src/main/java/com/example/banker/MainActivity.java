package com.example.banker;

import static com.example.banker.R.*;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String p1r1,p1r2,p1r3,p2r1,p2r2,p2r3,p3r1,p3r2,p3r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Button b1 = findViewById(id.button1);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText e1 = findViewById(id.edit1);
                EditText e2 = findViewById(id.edit2);
                EditText e3 = findViewById(id.edit3);
                EditText e4 = findViewById(id.edit4);
                EditText e5 = findViewById(id.edit5);
                EditText e6 = findViewById(id.edit6);
                EditText e7 = findViewById(id.edit7);
                EditText e8 = findViewById(id.edit8);
                EditText e9 = findViewById(id.edit9);

                p1r1 = e1.getText().toString();
                p1r2 = e2.getText().toString();
                p1r3 = e3.getText().toString();
                p2r1 = e4.getText().toString();
                p2r2 = e5.getText().toString();
                p2r3 = e6.getText().toString();
                p3r1 = e7.getText().toString();
                p3r2 = e8.getText().toString();
                p3r3 = e9.getText().toString();
                int s1 = Integer.parseInt(p1r1);
                int s2 = Integer.parseInt(p1r2);
                int s3 = Integer.parseInt(p1r3);
                int s4 = Integer.parseInt(p2r1);
                int s5 = Integer.parseInt(p2r2);
                int s6 = Integer.parseInt(p2r3);
                int s7 = Integer.parseInt(p3r1);
                int s8 = Integer.parseInt(p3r2);
                int s9 = Integer.parseInt(p3r3);
                Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
                i1.putExtra("value1", s1);
                i1.putExtra("value2", s2);
                i1.putExtra("value3", s3);
                i1.putExtra("value4", s4);
                i1.putExtra("value5", s5);
                i1.putExtra("value6", s6);
                i1.putExtra("value7", s7);
                i1.putExtra("value8", s8);
                i1.putExtra("value9", s9);
                startActivity(i1);
            }
        });







    }


}
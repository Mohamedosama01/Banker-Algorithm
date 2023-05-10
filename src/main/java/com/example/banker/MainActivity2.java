package com.example.banker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ComponentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    String p1r1,p1r2,p1r3,p2r1,p2r2,p2r3,p3r1,p3r2,p3r3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b2 = findViewById(R.id.button2);
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


                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText e1 = findViewById(R.id.edit10);
                EditText e2 = findViewById(R.id.edit11);
                EditText e3 = findViewById(R.id.edit12);
                EditText e4 = findViewById(R.id.edit13);
                EditText e5 = findViewById(R.id.edit14);
                EditText e6 = findViewById(R.id.edit15);
                EditText e7 = findViewById(R.id.edit16);
                EditText e8 = findViewById(R.id.edit17);
                EditText e9 = findViewById(R.id.edit18);

                p1r1 = e1.getText().toString();
                p1r2 = e2.getText().toString();
                p1r3 = e3.getText().toString();
                p2r1 = e4.getText().toString();
                p2r2 = e5.getText().toString();
                p2r3 = e6.getText().toString();
                p3r1 = e7.getText().toString();
                p3r2 = e8.getText().toString();
                p3r3 = e9.getText().toString();
                int s10 = Integer.parseInt(p1r1);
                int s11 = Integer.parseInt(p1r2);
                int s12 = Integer.parseInt(p1r3);
                int s13 = Integer.parseInt(p2r1);
                int s14 = Integer.parseInt(p2r2);
                int s15 = Integer.parseInt(p2r3);
                int s16 = Integer.parseInt(p3r1);
                int s17 = Integer.parseInt(p3r2);
                int s18 = Integer.parseInt(p3r3);
                Intent i2 = new Intent(MainActivity2.this, MainActivity3.class);
                i2.putExtra("value1", s1);
                i2.putExtra("value2", s2);
                i2.putExtra("value3", s3);
                i2.putExtra("value4", s4);
                i2.putExtra("value5", s5);
                i2.putExtra("value6", s6);
                i2.putExtra("value7", s7);
                i2.putExtra("value8", s8);
                i2.putExtra("value9", s9);
                i2.putExtra("value10", s10);
                i2.putExtra("value11", s11);
                i2.putExtra("value12", s12);
                i2.putExtra("value13", s13);
                i2.putExtra("value14", s14);
                i2.putExtra("value15", s15);
                i2.putExtra("value16", s16);
                i2.putExtra("value17", s17);
                i2.putExtra("value18", s18);
                startActivity(i2);
            }
        });






    }


}
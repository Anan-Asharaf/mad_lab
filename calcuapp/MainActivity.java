package com.example.calcuapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    EditText t2;
    EditText t3;
    Button b1,b2,b3,b4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        t1=(EditText)findViewById(R.id.txt1);
        t2=(EditText)findViewById(R.id.txt2);
        t3=(EditText)findViewById(R.id.txt3);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=Double.parseDouble(t1.getText().toString());
                double n2=Double.parseDouble(t2.getText().toString());
                double r1=n1+n2;
                t3.setText(" "+r1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=Double.parseDouble(t1.getText().toString());
                double n2=Double.parseDouble(t2.getText().toString());
                double r1=n1-n2;
                t3.setText(" "+r1);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=Double.parseDouble(t1.getText().toString());
                double n2=Double.parseDouble(t2.getText().toString());
                double r1=n1*n2;
                t3.setText(" "+r1);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1=Double.parseDouble(t1.getText().toString());
                double n2=Double.parseDouble(t2.getText().toString());
                double r1=n1/n2;
                t3.setText(" "+r1);

            }
        });

    }
}



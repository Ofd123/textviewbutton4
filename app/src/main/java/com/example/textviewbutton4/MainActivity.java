package com.example.textviewbutton4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Button btn;
    int num=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textview);
        btn=findViewById(R.id.button);
    }
    public void go(View view){
        num += 1;
        if (num%7==0){
            tv.setText("BOOM!");
        }
        else
        {
            tv.setText("this is click number"+num);
        }
    }
}



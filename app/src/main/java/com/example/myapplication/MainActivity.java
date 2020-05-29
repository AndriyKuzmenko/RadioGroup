package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Switch mySwitch;
    RadioButton rbr, rby, rbg, rbb;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySwitch=(Switch)findViewById(R.id.mySwitch);
        rbr=(RadioButton)findViewById(R.id.rbR);
        rby=(RadioButton)findViewById(R.id.rbY);
        rbg=(RadioButton)findViewById(R.id.rbG);
        rbb=(RadioButton)findViewById(R.id.rbB);
        button=(Button)findViewById(R.id.button);
    }
}
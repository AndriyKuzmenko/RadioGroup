package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Switch mySwitch;
    Button button;
    LinearLayout layout;
    RadioGroup rg;
    int rbR, rbY, rbG, rbB;

    boolean switchState;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySwitch = (Switch) findViewById(R.id.mySwitch);
        button = (Button) findViewById(R.id.button);
        layout=(LinearLayout)findViewById(R.id.layout);
        rg=(RadioGroup)findViewById(R.id.rg);

        rbR=findViewById(R.id.rbR).getId();
        rbY=findViewById(R.id.rbY).getId();
        rbG=findViewById(R.id.rbG).getId();
        rbB=findViewById(R.id.rbB).getId();

        switchState = mySwitch.isChecked();
    }

    public void switchClicked(View view)
    {
        switchState = mySwitch.isChecked();
    }

    public void radioButtonClicked(View view)
    {
        if(!switchState)
        {
            checkRadioButton();
        }
    }

    public void checkRadioButton()
    {
        int id=rg.getCheckedRadioButtonId();
        if (id==rbR) layout.setBackgroundColor(Color.RED);
        else if (id==rbY) layout.setBackgroundColor(Color.YELLOW);
        else if (id==rbG) layout.setBackgroundColor(Color.GREEN);
        else if (id==rbB) layout.setBackgroundColor(Color.BLUE);
    }

    public void buttonClicked(View view)
    {
        if(switchState)
        {
            checkRadioButton();
        }
    }
}
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
    RadioButton rbR, rbY, rbG, rbB;

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

        rbR=(RadioButton)findViewById(R.id.rbR);
        rbY=(RadioButton)findViewById(R.id.rbY);
        rbG=(RadioButton)findViewById(R.id.rbG);
        rbB=(RadioButton)findViewById(R.id.rbB);

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
        if (rbR.isChecked())
        {
            layout.setBackgroundColor(Color.RED);
        }
        else if (rbY.isChecked())
        {
            layout.setBackgroundColor(Color.YELLOW);
        }
        else if (rbG.isChecked())
        {
            layout.setBackgroundColor(Color.GREEN);
        }
        else if (rbB.isChecked())
        {
            layout.setBackgroundColor(Color.BLUE);
        }
    }

    public void buttonClicked(View view)
    {
        if(switchState)
        {
            checkRadioButton();
        }
    }
}
package com.example.question2point1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton cbRed, cbYellow, cbGreen, cbBlue, cbDGrey, cbBPink;
    TextView tvOutput;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbBlue = findViewById(R.id.cb_blue);
        cbRed = findViewById(R.id.cb_red);
        cbGreen = findViewById(R.id.cb_green);
        cbDGrey = findViewById(R.id.cb_darkgrey);
        cbYellow = findViewById(R.id.cb_yellow);
        cbBPink = findViewById(R.id.cb_brightpink);
        radioGroup = findViewById(R.id.radioGroup);
        tvOutput = findViewById(R.id.tv_output);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.cb_blue:

                        tvOutput.setBackgroundColor(getResources().getColor(R.color.ColorBlue));
                        break;
                    case R.id.cb_red:
                        tvOutput.setBackgroundColor(getResources().getColor(R.color.red));
                        break;
                    case R.id.cb_green:
                        tvOutput.setBackgroundColor(getResources().getColor(R.color.ColorGreen));
                        break;
                    case R.id.cb_darkgrey:

                        tvOutput.setBackgroundColor(getResources().getColor(R.color.DarkGrey));
                        break;
                    case R.id.cb_yellow:

                        tvOutput.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                        break;
                    case R.id.cb_brightpink:

                        tvOutput.setBackgroundColor(getResources().getColor(R.color.BrightPink));
                        break;
                }
            }
        });
    }
}
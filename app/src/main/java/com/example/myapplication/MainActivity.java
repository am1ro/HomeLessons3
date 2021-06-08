package com.example.myapplication;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int counter1=1;
    private int counter2=2;
    private int counter3=3;
    private int counter4=4;
    private int counter5=5;
    private int counter6=6;
    private int counter7=7;
    private int counter8=8;
    private int counter9=9;
    private int counter0=0;


    private TextView textCounter1;
    private TextView textCounter2;
    private TextView textCounter3;
    private TextView textCounter4;
    private TextView textCounter5;
    private TextView textCounter6;
    private TextView textCounter7;
    private TextView textCounter8;
    private TextView textCounter9;
    private TextView textCounter0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter1 = findViewById(R.id.textView);
        textCounter2 = findViewById(R.id.textView);
        textCounter3 = findViewById(R.id.textView);
        textCounter4 = findViewById(R.id.textView);
        textCounter5 = findViewById(R.id.textView);
        textCounter6 = findViewById(R.id.textView);
        textCounter7 = findViewById(R.id.textView);
        textCounter8 = findViewById(R.id.textView);
        textCounter9 = findViewById(R.id.textView);
        textCounter0 = findViewById(R.id.textView);
    }

    public void button1_onClick(View view) {
        counter1 = 1;
        textCounter1.setText(String.format(Locale.getDefault(), "%d", counter1));
    }
    public void button2_onClick(View view) {
        counter2 = 2;
        textCounter2.setText(String.format(Locale.getDefault(), "%d", counter2));
    }
    public void button3_onClick(View view) {
        counter3 = 3;
        textCounter3.setText(String.format(Locale.getDefault(), "%d", counter3));
    }
    public void button4_onClick(View view) {
        counter4 = 4;
        textCounter4.setText(String.format(Locale.getDefault(), "%d", counter4));
    }
    public void button5_onClick(View view) {
        counter5 = 5;
        textCounter5.setText(String.format(Locale.getDefault(), "%d", counter5));
    }
    public void button6_onClick(View view) {
        counter6 = 6;
        textCounter6.setText(String.format(Locale.getDefault(), "%d", counter6));
    }
    public void button7_onClick(View view) {
        counter7 = 7;
        textCounter7.setText(String.format(Locale.getDefault(), "%d", counter7));
    }
    public void button8_onClick(View view) {
        counter8 = 8;
        textCounter8.setText(String.format(Locale.getDefault(), "%d", counter8));
    }
    public void button9_onClick(View view) {
        counter9 = 9;
        textCounter9.setText(String.format(Locale.getDefault(), "%d", counter9));
    }
    public void button0_onClick(View view) {
        counter0 = 0;
        textCounter0.setText(String.format(Locale.getDefault(), "%d", counter0));
    }

}

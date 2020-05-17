package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.text);
        mText.setText("Welcome to my first tutorial on android studio");
        mText.setTextColor(getResources().getColor(R.color.colorPrimary));
        mText.setTextSize(Float.parseFloat("12.35"));
    }
}

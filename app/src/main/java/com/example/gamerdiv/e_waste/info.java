package com.example.gamerdiv.e_waste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class info extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        textView= (TextView) findViewById(R.id.textView5);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("inf"));
    }
}

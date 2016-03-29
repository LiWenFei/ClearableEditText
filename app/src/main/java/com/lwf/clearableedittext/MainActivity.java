package com.lwf.clearableedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ClearableEditText clearableEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clearableEditText = (ClearableEditText) findViewById(R.id.clearableEditText);

        clearableEditText.setText("Hello World !");
    }
}

package com.example.pc.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 27-Feb-18.
 */

public class AnonymousAddressActivity extends AppCompatActivity {

    Button wazeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anonnymous_address);

        wazeBtn = (Button) findViewById(R.id.wazeBtn);

    }

    public void onClickWazeStart(View view) {

    }
}

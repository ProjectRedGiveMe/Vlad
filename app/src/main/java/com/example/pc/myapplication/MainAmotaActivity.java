package com.example.pc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainAmotaActivity extends AppCompatActivity {

    Button anonDonationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_amuta);

        anonDonationBtn = (Button)findViewById(R.id.anonDonationBtn);
    }
    //TODO - ask what the anonnymous donation button does
    public void onClickAnonDonation(View view) {
        Intent intent = new Intent(this, MainAnonymousActivity.class);
        startActivity(intent);
    }

    //TODO - ignore till the end
    public void onClickRequirement(View view) {
    }

    public void onClickLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void onClickAmotaCall(View view) {
    }
}

package com.example.pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Evgeni on 24.02.2018.
 */



public class RegisterActivity extends AppCompatActivity {

    Button FinishingRegisterBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        FinishingRegisterBtn = (Button)findViewById(R.id.FinishingRegisterBtn);

    }

    public void onClickFinishingRegister(View view) {
        Intent intent = new Intent(this, ConfirmRegisterActivity.class);
        startActivity(intent);
    }
}

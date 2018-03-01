package com.example.pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class LoginActivity extends AppCompatActivity {

    Button loginBtn, gotoRegisterBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = (Button)findViewById(R.id.loginBtn);
        gotoRegisterBtn = (Button)findViewById(R.id.gotoRegisterBtn);
    }
    //TODO - Method
    public void onClickLogin(View view) {
    }

    public void onClickGoToRegister(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}

package com.example.pc.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by PC on 27-Feb-18.
 */

public class MainAnonymousActivity extends AppCompatActivity {

    Button moneyDonationBtn, selfComingBtn;
    private static final String amotaPhoneNumber = "0548888888";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_anonnymous);



        moneyDonationBtn = (Button) findViewById(R.id.moneyDonationBtn);
        selfComingBtn = (Button) findViewById(R.id.selfComingBtn);

    }

    // Click to dail to the given number(Amota)
    public void onClickMoneyDonationCall(View view) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        // TODO - Check why it only works on the simulator
        callIntent.setData(Uri.parse("tel:" + amotaPhoneNumber));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(callIntent);
    }


    // TODO - How to support the CardView and RecyclerView
    public void onClickSelfComing(View view) {
        Intent intent = new Intent(this, AnonymousAddressActivity.class);
        startActivity(intent);
    }
}

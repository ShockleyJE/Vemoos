package com.shockleyje.vemoos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //boilerplate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    }

    //TODO: wait for mockups from other team to implement
//    public void offerRide(View view){
//        Intent intent = new Intent(this, OfferRideActivity.class);
//        startActivity(intent);
//    }

    //Set up method to switch to finding a ride
    public void findRide(View view){
        Intent intent = new Intent(this, FindRideActivity.class);
        startActivity(intent);
    }
}

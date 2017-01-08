package com.shockleyje.vemoos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.LinkedList;
import java.util.List;

public class FindRideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //boilerplate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ride);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //Set title as appname
        toolbar.setTitle(R.string.app_name);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    //TODO: Implement features in EditText views
    //Clear text when clicked
    //Change text color to black
    //Change text style to regular

    //TODO: Implement searchRides to call search and display results
    public void searchRides(){

    }

    public void Ride(User driver, double price, Location destination, Location origin){

    }

    //returns rides based on destination/ origin parameters
//    private Ride[] search(){
//        List Rides;
//
//        //TODO: search rides and append to list
//        //TODO: sort rides list by relevance
//
//        Ride[] RidesArray = Rides.toArray(new Ride[Rides.size()]);
//        return RidesArray;
//    }

    //TODO: Create recycler view for results
    //Fill with rides leaving from users current city until search



}

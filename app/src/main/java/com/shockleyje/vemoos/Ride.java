package com.shockleyje.vemoos;

/**
 * Created by James on 1/7/2017.
 *
 * TODO: extend class as other classes are developed
 *
 */

public class Ride {

    public User driver;
    public Location destination;
    public Location origin;
    public int capacity;
    public int spotsFilled;
    public int spotsOpen;

    public Ride(User driver,
                Location destination,
                Location origin,
                int capacity,
                int spotsFilled){

        this.driver= driver;
        this.destination= destination;
        this.origin= origin;
        this.capacity= capacity;
        this.spotsFilled= spotsFilled;
        // TODO: add assertions to assure not negative
        this.spotsOpen = capacity - spotsFilled;

    }
}

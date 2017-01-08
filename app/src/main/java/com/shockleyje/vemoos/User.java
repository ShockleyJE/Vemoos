package com.shockleyje.vemoos;

import android.media.Image;

/**
 * Created by James on 1/7/2017.
 *
 * TODO: Extend features of class as needed, eg. identification numbers, associations, etc.
 *
 * TODO: privatize variables
 *
 */

public class User {

    String name;
    Image icon;

    public void User(String name,
                     Image icon){
        this.name = name;
        this.icon = icon;

    }
}

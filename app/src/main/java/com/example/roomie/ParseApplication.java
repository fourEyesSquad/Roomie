package com.example.roomie;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Task.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("97Wf5HjWFcGbfryhEreT7vPd7tPiCMoqiUFJHXCp")
                .clientKey("QQnFitMZ7VJ14Oh4wRg9CLWOVpPBf2uT6uUGKJip")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
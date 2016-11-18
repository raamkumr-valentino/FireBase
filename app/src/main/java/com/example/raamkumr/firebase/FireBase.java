package com.example.raamkumr.firebase;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by RaamKumr on 11/15/2016.
 */
public class FireBase extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}

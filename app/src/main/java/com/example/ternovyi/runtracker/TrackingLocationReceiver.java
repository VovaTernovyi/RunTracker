package com.example.ternovyi.runtracker;

import android.content.Context;
import android.location.Location;
import android.util.Log;

public class TrackingLocationReceiver extends LocationReceiver {
    private static final String TAG = "Location Receiver";

    @Override
    protected void onLocationReceived(Context c, Location loc) {
        RunManager.get(c).insertLocation(loc);
        Log.e(TAG, "Done!");
    }
}

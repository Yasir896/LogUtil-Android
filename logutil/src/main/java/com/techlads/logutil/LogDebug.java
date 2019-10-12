package com.techlads.logutil;

import android.util.Log;

public class LogDebug {


    public static final String TAG = "LOG UTIL Example Library";

    public static void d(String message){
        Log.d(TAG, message);
    }
}

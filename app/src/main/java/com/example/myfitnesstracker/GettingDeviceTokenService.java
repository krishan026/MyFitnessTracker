package com.example.myfitnesstracker;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.ktx.Firebase;

import java.util.Calendar;

public class GettingDeviceTokenService extends FIrebaseInstanceIdService {

    public void onTokenRefresh() {
        Calendar FirebaseInstanceId = null;
        String DeviceToken = String.valueOf(FirebaseInstanceId.getInstance().getTime());
        Log.d("DEVICE TOKEN",DeviceToken);
    }


}
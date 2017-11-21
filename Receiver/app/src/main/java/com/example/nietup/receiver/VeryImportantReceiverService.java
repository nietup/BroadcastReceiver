package com.example.nietup.receiver;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

/**
 * Created by nietup on 11/21/2017.
 */

public class VeryImportantReceiverService extends Service {
    BroadcastReceiver br = new VeryImportantReceiver();

    @Override
    public void onCreate() {
        registerReceiver(br, new IntentFilter("com.example.nietup.broadcaster.VERY_IMPORTANT_MESSAGE"));
    }

    @Override
    public void onDestroy() {
        //unregisterReceiver(br);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

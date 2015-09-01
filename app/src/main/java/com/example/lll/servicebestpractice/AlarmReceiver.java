package com.example.lll.servicebestpractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by LLL on 15/9/1.
 */
public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context,Intent intent) {
        Intent i = new Intent(context,LongRunningService.class);
        context.startService(i);
    }
}

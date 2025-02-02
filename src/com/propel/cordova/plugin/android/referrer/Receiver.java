package com.propel.cordova.plugin.android.referrer;

//import io.branch.referral.InstallListener;

import android.os.Bundle;
import android.content.BroadcastReceiver;
import android.content.SharedPreferences;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

import android.util.Log;

public class Receiver extends BroadcastReceiver {

@Override
public void onReceive(Context context, Intent intent) {

    Bundle extras = intent.getExtras();
    if (extras != null) {
    	String referrerString = extras.getString("referrer");
        if (referrerString != null) {
    	    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    	    Editor edit = sharedPreferences.edit();
    	    edit.putString("referrer", referrerString);
    	    edit.commit();

            //InstallListener branchListener = new InstallListener();
            //branchListener.onReceive(context, intent);
        }
    }
}

} // end of class

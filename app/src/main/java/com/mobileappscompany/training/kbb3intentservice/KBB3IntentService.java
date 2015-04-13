package com.mobileappscompany.training.kbb3intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Android1 on 4/12/2015.
 */
public class KBB3IntentService extends IntentService {

    private final static String TAG = "KBB3IntentService";

    public KBB3IntentService() {
        super("KBB3IntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "Intent Service Started");
    }
}

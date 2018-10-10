package com.example.administrator.demodesign.common;

import android.util.Log;

import com.example.administrator.demodesign.impl.FlyBehavior;

/**
 * Created by Administrator on 2018/10/9.
 */

public class FlyWithWings implements FlyBehavior {
    private static final String TAG = "FlyWithWings";

    @Override
    public void fly() {
        Log.d(TAG, "FlyWithWings");
    }
}

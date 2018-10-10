package com.example.administrator.demodesign.common;

import android.util.Log;

import com.example.administrator.demodesign.impl.FlyBehavior;

/**
 * Created by Administrator on 2018/10/9.
 */

public class FlyNoWay implements FlyBehavior {
    private static final String TAG = "FlyNoWay";
    @Override
    public void fly() {
        Log.d(TAG, "fly: noway");
    }
}

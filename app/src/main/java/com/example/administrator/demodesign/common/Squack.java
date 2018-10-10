package com.example.administrator.demodesign.common;

import android.util.Log;

import com.example.administrator.demodesign.impl.QuackBehavior;

/**
 * Created by Administrator on 2018/10/9.
 */

public class Squack implements QuackBehavior {
    private static final String TAG = "Squack";
    @Override
    public void quack() {
        Log.d(TAG, "quack: Squack Squack Squack");
    }
}

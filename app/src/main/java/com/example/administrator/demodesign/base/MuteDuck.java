package com.example.administrator.demodesign.base;

import android.util.Log;

import com.example.administrator.demodesign.common.FlyNoWay;
import com.example.administrator.demodesign.common.FlyWithWings;
import com.example.administrator.demodesign.common.MuteQuack;

/**
 * Created by Administrator on 2018/10/9.
 */

public class MuteDuck extends Duck {
    private static final String TAG = "MuteDuck";

    public MuteDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new MuteQuack();
    }

    @Override
    public void disPlay() {
        Log.d(TAG, "disPlay: MuteDuck MuteDuck MuteDuck");
    }
}

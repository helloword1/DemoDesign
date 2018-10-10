package com.example.administrator.demodesign.base;

import android.util.Log;

import com.example.administrator.demodesign.common.FlyNoWay;
import com.example.administrator.demodesign.impl.FlyBehavior;
import com.example.administrator.demodesign.impl.QuackBehavior;

/**
 * Created by Administrator on 2018/10/9.
 */

public abstract class Duck {
    private static final String TAG = "Duck";
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public abstract void disPlay();

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void swimming() {
        Log.d(TAG, "swimming: swimming swimming swimming");
    }
    public void setQuack(QuackBehavior quack) {
        mQuackBehavior = quack;
    }

    public void setFly(FlyBehavior fly) {
        mFlyBehavior = fly;
    }
}

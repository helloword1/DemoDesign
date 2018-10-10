package com.example.administrator.demodesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.demodesign.base.Duck;
import com.example.administrator.demodesign.base.ModleDuck;
import com.example.administrator.demodesign.base.MuteDuck;
import com.example.administrator.demodesign.common.FlyWithRocket;
import com.example.administrator.demodesign.common.QuackWithRocket;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        findViewById(R.id.btnClick).setOnClickListener(this);
        findViewById(R.id.btnClickRocket).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnClick:
                Duck duck = new MuteDuck();
                duck.disPlay();
                duck.performFly();
                duck.performQuack();
                duck.swimming();
                break;
            case R.id.btnClickRocket:
                Duck modleDuck = new ModleDuck();
                modleDuck.setFly(new FlyWithRocket());
                modleDuck.setQuack(new QuackWithRocket());
                modleDuck.disPlay();
                modleDuck.performFly();
                modleDuck.performQuack();
                modleDuck.swimming();
                break;
            default:
                break;
        }
    }
}

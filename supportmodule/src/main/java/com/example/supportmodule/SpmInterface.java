package com.example.supportmodule;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

/**
 * Created by Administrator on 2018/10/10.
 */

public interface SpmInterface {
    void onCreate(Bundle savedInstanceState);
    void onStart();
    void onRestart();
    void onResume();
    void onPause();
    void onStop();
    void onDestroy();
    void onActivityResult(int requestCode, int resultCode, Intent data);
    void onRestoreInstanceState(Bundle savedInstanceState);
    void onPostCreate(Bundle savedInstanceState);
    void onPostResume();
    void onNewIntent(Intent intent);
    void onSaveInstanceState(Bundle outState);
}

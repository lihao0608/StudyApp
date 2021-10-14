package com.example.studyapp;

import android.app.Application;

/**
 * author : cyp
 * date   : 2020/5/14
 * desc   :
 */
public class MyApplication extends Application {

    private static Application INSTANCE;
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE=this;
    }

   public static Application getappContext(){
        return INSTANCE;
   }
}

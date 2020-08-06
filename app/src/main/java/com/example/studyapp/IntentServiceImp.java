package com.example.studyapp;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

/**
 * author : cyp
 * date   : 2020/5/14
 * desc   :
 */
public class IntentServiceImp extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public IntentServiceImp(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}

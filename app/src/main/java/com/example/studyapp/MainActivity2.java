package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.studyapp.thread.WaitNotifyExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        WaitNotifyExample example = new WaitNotifyExample();
//        executorService.execute(() -> example.after());
//        executorService.execute(() -> example.before());
    }
}
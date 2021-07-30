package com.example.studyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;
import java.util.Queue;

public class MainActivity2 extends AppCompatActivity {
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        WaitNotifyExample example = new WaitNotifyExample();
//        executorService.execute(() -> example.after());
//        executorService.execute(() -> example.before());
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
<<<<<<< HEAD

//        测试错误1





//        修改

    }
}
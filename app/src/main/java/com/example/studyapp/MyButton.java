package com.example.studyapp;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MyButton extends androidx.appcompat.widget.AppCompatButton {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);

//        setOnLongClickListener(new OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                Log.d("111111111111", "onLongClick: ");
//                return false;
//            }
//        });
//
//        setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("111111111111", "onClick: ");
//            }
//        });



    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.d("111111111111", "onTouchEvent: "+event+"111111111"+super.onTouchEvent(event));
        return super.onTouchEvent(event);











    }
}

package com.example.studyapp.java;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyTextView extends androidx.appcompat.widget.AppCompatTextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
                setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("111111111111", "onClick: ");
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.d("111111111111", "onTouchEvent: "+event+"111111111"+super.onTouchEvent(event));
        return super.onTouchEvent(event);



    }
}

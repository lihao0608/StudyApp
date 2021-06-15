package com.example.studyapp;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import static android.view.MotionEvent.ACTION_DOWN;
import static android.view.MotionEvent.ACTION_MOVE;
import static android.view.MotionEvent.ACTION_UP;

public class View1  extends View
{
    public View1(Context context) {
        super(context);
    }

    public View1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


//    @Override
//    public boolean disP(MotionEvent event) {
////        return super.onTouchEvent(event);
//        int action = event.getAction();
//        float x = getX();
//        float y = getY();
//
//        switch (action) {
//            case ACTION_DOWN:
//
//                break;
//            case ACTION_MOVE:
//                float x1 = getX();
//                float y1 = getY();
//                if (x1-x>y1-y){
//                    return true;
//                }else {
//                    getParent().requestDisallowInterceptTouchEvent(false);
//                    return false;
//                }
//                break;
//
//            case ACTION_UP:
//
//                break;
//        }
//
//
//    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        int action = event.getAction();
        float x = event.getX();
        float y = event.getY();

        switch (action) {
            case ACTION_DOWN:

                break;
            case ACTION_MOVE:
                float x1 = event.getX();
                float y1 = event.getY();
                if (x1-x>y1-y){
                    getParent().requestDisallowInterceptTouchEvent(false);
                }else {
                    getParent().requestDisallowInterceptTouchEvent(true);

                }
                break;

            case ACTION_UP:

                break;
        }
        return super.dispatchTouchEvent(event);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("TAG", "onTouchEvent: ziview");
        return super.onTouchEvent(event);


    }
}

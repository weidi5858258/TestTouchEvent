package com.weidi.testtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

public class TouchEventFather extends LinearLayout {

    private static final String TAG = "player_alexander";

    public TouchEventFather(Context context) {
        super(context);
        setOnTouchListener();
        setOnClickListener();
    }

    public TouchEventFather(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnTouchListener();
        setOnClickListener();
    }

    private void setOnTouchListener() {
        this.setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent ev) {
                switch (ev.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        Log.i(TAG, "TouchEventFather   onTouch ACTION_DOWN");
                        break;
                    //return true;
                    //return false;
                    case MotionEvent.ACTION_MOVE:
                        Log.i(TAG, "TouchEventFather   onTouch ACTION_MOVE");
                        break;
                    //return true;
                    //return false;
                    case MotionEvent.ACTION_UP:
                        Log.i(TAG, "TouchEventFather   onTouch ACTION_UP");
                        break;
                    //return true;
                    //return false;
                    default:
                        break;
                }
                return false;
            }
        });
    }

    private void setOnClickListener() {
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "TouchEventFather   onClick");
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "TouchEventFather   dispatchTouchEvent ACTION_DOWN");
                break;
            //return true;
            //return false;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "TouchEventFather   dispatchTouchEvent ACTION_MOVE");
                break;
            //return true;
            //return false;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "TouchEventFather   dispatchTouchEvent ACTION_UP");
                break;
            //return true;
            //return false;
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    /*
    结论:
1. onInterceptTouchEvent 不管返回什么,对自身没有任何影响,影响的是子类
2. onInterceptTouchEvent DOWN return true时,子类没有任何事件(DOWN,MOVE,UP)了,触发自身点击事件,屏蔽子类点击事件.
3. onInterceptTouchEvent MOVE return true时,子类的DOWN事件正常触发,MOVE和UP事件没了,自身和子类的点击事件都没有了.
4. onInterceptTouchEvent UP   return true时,子类的DOWN和MOVE事件正常触发,UP事件没了,自身和子类的点击事件都没有了.
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "TouchEventFather   onInterceptTouchEvent ACTION_DOWN");
                break;
            //return true;
            //return false;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "TouchEventFather   onInterceptTouchEvent ACTION_MOVE");
                break;
            //return true;
            //return false;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "TouchEventFather   onInterceptTouchEvent ACTION_UP");
                break;
            //return true;
            //return false;
            default:
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "TouchEventFather   onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "TouchEventFather   onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "TouchEventFather   onTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(ev);
    }

}

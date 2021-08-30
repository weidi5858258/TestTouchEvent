package com.weidi.testtouchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class TouchEventTextView extends TextView {

    private static final String TAG = "player_alexander";

    public TouchEventTextView(Context context) {
        super(context);
        setOnTouchListener();
        setOnClickListener();
    }

    public TouchEventTextView(Context context, AttributeSet attrs) {
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
                        Log.i(TAG, "TouchEventTextView onTouch ACTION_DOWN");
                        break;
                    //return true;
                    //return false;
                    case MotionEvent.ACTION_MOVE:
                        Log.i(TAG, "TouchEventTextView onTouch ACTION_MOVE");
                        break;
                    //return true;
                    //return false;
                    case MotionEvent.ACTION_UP:
                        Log.i(TAG, "TouchEventTextView onTouch ACTION_UP");
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
                Log.i(TAG, "TouchEventTextView onClick");
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "TouchEventTextView dispatchTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "TouchEventTextView dispatchTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "TouchEventTextView dispatchTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "TouchEventTextView onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "TouchEventTextView onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "TouchEventTextView onTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(ev);
    }

}

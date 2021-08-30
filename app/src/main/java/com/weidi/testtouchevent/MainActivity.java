package com.weidi.testtouchevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "player_alexander";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*findViewById(R.id.father).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i(TAG, "MainActivity father onTouch");
                return false;
            }
        });
        findViewById(R.id.child).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i(TAG, "MainActivity child onTouch");
                return false;
            }
        });
        findViewById(R.id.test_text_view).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i(TAG, "MainActivity textview onTouch");
                return false;
            }
        });*/

        /*findViewById(R.id.father).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "MainActivity father onClick");
            }
        });
        findViewById(R.id.child).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "MainActivity child onClick");
            }
        });
        findViewById(R.id.test_text_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "MainActivity textview onClick");
            }
        });*/
    }

    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MainActivity       dispatchTouchEvent ACTION_DOWN");
                break;
                //return true;
                //return false;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "MainActivity       dispatchTouchEvent ACTION_MOVE");
                break;
                //return true;
                //return false;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MainActivity       dispatchTouchEvent ACTION_UP");
                break;
                //return true;
                //return false;
            default:
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "MainActivity       onTouchEvent ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "MainActivity       onTouchEvent ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "MainActivity       onTouchEvent ACTION_UP");
                break;
            default:
                break;
        }
        return super.onTouchEvent(ev);
    }

    /***
     
     */

}
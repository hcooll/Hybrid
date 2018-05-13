package com.medlinker.hybrid;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * ================================================
 * Created by huangcong on 2018/5/11.
 * ================================================
 */


public class NativeLinearLayout extends LinearLayout {

    private static final String TAG = "NativeLinearLayout";

    public NativeLinearLayout(Context context) {
        super(context);
    }

    public NativeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeLinearLayout(Context context, AttributeSet attributeSet, int defStyleAttr) {
        super(context, attributeSet, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG,"===>>> dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
//        return true;
    }

    @Override
    protected boolean dispatchHoverEvent(MotionEvent event) {
        Log.e(TAG,"===>>> dispatchHoverEvent");
        return super.dispatchHoverEvent(event);
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        Log.e(TAG,"===>>> onInterceptHoverEvent");
        return super.onInterceptHoverEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG,"===>>> onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"===>>> onTouchEvent");
        return super.onTouchEvent(event);
    }
}

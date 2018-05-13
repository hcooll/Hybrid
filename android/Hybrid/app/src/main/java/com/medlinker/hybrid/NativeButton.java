package com.medlinker.hybrid;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * ================================================
 * Created by huangcong on 2018/5/11.
 * ================================================
 */


public class NativeButton extends AppCompatButton {

    private static final String TAG = "NativeButton";

    public NativeButton(Context context) {
        super(context);
    }

    public NativeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeButton(Context context, AttributeSet attributeSet, int defStyleAttr) {
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
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"===>>> onTouchEvent");
//        return super.onTouchEvent(event);
        return true;
    }

}

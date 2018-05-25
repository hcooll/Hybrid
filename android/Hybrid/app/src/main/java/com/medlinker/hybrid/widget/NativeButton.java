package com.medlinker.hybrid.widget;

import android.content.Context;
import android.graphics.Canvas;
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
    public void layout(int l, int t, int r, int b) {
        super.layout(l, t, r, b);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.e(TAG, "===>>> onMeasure start  mode:" + MeasureSpec.getMode(widthMeasureSpec) + ", size: " + MeasureSpec.getSize(widthMeasureSpec));
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "===>>> onMeasure  end  mode:" + MeasureSpec.getMode(widthMeasureSpec) + ", size: " + MeasureSpec.getSize(widthMeasureSpec));

    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Log.e(TAG, "===>>> onLayout start");
        super.onLayout(changed, left, top, right, bottom);

        Log.e(TAG, "===>>> onLayout end");
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Log.e(TAG, "===>>> draw");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Log.e(TAG, "===>>> onDraw");
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
        return super.onTouchEvent(event);
//        return true;
    }

}

package com.medlinker.hybrid;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestNativeActivity extends AppCompatActivity {


    public static boolean flag = false;


    /**
     * 屏幕横竖屏切换，和生命周期管理
     */

    private static final String TAG = "TestNativeActivity";

    TextView text_screen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG", "onCreate");
        setContentView(R.layout.test_native);
        text_screen = (TextView) findViewById(R.id.text_screen);
        //获取当前的时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(new Date());
        text_screen.setText("onCreate" + time);
        //给TextView设置点击事件清除文字
        text_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // text_screen.setText("重新来！");

                startActivity(new Intent(TestNativeActivity.this,DemoMainActivity.class));

                Log.d("","===>>> flag:"+flag);
            }
        });

        findViewById(R.id.change_screen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeScreen(v);
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        text_screen.append("\n onNewIntent");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        text_screen.append("\n onSaveInstanceState");
        Log.e(TAG,"===>>> onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        text_screen.append("\n onRestoreInstanceState");
        Log.e(TAG,"===>>> onRestoreInstanceState");
    }

    //改变横竖屏切换的方法
    private void changeScreen(View view) {
        /**
         * int ORIENTATION_PORTRAIT = 1;  竖屏
         * int ORIENTATION_LANDSCAPE = 2; 横屏
         */
        //获取屏幕的方向  ,数值1表示竖屏，数值2表示横屏
        int screenNum = getResources().getConfiguration().orientation;
        //（如果竖屏）设置屏幕为横屏
        if (screenNum == 1) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            //设置为置屏幕为竖屏
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    //屏幕方向发生改变的回调方法
    @Override
    public void onConfigurationChanged(Configuration newConfig) {

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            text_screen.append("\n 当前屏幕为横屏");
        } else {
            text_screen.append("\n 当前屏幕为竖屏");
        }
        super.onConfigurationChanged(newConfig);
        Log.e("TAG", "onConfigurationChanged");
        //  setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);  //设置横屏
    }

    @Override
    protected void onStart() {
        super.onStart();
        text_screen.append("\n onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        text_screen.append("\n onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        text_screen.append("\n onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        text_screen.append("\n onPause");

        Log.e(TAG,"===>>> onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        text_screen.append("\n onStop");

        Log.e(TAG,"===>>> onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        text_screen.append("\n onDestroy");
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG,"===>>> dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG,"===>>> onTouchEvent");
        return super.onTouchEvent(event);
    }

}

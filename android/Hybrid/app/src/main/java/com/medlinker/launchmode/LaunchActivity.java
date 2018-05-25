package com.medlinker.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.medlinker.hybrid.R;

public class LaunchActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());


        findViewById(R.id.launch_mode_standard).setOnClickListener(this);
        findViewById(R.id.launch_mode_single_top).setOnClickListener(this);
        findViewById(R.id.launch_mode_single_task).setOnClickListener(this);
        findViewById(R.id.launch_mode_single_instance).setOnClickListener(this);
    }

    protected int getLayoutResID(){
       return R.layout.activity_launch;
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.launch_mode_standard:
                startActivity(StandardActivity.class);
                break;
            case R.id.launch_mode_single_top:
                startActivity(SingleTopActivity.class);
                break;
            case R.id.launch_mode_single_task:
                startActivity(SingleTaskActivity.class);
                break;
            case R.id.launch_mode_single_instance:
                startActivity(SingleInstanceActivity.class);
                break;
        }
    }

    private void startActivity(Class clz) {
        startActivity(new Intent(this, clz));
    }
}

package com.example.administrator.hahahaha.ui;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TabHost;

import com.example.administrator.hahahaha.R;
import com.example.administrator.hahahaha.util.ScreenUtils;

public class WelActivity extends TabActivity  implements RadioGroup.OnCheckedChangeListener{
    private RadioGroup radioGroup;
    TabHost tabHost;
    private RadioButton rb01,rb02,rb03,rb04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            //透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        setContentView(R.layout.wel_activity);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            View viewStatus = (View) findViewById(R.id.viewStatus);
            ViewGroup.LayoutParams params = viewStatus.getLayoutParams();
            params.height = ScreenUtils.getStatusHeight(this);
            viewStatus.setLayoutParams(params);//设置状态栏的高度
        }
        initView();
    }

    int position =0;
    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId){
            case R.id.radio_button0:
                position=0;
                tabHost.setCurrentTabByTag("ONE");
                break;
            case R.id.radio_button1:
                position=1;
                tabHost.setCurrentTabByTag("TWO");
                break;
            case R.id.radio_button2:
                position=2;
                tabHost.setCurrentTabByTag("THREE");
                break;
            case R.id.radio_button3:

                break;
        }
    }
    private void initView() {
        settabHost();
        radioGroup = (RadioGroup) findViewById(R.id.main_radio);
        radioGroup.setOnCheckedChangeListener(this);

    }

    private void settabHost() {
        tabHost =this.getTabHost();
        tabHost.setup();
        tabHost.clearAllTabs();
        tabHost.addTab(tabHost.newTabSpec("ONE").setIndicator("ONE")
                .setContent(new Intent(this,MainActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("TWO").setIndicator("TWO")
                .setContent(new Intent(this,ProActivity.class)));
    }
}

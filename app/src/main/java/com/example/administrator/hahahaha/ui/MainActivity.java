package com.example.administrator.hahahaha.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.administrator.hahahaha.R;
import com.example.administrator.hahahaha.util.SharedUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText edt_Name;
    private EditText edt_Phone;
    private SharedUtils utils;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            //透明状态栏
//            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//        }
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        edt_Name= (EditText) findViewById(R.id.edt_Name);
        edt_Phone= (EditText) findViewById(R.id.edt_Phone);
        btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

        utils=new SharedUtils();
    }

    private void initData() {
        if (null!=utils.getShared("status",this)){
            if ("1".equals(utils.getShared("status",this))){
                String name=utils.getShared("name",this);
                String phone=utils.getShared("phone",this);

                substring(name,phone);
            }
        }
    }

    private void substring (String name,String phone){
        if (name.length()==1){
            edt_Name.setText(name+"**");
        }else{
            String oldName = name.substring(1,name.length());
            String newName = name.replace(oldName,"**");
            edt_Name.setText(newName);

            String newPhone = phone.replace(phone.substring(3,phone.length()),"********");
            edt_Phone.setText(newPhone);
        }
    }


    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(edt_Name.getText().toString())||
                TextUtils.isEmpty(edt_Phone.getText().toString())){
            Toast.makeText(this,"信息不能为空",Toast.LENGTH_SHORT).show();
        }else if (11!=edt_Phone.length()){
            Toast.makeText(this,"手机号不对",Toast.LENGTH_SHORT).show();
        }else {
            utils.saveShared("name",edt_Name.getText().toString(),this);
            utils.saveShared("phone",edt_Phone.getText().toString(),this);
            utils.saveShared("status","1",this);
            Toast.makeText(this,"提交成功",Toast.LENGTH_SHORT).show();

        }
    }
}

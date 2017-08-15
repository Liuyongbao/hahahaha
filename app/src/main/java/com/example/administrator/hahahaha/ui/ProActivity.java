package com.example.administrator.hahahaha.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.bigkoo.convenientbanner.listener.OnItemClickListener;
import com.example.administrator.hahahaha.R;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ProActivity extends AppCompatActivity implements View.OnClickListener{

    ConvenientBanner bannerWelfare;
    ImageView imgBack;
    TextView texMenuTitle;
    SwipeRefreshLayout refreshCenter;
    //本地图片的数组
    private ArrayList<Integer> localImages = new ArrayList<Integer>();
    MyOnRefreshListener myOnRefreshListener;

    LinearLayout llJiFen;
    LinearLayout llBeiFen;
    RelativeLayout rlBeike;
    LinearLayout llXuYuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pro_activity);

        initView();
        initData();
    }

    private void initView() {
        imgBack= (ImageView) findViewById(R.id.imgBack);
        texMenuTitle= (TextView) findViewById(R.id.texMenuTitle);
        bannerWelfare= (ConvenientBanner) findViewById(R.id.bannerWelfare);
        refreshCenter= (SwipeRefreshLayout) findViewById(R.id.refreshCenter);

        //横排4个button
        llJiFen= (LinearLayout) findViewById(R.id.llJiFen);
        llBeiFen= (LinearLayout) findViewById(R.id.llBeiFen);
        rlBeike= (RelativeLayout) findViewById(R.id.rlBeike);
        llXuYuan= (LinearLayout) findViewById(R.id.llXuYuan);

        setListener();

        myOnRefreshListener = new MyOnRefreshListener();

        texMenuTitle.setText("福利");
        imgBack.setVisibility(View.GONE);
        refreshCenter.setColorSchemeResources(R.color.blue_3585fe);
    }

    private void setListener() {
        llJiFen.setOnClickListener(this);
        llBeiFen.setOnClickListener(this);
        rlBeike.setOnClickListener(this);
        llXuYuan.setOnClickListener(this);
    }

    private void initData() {
        //获取本地图片
        for (int position=0;position<1;position++){
            localImages.add(R.mipmap.flsl);
            localImages.add(R.mipmap.jifenbanner);
        }
        setBanner();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setSwipeRefresh();
    }

    /**
     * 设置Banner内容
     *
     * @param
     */
    private void setBanner() {

        bannerWelfare.setPages(new CBViewHolderCreator<LocalImageHolderView>() {
            @Override
            public LocalImageHolderView createHolder() {
                return new LocalImageHolderView();
            }
        }, localImages)
                .setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused})
                .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL);
        bannerWelfare.startTurning(2000);
        bannerWelfare.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
//
//                if (position == 0) {
//                    startActivity(new Intent(WelfareActivity.this, SiLiaoActivity.class));
//                } else {
//                    startActivity(new Intent(WelfareActivity.this, IntegralMallActivity.class));
//                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.llJiFen:
                showPhone();
        }
    }

    //为了方便改写，来实现复杂布局的切换
    private class LocalImageHolderView implements Holder<Integer> {
        private ImageView imageView;

        @Override
        public View createView(Context context) {
            //你可以通过layout文件来创建，不一定是Image，任何控件都可以进行翻页
            imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return imageView;
        }

        @Override
        public void UpdateUI(Context context, int position, Integer data) {
            imageView.setImageResource(data);
        }
    }
    /**
     * 温馨提示对话框手机
     */
    private void showPhone() {
        final Dialog dialog = new Dialog(this, R.style.mydialog);
        LayoutInflater inflater = LayoutInflater.from(this);
        View contentView = inflater.inflate(R.layout.dialog_pro, null);
        ImageButton butDialogClose = (ImageButton) contentView.findViewById(R.id.butDialogClose);
        Button bt = (Button) contentView.findViewById(R.id.btExit);
        butDialogClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String call = "4006786922";
                Intent intent = new Intent();

                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + call));

                startActivity(intent);
                dialog.cancel();

            }
        });
        dialog.setContentView(contentView);
        dialog.show();
    }

    /**
     * 通过文件名获取资源id 例子：getResId("icon", R.drawable.class);
     *
     * @param variableName
     * @param c
     *
     * @return
     */
    public static int getResId(String variableName, Class<?> c) {
        try {
            Field idField = c.getDeclaredField(variableName);
            return idField.getInt(idField);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    /**
     * 下拉刷新的事件
     */
    class MyOnRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

        @Override
        public void onRefresh() {

//            toAirticle();

        }

    }
    /**
     * 设置刷新组件
     */
    private void setSwipeRefresh() {
        MyOnRefreshListener myOnRefreshListener = new MyOnRefreshListener();
        refreshCenter.setOnRefreshListener(myOnRefreshListener);
//        swipeRefreshLayout.setRefreshing(true);
//        refreshCenter.setRefreshing(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                setBanner();
                refreshCenter.setRefreshing(false);
                Toast.makeText(ProActivity.this,"fuck",Toast.LENGTH_SHORT).show();
            }
        },3000);
//        refreshCenter.post(new Runnable() {
//            @Override
//            public void run() {
//                refreshCenter.setRefreshing(true);
//            }
//        });
        myOnRefreshListener.onRefresh();
    }
}

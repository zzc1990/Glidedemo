package com.mumayi.glidedemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.mumayi.glidedemo.adapter.ListViewAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 1.Glide 设置图片的几个参数,怎么用
 * 2.图片第一次出不来,或者显示有问题,第二次正常??!!
 */

public class MainActivity extends Activity {


    @BindView(R.id.la_listview)
    ListView la_listview;

    private String[] images;
    private ListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        initNet();

    }


    private void initNet() {
        getImageUrls();
        mAdapter = new ListViewAdapter(images, this);
        if (mAdapter != null) {
            la_listview.setAdapter(mAdapter);

        }
    }

    private void getImageUrls() {
        images = new String[]{
                "http://img.my.csdn.net/uploads/201407/26/1406383299_1976.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383291_6518.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383291_8239.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383290_9329.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383290_1042.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383299_193.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383275_3977.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383265_8550.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383264_3954.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383264_4787.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383264_8243.jpg",
                "http://img.my.csdn.net/uploads/201407/26/1406383248_3693.jpg",


        };
    }
}

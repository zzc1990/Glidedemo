package com.mumayi.glidedemo.adapter;

import android.content.Context;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mumayi.glidedemo.R;

/**
 * author: zzc-1990
 * created on: 2016/12/9 17:44
 */
public class ListViewAdapter extends BaseAdapter {

    private String[] strings;
    private Context context;
    private ImageView la_iv;

    public ListViewAdapter(String[] images, Context context) {
        this.strings = images;
        this.context = context;
    }


    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return strings[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            la_iv = (ImageView) convertView.findViewById(R.id.la_iv);

            //给控件设置数据
            Glide.with(context).load(strings[position])
                    .asBitmap()          // 显示gif静态图片 asgig(显示gif动态图)
                    .animate(R.anim.item_anim)  // 设置动画
                    .centerCrop()        //设置动态转换 fitCenter()等函数 注:不可设置成fitXY 的形式(OOM)
                    .override(100, 100)  // 设置图片大小
                    .into(la_iv);

        }
        return convertView;
    }
}

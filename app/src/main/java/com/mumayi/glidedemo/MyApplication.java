package com.mumayi.glidedemo;

import android.app.Application;
import android.util.Log;

/**
 * author: zzc-1990
 * created on: 2016/12/10 12:43
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        printMemory();
    }

    /**
     * 手机分配给app分配的内存空间
     */
    private void printMemory() {
        Runtime rt = Runtime.getRuntime();
        long maxMemory = rt.maxMemory();
        Log.e("maxMemory is ???", Long.toString(maxMemory / (1024 * 1024)) + "M"); // E/maxMemory:160M(coolpad 内存:1G)
                                                                                 // android:largeHeap="true" 变为 256 M
    }
}                                                                            //华为 honor 256 (手机内存 2G)

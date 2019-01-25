package com.kotlin.retrofit.utils;

import android.app.Activity;
import android.util.Log;

/**
 * Created by dell on 2018/5/31.
 */
public class WindowAttr {
    /**
     * 获取状态栏高度,在页面还没有显示出来之前
     *
     * @param a
     * @return
     */
    public static int getStateBarHeight(Activity a) {
        int result = 0;
        int resourceId = a.getResources().getIdentifier("status_bar_height",
                "dimen", "android");
        Log.e( "resourceId",resourceId+"aa" );
        if (resourceId > 0) {
            result = a.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }
}

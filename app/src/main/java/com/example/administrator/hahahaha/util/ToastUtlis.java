package com.example.administrator.hahahaha.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Toast 工具类
 *
 * @author fu
 */
public class ToastUtlis {
    private static String TAG = ToastUtlis.class.getSimpleName();

    private ToastUtlis() {
        throw new UnsupportedOperationException("ToastUtlis不能实例化");
    }

    public static boolean isShow = true;
    private static Toast mToast;

    /**
     * 多重Toast时，只显示一个Toast，更换Toast内容，时间：短时间显示
     * <p/>
     * by 付坤 21060705
     *
     * @param context
     *         上下文
     * @param message
     *         要显示的文案
     */
    public static void showMultipleToast(Context context, CharSequence message) {
        if (mToast != null)
            mToast.setText(message);
        else
            mToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);

        LogUtils.d(TAG, "showMToast");
        mToast.show();
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, int message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, int message) {
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, CharSequence message, int duration) {
        if (isShow)
            Toast.makeText(context, message, duration).show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param context
     * @param message
     * @param duration
     */
    public static void show(Context context, int message, int duration) {
        if (isShow)
            Toast.makeText(context, message, duration).show();
    }
}

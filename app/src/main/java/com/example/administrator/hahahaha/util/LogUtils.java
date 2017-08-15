package com.example.administrator.hahahaha.util;

import android.util.Log;

public class LogUtils {

    private static boolean isDebug = false;

    /**
     * i级别log 显示
     *
     * @param tag
     *         tag
     * @param msg
     *         msg
     */
    public static void i(String tag, String msg) {
        if (isDebug) {
            Log.i(tag, msg);
        }
    }

    /**
     * d级别log 显示
     *
     * @param tag
     *         tag
     * @param msg
     *         msg
     */
    public static void d(String tag, String msg) {
        if (isDebug) {
            Log.d(tag, msg);
        }
    }

    /**
     * e级别log 显示
     *
     * @param tag
     *         tag
     * @param msg
     *         msg
     */
    public static void e(String tag, String msg) {
        if (isDebug) {
            Log.e(tag, msg);
        }
    }

    /**
     * w级别log 显示
     *
     * @param tag
     *         tag
     * @param msg
     *         msg
     */
    public static void w(String tag, String msg) {
        if (isDebug) {
            Log.w(tag, msg);
        }
    }

    public static void print(String msg) {
        if (isDebug) {
//            System.out.println(msg);
        }
    }
}

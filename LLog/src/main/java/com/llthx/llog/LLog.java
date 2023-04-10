package com.llthx.llog;

import android.util.Log;

public class LLog {
    private static boolean DEBUG = false;
    private static boolean E_LOG = true;

    private static boolean ALL = false;

    private static boolean I_LOG = true;

    private static boolean W_LOG = true;

    private static boolean V_LOG = true;

    public static void setALL(boolean ALL) {
        LLog.ALL = ALL;
    }

    public static void setDEBUG(boolean DEBUG) {
        LLog.DEBUG = DEBUG;
    }

    public static void seteLog(boolean eLog) {
        E_LOG = eLog;
    }

    public static void setiLog(boolean iLog) {
        I_LOG = iLog;
    }

    public static void setwLog(boolean wLog) {
        W_LOG = wLog;
    }

    public static void setvLog(boolean vLog) {
        V_LOG = vLog;
    }

    public static void d(String TAG, String msg) {
        if (ALL || DEBUG) {
            Log.d(TAG,msg);
        }
    }

    public static void d(String TAG,String msg,Throwable throwable) {
        if (ALL || DEBUG) {
            Log.d(TAG,msg,throwable);
        }
    }

    public static void e(String TAG,String msg) {
        if (ALL || E_LOG) {
            Log.e(TAG,msg);
        }
    }

    public static void e(String TAG,String msg,Throwable throwable) {
        if (ALL || E_LOG) {
            Log.e(TAG,msg,throwable);
        }
    }

    public static void i(String TAG,String msg) {
        if (ALL || I_LOG) {
            Log.i(TAG,msg);
        }
    }

    public static void i(String TAG,String msg,Throwable throwable) {
        if (ALL || I_LOG) {
            Log.i(TAG,msg,throwable);
        }
    }

    public static void v(String TAG,String msg) {
        if (ALL || V_LOG) {
            Log.v(TAG,msg);
        }
    }

    public static void v(String TAG,String msg,Throwable throwable) {
        if (ALL || V_LOG) {
            Log.v(TAG,msg,throwable);
        }
    }

    public static void w(String TAG,String msg) {
        if (ALL || W_LOG) {
            Log.w(TAG,msg);
        }
    }

    public static void w(String TAG,String msg,Throwable throwable) {
        if (ALL || W_LOG) {
            Log.w(TAG,msg,throwable);
        }
    }
}

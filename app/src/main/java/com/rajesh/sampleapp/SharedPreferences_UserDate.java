package com.rajesh.sampleapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class SharedPreferences_UserDate {

    static final String loginS="loginStatus";

    static SharedPreferences getSharedPreferences(Context ctx) {
        return PreferenceManager.getDefaultSharedPreferences(ctx);
    }

    public static void setUserDetails(Context ct,int loginStatus)
    {
        SharedPreferences.Editor editor = getSharedPreferences(ct).edit();

        editor.putInt(loginS,loginStatus);

        editor.apply();
    }


    public static int getUserLoginStatus(Context ct)
    {
        return getSharedPreferences(ct).getInt(loginS,0);
    }


}

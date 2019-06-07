package com.inveitix.preferencesapplication.util;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesUtil {
    private static PreferencesUtil INSTANCE;
    SharedPreferences sharedPreferences;
    private static final String SP_NAME = "MY_PREFERENCES";
    private static final String KEY_NAME = "key_name";

    private PreferencesUtil(Context context){
        sharedPreferences = context.getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
    }

    public static PreferencesUtil getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PreferencesUtil(context);
        }

        return INSTANCE;
    }

    public void saveName(String name) {
        sharedPreferences.edit().putString(KEY_NAME, name).apply();
    }

    public String getName() {
        return sharedPreferences.getString(KEY_NAME,"");
    }
}

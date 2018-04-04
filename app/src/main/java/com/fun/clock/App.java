package com.fun.clock;

import android.app.Application;
import android.graphics.drawable.Drawable;

/**
 * App
 *
 * @author Frank
 * 2018/4/4
 * 15866818643@163.com
 */
public class App extends Application {
    private static App sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static Drawable getResDrawable(int id) {
        return sInstance.getResources().getDrawable(id);
    }
}

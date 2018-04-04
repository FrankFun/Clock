package com.fun.clock;

import android.graphics.drawable.Drawable;

import java.util.Calendar;

/**
 * Util
 *
 * @author Frank
 * 2018/4/4
 * 15866818643@163.com
 */
public class Util {
    private static final Drawable ZERO = App.getResDrawable(R.drawable.zero);
    private static final Drawable ONE = App.getResDrawable(R.drawable.one);
    private static final Drawable TWO = App.getResDrawable(R.drawable.two);
    private static final Drawable THREE = App.getResDrawable(R.drawable.three);
    private static final Drawable FOUR = App.getResDrawable(R.drawable.four);
    private static final Drawable FIVE = App.getResDrawable(R.drawable.five);
    private static final Drawable SIX = App.getResDrawable(R.drawable.six);
    private static final Drawable SEVEN = App.getResDrawable(R.drawable.seven);
    private static final Drawable EIGHT = App.getResDrawable(R.drawable.eight);
    private static final Drawable NINE = App.getResDrawable(R.drawable.nine);
    private static Calendar sCalendar;

    public static void init() {
        sCalendar = Calendar.getInstance();
    }

    public static Drawable getHourTen() {
        return getImage(sCalendar.get(Calendar.HOUR_OF_DAY) / 10);
    }

    public static Drawable getHour() {
        return getImage(sCalendar.get(Calendar.HOUR_OF_DAY) % 10);
    }

    public static Drawable getMinTen() {
        return getImage(sCalendar.get(Calendar.MINUTE) / 10);
    }

    public static Drawable getMin() {
        return getImage(sCalendar.get(Calendar.MINUTE) % 10);
    }

    private static Drawable getImage(int num) {
        switch (num) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            default:
                return NINE;
        }
    }
}

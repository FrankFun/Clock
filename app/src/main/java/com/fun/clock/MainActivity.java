package com.fun.clock;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

/**
 * MainActivity
 *
 * @author Frank
 * 2018/4/4
 * 15866818643@163.com
 */
public class MainActivity extends Activity {
    private ImageView ivHourTen;
    private ImageView ivHour;
    private ImageView ivMinTen;
    private ImageView ivMin;
    private Handler mHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            if (!active) return true;
            mHandler.sendEmptyMessageDelayed(0, 15000);
            Util.init();
            ivHourTen.setImageDrawable(Util.getHourTen());
            ivHour.setImageDrawable(Util.getHour());
            ivMinTen.setImageDrawable(Util.getMinTen());
            ivMin.setImageDrawable(Util.getMin());
            return true;
        }
    });
    private boolean active = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivHourTen = findViewById(R.id.iv_hour_ten);
        ivHour = findViewById(R.id.iv_hour);
        ivMinTen = findViewById(R.id.iv_min_ten);
        ivMin = findViewById(R.id.iv_min);
    }

    @Override
    protected void onResume() {
        super.onResume();
        active = true;
        mHandler.sendEmptyMessage(0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        active = false;
    }
}

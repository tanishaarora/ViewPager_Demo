package com.androidprojects.viewpager_demo.adapter;

import com.androidprojects.viewpager_demo.R;

public enum ViewPager_Model {

    RED(R.string.red, R.layout.red_screen),
    GREEN(R.string.green, R.layout.green_screen),
    BLUE(R.string.blue, R.layout.blue_screen);

    private int mTitleResId;
    private int mLayoutResId;

    ViewPager_Model(int titleResId, int layoutResId){
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getmTitleResId() {
        return mTitleResId;
    }

    public int getmLayoutResId() {
        return mLayoutResId;
    }
}

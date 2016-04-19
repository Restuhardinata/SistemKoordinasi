package com.hardinata.restu.sistemkoordinasi;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerIndra extends FragmentStatePagerAdapter{

    public static int PAGER_LENGTH = 23;

    public ViewPagerIndra(FragmentManager fm) {
        super(fm);
// TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int arg0) {
// TODO Auto-generated method stub
        return CustomPagerIndra.create(arg0);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return PAGER_LENGTH;
    }

}
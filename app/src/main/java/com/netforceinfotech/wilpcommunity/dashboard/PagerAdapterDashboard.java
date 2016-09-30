package com.netforceinfotech.wilpcommunity.dashboard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.netforceinfotech.wilpcommunity.dashboard.home.HomeFragment;
import com.netforceinfotech.wilpcommunity.dashboard.message.ChatFragment;
import com.netforceinfotech.wilpcommunity.dashboard.notification.NotificationFragment;

public class PagerAdapterDashboard extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapterDashboard(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomeFragment home = new HomeFragment();
                return home;
            case 1:
                NotificationFragment notificationFragment = new NotificationFragment();
                return notificationFragment;
            case 2:
                ChatFragment chatFragment = new ChatFragment();
                return chatFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
package com.vsc.fragmentsdemoapp.ui.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vsc.fragmentsdemoapp.ui.framents.PhoneFragment;
import com.vsc.fragmentsdemoapp.ui.framents.SimFragment;

public class FragmentPagerAdapter extends FragmentStatePagerAdapter {

    private int numOfTabs;
    private PhoneFragment phoneFragment;
    private SimFragment simFragment;

    public FragmentPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
        phoneFragment = new PhoneFragment();
        simFragment = new SimFragment();
    }

    private Fragment getPhoneFragment() {
        if (phoneFragment == null) {
            phoneFragment = new PhoneFragment();
        }
        return phoneFragment;
    }

    private Fragment getSimFragment() {
        if (simFragment == null) {
            simFragment = new SimFragment();
        }
        return simFragment;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return getPhoneFragment();
            case 1:
                return getSimFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}

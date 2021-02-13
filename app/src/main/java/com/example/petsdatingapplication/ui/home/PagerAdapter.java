<<<<<<< HEAD
package com.example.petsdatingapplication.ui.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private final int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DailyFragment();
            default:
                return new TBCFragment();
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
=======
package com.example.petsdatingapplication.ui.home;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private final int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new DailyFragment();
            default:
                return new TBCFragment();
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
>>>>>>> fa9b5e380bdd0e95d3cee1f6c858c22ae92ad7c1

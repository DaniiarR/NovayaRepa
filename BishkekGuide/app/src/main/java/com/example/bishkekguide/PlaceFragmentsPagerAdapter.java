package com.example.bishkekguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PlaceFragmentsPagerAdapter extends FragmentPagerAdapter {

    public PlaceFragmentsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MonumentsFragment();
            case 1:
                return new ParksFragment();
            case 2:
                return new RestaurantsFragment();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Monuments";
            case 1:
                return "Parks";
            case 2:
                return "Restaurants";
        }
        return null;
    }
}

package com.example.sahil.sfdghrj;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

public class ViewPagerAdapter extends FragmentPagerAdapter

{


    String tabTiles[] = new String[] {"TRAINING", "INTERNSHIP", "JOBS", "EVENTS", "DISCUSSION"};
    int tabs =5;
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
      /*  switch (position){
            case 0:
                return new CourseFrament();
            case 1:
                return new InternshipFragment();
            case 2:
                return new JobsFragment();
            case 3:
                return new PeopleFragment();
            case 4:
                return new EventFragment();
        }*/
        return null;
    }

    @Override
    public int getCount() {
        return tabs;
    }
}

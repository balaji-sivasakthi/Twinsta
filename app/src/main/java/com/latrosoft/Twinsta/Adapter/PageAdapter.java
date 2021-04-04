package com.latrosoft.Twinsta.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.latrosoft.Twinsta.Fragments.ImageFragment;
import com.latrosoft.Twinsta.Fragments.InstaFragment;
import com.latrosoft.Twinsta.Fragments.SavedFilesFragment;
import com.latrosoft.Twinsta.Fragments.VideoFragment;

public class PageAdapter extends FragmentPagerAdapter {

    private final int totalTabs;

    public PageAdapter(@NonNull FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 1) {
            return new ImageFragment();

        }else if (position == 2) {

            return new VideoFragment();

        } else if (position == 3) {
            return new SavedFilesFragment();


        }else if (position==4){

        }

        return new InstaFragment();

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}

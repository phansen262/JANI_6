package com.example.jani_6.gui.main;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityMainBinding;
import com.example.jani_6.gui.library.SnavActivity;
import com.example.jani_6.gui.main.mybod.MyBodMainFrag;
import com.example.jani_6.gui.main.myday.MyDayMainFrag;
import com.example.jani_6.gui.main.timeline.TimelineMainFrag;
import com.example.jani_6.gui.main.trends.TrendsMainFrag;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends SnavActivity {

    public static int bnavIndex = 0;

    private ActivityMainBinding mBinding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        //Initiate layout
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        useSNAV(this, R.id.drawer_am, R.string.app_name);

        //Initiate BNAV and listener, set initial view based on bnavIndex
        NavigationBarView bNav = mBinding.bnavMa;
        bNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if(item == bNav.getMenu().getItem(0)){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_am,
                            new MyDayMainFrag(), "MYDAY").commit();
                    return true;
                } else if (item == bNav.getMenu().getItem(1)){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_am,
                            new TimelineMainFrag(), "TIMELINE").commit();
                    return true;
                } else if (item == bNav.getMenu().getItem(2)){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_am,
                            new MyBodMainFrag(), "MYBOD").commit();
                    return true;
                } else if (item == bNav.getMenu().getItem(3)){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_am,
                            new TrendsMainFrag(), "TRENDS").commit();
                    return true;
                }
                return false;
            }
        });
        switch (bnavIndex) {
            case 0: bNav.setSelectedItemId(R.id.navigation_bnav_myday);
                break;
            case 1: bNav.setSelectedItemId(R.id.navigation_bnav_timeline);
                break;
            case 2: bNav.setSelectedItemId(R.id.navigation_bnav_mybod);
                break;
            case 3: bNav.setSelectedItemId(R.id.navigation_bnav_trends);
                break;
        }
    }
}

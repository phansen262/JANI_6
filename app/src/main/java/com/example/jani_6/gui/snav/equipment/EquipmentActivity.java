package com.example.jani_6.gui.snav.equipment;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityEquipmentBinding;
import com.example.jani_6.gui.library.SideNavBar;
import com.google.android.material.tabs.TabLayout;

public class EquipmentActivity extends AppCompatActivity {

    public SideNavBar sideNavBar;

    private ActivityEquipmentBinding mBinding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        //Initiate layout
        mBinding = ActivityEquipmentBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);

        //Add Tab Listeners To Switch Between Tabs
        mBinding.tabsAe.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(mBinding.tabsAe.getSelectedTabPosition() == 0){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_ae, new LifecycleEquipmentFrag()).commit();
                } else {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_ae, new StaticEquipmentFrag()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    //Handle Options Selected Event From SideNavBar
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){

        //If statement is actually needed
        if(sideNavBar.getmToggle().onOptionsItemSelected(item)){
            sideNavBar.setNavViewListener(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

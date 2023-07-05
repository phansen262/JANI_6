package com.example.jani_6.gui.snav.equipment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.jani_6.R;
import com.example.jani_6.databinding.ActivityEquipmentBinding;
import com.example.jani_6.gui.library.SideNavBar;
import com.example.jani_6.gui.library.SnavActivity;
import com.google.android.material.tabs.TabLayout;

import java.lang.ref.WeakReference;

public class EquipmentActivity extends SnavActivity {

    private ActivityEquipmentBinding mBinding;
    private static WeakReference<EquipmentActivity> selfReference;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        selfReference = new WeakReference<EquipmentActivity>(this);

        //Initiate layout
        mBinding = ActivityEquipmentBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        //Initiate side navigation bar menu
        //sideNavBar = new SideNavBar(this, R.id.drawer_ae, R.string.equipment);
        useSNAV(this, R.id.drawer_ae, R.string.equipment);

        //Add Tab Listeners To Switch Between Tabs
        mBinding.tabsAe.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(mBinding.tabsAe.getSelectedTabPosition() == 0){
                    //TODO: Create tag enum for fragments to ensure consistency
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_ae,
                            new LifecycleEquipmentFrag(), "LIFECYCLE").commit();
                } else {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container_ae,
                            new StaticEquipmentFrag(), "STATIC").commit();
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

    @Override
    public void useBackButton(){
        super.useBackButton();
        mBinding.tabsAe.setVisibility(View.GONE);
    }

    @Override
    public void useSNAV(AppCompatActivity activity, int drawerID, int titleID){
        super.useSNAV(activity, drawerID, titleID);
        mBinding.tabsAe.setVisibility(View.VISIBLE);
    }

    @Override
    protected void loadBackBehavior() {
        mBinding.tabsAe.setVisibility(View.VISIBLE);
    }

    public static WeakReference<EquipmentActivity> getSelfReference() {
        return selfReference;
    }
}

package com.example.jani_6.gui.snav.equipment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.jani_6.databinding.FragmentEquipmentStaticMainBinding;

public class StaticEquipmentFrag extends Fragment {

    private FragmentEquipmentStaticMainBinding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        mBinding = FragmentEquipmentStaticMainBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Set temporary listeners for buttons to navigate to new locations
        setNavButtonListeners(mBinding.buttonViewallFesm, new StaticEquipmentListViewFrag());
        setNavButtonListeners(mBinding.buttonCreatenewFesm, new NewStaticEquipmentFrag());
    }

    private void setNavButtonListeners(Button button, Fragment frag){

        button.setOnClickListener(view -> {
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(EquipmentActivity.getViewBinding().fragContainerAe.getId(), frag)
                    .commit();
        });
    }
}

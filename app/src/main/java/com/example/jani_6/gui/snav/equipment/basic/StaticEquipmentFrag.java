package com.example.jani_6.gui.snav.equipment.basic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.jani_6.R;
import com.example.jani_6.databinding.FragmentEquipmentStaticMainBinding;
import com.example.jani_6.gui.snav.equipment.EquipmentActivity;

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
        setNavButtonListeners(mBinding.buttonViewallFesm, new StaticEquipmentListViewFrag(), "STATIC_VIEWALL");
        setNavButtonListeners(mBinding.buttonCreatenewFesm, new NewStaticEquipmentFrag(), "STATIC_CREATENEW");
    }

    private void setNavButtonListeners(Button button, Fragment frag, String tag){

        button.setOnClickListener(view -> {
            EquipmentActivity.getSelfReference().get().useBackButton();
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(requireActivity().requireViewById(R.id.frag_container_ae).getId(), frag, tag)
                    .commit();
        });
    }
}

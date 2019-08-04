package com.htw.hostthewebsitenew.dashboardfragments.childfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.htw.hostthewebsitenew.R;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.sharedhostingfragments.CpanelFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.sharedhostingfragments.DirectAdminFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SharedHostingFragment extends Fragment {

    private LinearLayout sharedDirectadmin, sharedCpanel;


    public SharedHostingFragment() {
        // Required empty public constructor
    }

    public static SharedHostingFragment newInstance() {
        SharedHostingFragment fragment = new SharedHostingFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_shared_hosting, container, false);

        sharedDirectadmin = v.findViewById(R.id.shareddirectadmin);
        sharedCpanel = v.findViewById(R.id.sharedcpanel);

        sharedDirectadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                DirectAdminFragment sharedHostingFragment = new DirectAdminFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, sharedHostingFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        sharedCpanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                CpanelFragment cpanelFragment = new CpanelFragment();
                ft.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);
                ft.replace(R.id.menu_content, cpanelFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        return v;
    }

}

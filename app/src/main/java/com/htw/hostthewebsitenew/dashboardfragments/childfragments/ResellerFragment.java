package com.htw.hostthewebsitenew.dashboardfragments.childfragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.htw.hostthewebsitenew.R;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.resellerfragments.ResellerCpanelFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.resellerfragments.ResellerDirectAdminFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResellerFragment extends Fragment {

    private LinearLayout resellerDirectadmin, resellerCpanel;


    public ResellerFragment() {
        // Required empty public constructor
    }

    public static ResellerFragment newInstance() {
        ResellerFragment fragment = new ResellerFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_reseller, container, false);

        resellerDirectadmin = v.findViewById(R.id.resellerdirectadmin);
        resellerCpanel = v.findViewById(R.id.resellercpanel);

        resellerDirectadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                ResellerDirectAdminFragment resellerDirectAdminFragment = new ResellerDirectAdminFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, resellerDirectAdminFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        resellerCpanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                ResellerCpanelFragment resellerCpanelFragment = new ResellerCpanelFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, resellerCpanelFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        return v;
    }

}

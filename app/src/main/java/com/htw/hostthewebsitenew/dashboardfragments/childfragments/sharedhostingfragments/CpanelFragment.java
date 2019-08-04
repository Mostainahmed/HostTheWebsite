package com.htw.hostthewebsitenew.dashboardfragments.childfragments.sharedhostingfragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.htw.hostthewebsitenew.OnClickingPackage;
import com.htw.hostthewebsitenew.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CpanelFragment extends Fragment {

    public LinearLayout cpanelSpecial, cpanelStarter, cpanelStarterTwo, cpanelStarterThree;
    OnClickingPackage onClickingPackage;

    public CpanelFragment() {
        // Required empty public constructor
    }

    public static CpanelFragment newInstance() {
        CpanelFragment fragment = new CpanelFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cpanel, container, false);

        cpanelSpecial = v.findViewById(R.id.cpanel_special);
        cpanelStarter = v.findViewById(R.id.cpanel_starter);
        cpanelStarterTwo = v.findViewById(R.id.cpanel_starter_two);
        cpanelStarterThree = v.findViewById(R.id.cpanel_starter_three);

        cpanelSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=92&billingcycle=annually&currency=2";

                onClickingPackage.onPackageClick(URL);
            }
        });
        cpanelStarter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=89&billingcycle=annually&currency=2";

                onClickingPackage.onPackageClick(URL);
            }
        });
        cpanelStarterTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=90&billingcycle=annually&currency=2";

                onClickingPackage.onPackageClick(URL);
            }
        });
        cpanelStarterThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=91&billingcycle=annually&currency=2";

                onClickingPackage.onPackageClick(URL);
            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;

        try{
            onClickingPackage = (OnClickingPackage) activity;
        }catch (ClassCastException c){
            throw new ClassCastException(activity.toString()+"Must Override onPackageClick....");
        }
    }

}

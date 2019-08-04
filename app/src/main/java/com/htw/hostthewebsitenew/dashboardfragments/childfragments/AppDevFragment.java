package com.htw.hostthewebsitenew.dashboardfragments.childfragments;


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
public class AppDevFragment extends Fragment {

    public LinearLayout staticApp, dynamicApp, professionalApp;
    OnClickingPackage onClickingPackage;


    public AppDevFragment() {
        // Required empty public constructor
    }

    public static AppDevFragment newInstance() {
        AppDevFragment fragment = new AppDevFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_app_dev, container, false);

        staticApp = v.findViewById(R.id.static_app);
        dynamicApp = v.findViewById(R.id.dynamic_app);
        professionalApp = v.findViewById(R.id.professional_app);


        staticApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=4v";

                onClickingPackage.onPackageClick(URL);
            }
        });
        dynamicApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=4v";

                onClickingPackage.onPackageClick(URL);
            }
        });
        professionalApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=4v";

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

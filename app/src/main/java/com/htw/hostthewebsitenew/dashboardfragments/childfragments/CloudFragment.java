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
public class CloudFragment extends Fragment {

    public LinearLayout starterCloud, businessCloud, cloudPro, enterpriseCloud;
    OnClickingPackage onClickingPackage;


    public CloudFragment() {
        // Required empty public constructor
    }

    public static CloudFragment newInstance() {
        CloudFragment fragment = new CloudFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cloud, container, false);

        starterCloud = v.findViewById(R.id.starter_cloud);
        businessCloud = v.findViewById(R.id.business_cloud);
        cloudPro = v.findViewById(R.id.cloud_pro);
        enterpriseCloud = v.findViewById(R.id.enterprise_cloud);

        starterCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=44&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        businessCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=45&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        cloudPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=47&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        enterpriseCloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=46&billingcycle=annually&currency=2&promocode=androapp";

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

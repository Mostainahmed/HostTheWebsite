package com.htw.hostthewebsitenew.dashboardfragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.htw.hostthewebsitenew.OnClickingPackage;
import com.htw.hostthewebsitenew.R;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.AppDevFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.CloudFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.DedicatedFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.ResellerFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.SharedHostingFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.VpsFragment;
import com.htw.hostthewebsitenew.dashboardfragments.childfragments.WebDevFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class PackageFragment extends Fragment {

    private LinearLayout sharedHosting, resellerHosting, cloudHosting, vpsServers, dedicatedServers, domainRegistration, webDevelopment, appDevelopment;
    OnClickingPackage onClickingPackage;

    public PackageFragment() {
        // Required empty public constructor
    }

    public static PackageFragment newInstance() {
        PackageFragment fragment = new PackageFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_package, container, false);

        sharedHosting = v.findViewById(R.id.shared_hosting);
        resellerHosting = v.findViewById(R.id.reseller_hosting);
        cloudHosting = v.findViewById(R.id.cloud_hosting);
        dedicatedServers = v.findViewById(R.id.dedicated_servers);
        vpsServers = v.findViewById(R.id.vps_hosting);
        domainRegistration = v.findViewById(R.id.domainregistration);
        webDevelopment = v.findViewById(R.id.webdevelopment);
        appDevelopment = v.findViewById(R.id.appdevelopment);

        sharedHosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                SharedHostingFragment sharedHostingFragment = new SharedHostingFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, sharedHostingFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        resellerHosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                ResellerFragment resellerFragment = new ResellerFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, resellerFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        cloudHosting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                CloudFragment cloudFragment = new CloudFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, cloudFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        dedicatedServers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                DedicatedFragment dedicatedFragment = new DedicatedFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, dedicatedFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        vpsServers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                VpsFragment vpsFragment = new VpsFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, vpsFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        domainRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = " https://clients.hostthewebsitenew.com/cart.php?a=add&domain=register&currency=2";

                onClickingPackage.onPackageClick(URL);
            }
        });

        webDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                WebDevFragment webDevFragment = new WebDevFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, webDevFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
            }
        });

        appDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getParentFragment().getChildFragmentManager().beginTransaction();
                AppDevFragment appDevFragment = new AppDevFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, appDevFragment);
                ft.addToBackStack("my_fragment");
                ft.commit();
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
            throw new ClassCastException(activity.toString()+" must Override onPackageClick....");
        }
    }
}

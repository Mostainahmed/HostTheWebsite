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
public class VpsFragment extends Fragment {

    public LinearLayout vpsOne, vpsTwo, vpsThree, vpsfour, vpsFive;
    OnClickingPackage onClickingPackage;


    public VpsFragment() {
        // Required empty public constructor
    }

    public static VpsFragment newInstance() {
        VpsFragment fragment = new VpsFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_vps, container, false);

       vpsOne = v.findViewById(R.id.level_one);
       vpsTwo = v.findViewById(R.id.level_two);
       vpsThree = v.findViewById(R.id.level_three);
       vpsfour = v.findViewById(R.id.level_four);
       vpsFive = v.findViewById(R.id.level_five);

        vpsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=33";

                onClickingPackage.onPackageClick(URL);
            }
        });
        vpsTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=34";

                onClickingPackage.onPackageClick(URL);
            }
        });
        vpsThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=35";

                onClickingPackage.onPackageClick(URL);
            }
        });
        vpsfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=36";

                onClickingPackage.onPackageClick(URL);
            }
        });
        vpsFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=37";

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

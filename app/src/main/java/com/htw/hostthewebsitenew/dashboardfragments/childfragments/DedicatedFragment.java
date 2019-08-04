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
public class DedicatedFragment extends Fragment {

    public LinearLayout dedicatedOne, dedicatedTwo, dedicatedThree, dedicatedfour, dedicatedFive;
    OnClickingPackage onClickingPackage;


    public DedicatedFragment() {
        // Required empty public constructor
    }

    public static DedicatedFragment newInstance() {
        DedicatedFragment fragment = new DedicatedFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dedicated, container, false);

        dedicatedOne = v.findViewById(R.id.dedicated_one);
        dedicatedTwo = v.findViewById(R.id.dedicated_two);
        dedicatedThree = v.findViewById(R.id.dedicated_three);
        dedicatedfour = v.findViewById(R.id.dedicated_four);
        dedicatedFive = v.findViewById(R.id.dedicated_five);

        dedicatedOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=39";

                onClickingPackage.onPackageClick(URL);
            }
        });
        dedicatedTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=40";

                onClickingPackage.onPackageClick(URL);
            }
        });
        dedicatedThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=41";

                onClickingPackage.onPackageClick(URL);
            }
        });
        dedicatedfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=42";

                onClickingPackage.onPackageClick(URL);
            }
        });
        dedicatedFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=43";

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

package com.htw.hostthewebsitenew.dashboardfragments.childfragments.sharedhostingfragments;


import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.htw.hostthewebsitenew.OnClickingPackage;
import com.htw.hostthewebsitenew.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DirectAdminFragment extends Fragment {

    public LinearLayout htwStarter, htwSpecial, htwStarterTwo, htwStarterThree, htwSpecialTwo, htwProfessionaOne, htwProfessionalTwo, htwProfessionalThree;
    OnClickingPackage onClickingPackage;
    public TextView textDiscount;

    public DirectAdminFragment() {
        // Required empty public constructor
    }


    public static DirectAdminFragment newInstance() {
        DirectAdminFragment fragment = new DirectAdminFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_direct_admin, container, false);

        htwStarter = v.findViewById(R.id.htw_starter);
        htwSpecial = v.findViewById(R.id.htw_special);
        htwStarterTwo = v.findViewById(R.id.htw_starter_two);
        htwStarterThree = v.findViewById(R.id.htw_starter_three);
        htwSpecialTwo = v.findViewById(R.id.htw_special_two);
        htwProfessionaOne = v.findViewById(R.id.htw_professional_one);
        htwProfessionalTwo = v.findViewById(R.id.htw_professional_two);
        htwProfessionalThree = v.findViewById(R.id.htw_professional_three);
        textDiscount = v.findViewById(R.id.title_text);


        Typeface CustomFont = Typeface.createFromAsset(getActivity().getAssets(), "fonts/PatchyRobots.ttf");
        textDiscount.setTypeface(CustomFont);

        htwStarter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=97&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        htwSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=103&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        htwStarterTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=98&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        htwStarterThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=99&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        htwSpecialTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=104&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        htwProfessionaOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=100&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        htwProfessionalTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=101&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        htwProfessionalThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=102&billingcycle=annually&currency=2&promocode=androapp";

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

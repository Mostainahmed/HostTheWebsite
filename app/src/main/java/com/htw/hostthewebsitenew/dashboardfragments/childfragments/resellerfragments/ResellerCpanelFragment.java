package com.htw.hostthewebsitenew.dashboardfragments.childfragments.resellerfragments;


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
public class ResellerCpanelFragment extends Fragment {

    public LinearLayout resellerBasic, resellerBasicTwo, resellerBasicThree, resellerPro;
    OnClickingPackage onClickingPackage;


    public ResellerCpanelFragment() {
        // Required empty public constructor
    }

    public static ResellerCpanelFragment newInstance() {
        ResellerCpanelFragment fragment = new ResellerCpanelFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_reseller_cpanel, container, false);

        resellerBasic = v.findViewById(R.id.reseller_basic);
        resellerBasicTwo = v.findViewById(R.id.reseller_two);
        resellerBasicThree = v.findViewById(R.id.reseller_three);
        resellerPro = v.findViewById(R.id.reseller_pro);

        resellerBasic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=93&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        resellerBasicTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=94&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        resellerBasicThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=95&billingcycle=annually&currency=2&promocode=androapp";

                onClickingPackage.onPackageClick(URL);
            }
        });
        resellerPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/cart.php?a=add&pid=96&billingcycle=annually&currency=2&promocode=androapp";

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

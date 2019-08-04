package com.htw.hostthewebsitenew.bottomfragments;


import android.graphics.Color;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.htw.hostthewebsitenew.R;
import com.htw.hostthewebsitenew.dashboardfragments.BillingFragment;
import com.htw.hostthewebsitenew.dashboardfragments.PackageFragment;
import com.htw.hostthewebsitenew.dashboardfragments.SupportFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment{

    private TextView titleText;
    private LinearLayout packageLayout, supportLayout, billingLayout;
    private CardView cardPackage, cardSupport, cardBilling;


    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance() {
        DashboardFragment fragment = new DashboardFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_dashboard, container, false);
        packageLayout = v.findViewById(R.id.packages);
        supportLayout = v.findViewById(R.id.support);
        billingLayout = v.findViewById(R.id.billing);
        FrameLayout fragmentview = v.findViewById(R.id.menu_content);

        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        PackageFragment packageFragment = new PackageFragment();
        ft.replace(R.id.menu_content, packageFragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();

        cardPackage = v.findViewById(R.id.cardviewpackage);
        cardSupport = v.findViewById(R.id.cardviewsupport);
        cardBilling = v.findViewById(R.id.cardviewbilling);

        cardPackage.setCardBackgroundColor(Color.parseColor("#FFC9CCF1"));

        packageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cardPackage.setCardBackgroundColor(Color.parseColor("#FFC9CCF1"));
                cardBilling.setCardBackgroundColor(Color.parseColor("#ffffff"));
                cardSupport.setCardBackgroundColor(Color.parseColor("#ffffff"));

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                PackageFragment packageFragment = new PackageFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, packageFragment);
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack("myfragment");
                ft.commit();
            }
        });

        supportLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cardSupport.setCardBackgroundColor(Color.parseColor("#FFC9CCF1"));
                cardBilling.setCardBackgroundColor(Color.parseColor("#ffffff"));
                cardPackage.setCardBackgroundColor(Color.parseColor("#ffffff"));

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                SupportFragment supportFragment = new SupportFragment();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.replace(R.id.menu_content, supportFragment);
                //ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.addToBackStack("myfragment");
                ft.commit();
            }
        });

        billingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                cardBilling.setCardBackgroundColor(Color.parseColor("#FFC9CCF1"));
                cardPackage.setCardBackgroundColor(Color.parseColor("#ffffff"));
                cardSupport.setCardBackgroundColor(Color.parseColor("#ffffff"));

                FragmentTransaction ft = getChildFragmentManager().beginTransaction();
                BillingFragment billingFragment = new BillingFragment();
                ft.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);
                ft.replace(R.id.menu_content, billingFragment);
                ft.addToBackStack("myfragment");
                ft.commit();
            }
        });

        return v;
    }

}

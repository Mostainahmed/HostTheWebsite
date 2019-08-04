package com.htw.hostthewebsitenew.dashboardfragments;


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
public class SupportFragment extends Fragment {

    public LinearLayout supportSection, billingSection, salesSection, developerSection, myTickets, supportBlogs, supportVideos, networkStatus;
    OnClickingPackage onClickingPackage;

    public SupportFragment() {
        // Required empty public constructor
    }

    public static SupportFragment newInstance() {
        SupportFragment fragment = new SupportFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_support, container, false);

        supportSection = v.findViewById(R.id.supportsection);
        billingSection = v.findViewById(R.id.billingsection);
        salesSection = v.findViewById(R.id.salessection);
        developerSection = v.findViewById(R.id.developerteam);
        myTickets = v.findViewById(R.id.mytickets);
        supportBlogs = v.findViewById(R.id.supportblogs);
        supportVideos = v.findViewById(R.id.supportvideos);
        networkStatus = v.findViewById(R.id.networkstatus);

        supportSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=1";

                onClickingPackage.onPackageClick(URL);
            }
        });
        billingSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=2";

                onClickingPackage.onPackageClick(URL);
            }
        });
        salesSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=3";

                onClickingPackage.onPackageClick(URL);
            }
        });
        developerSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=4v";

                onClickingPackage.onPackageClick(URL);
            }
        });
        myTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/supporttickets.php";

                onClickingPackage.onPackageClick(URL);
            }
        });
        supportBlogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://blog.hostthewebsitenew.com/";

                onClickingPackage.onPackageClick(URL);
            }
        });
        supportVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://www.youtube.com/channel/UChzD5TZP7se95B9w7SOcm2g/playlists";

                onClickingPackage.onPackageClick(URL);
            }
        });
        networkStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/serverstatus.php";

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

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
public class WebDevFragment extends Fragment {

    public LinearLayout newsSite, ecomerceSite, blogSite;
    OnClickingPackage onClickingPackage;


    public WebDevFragment() {
        // Required empty public constructor
    }

    public static WebDevFragment newInstance() {
        WebDevFragment fragment = new WebDevFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_web_dev, container, false);

        newsSite = v.findViewById(R.id.news_site);
        blogSite = v.findViewById(R.id.blog_site);
        ecomerceSite = v.findViewById(R.id.ecommerce_site);

        newsSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=4v";

                onClickingPackage.onPackageClick(URL);
            }
        });
        blogSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String URL = "https://clients.hostthewebsitenew.com/submitticket.php?step=2&deptid=4v";

                onClickingPackage.onPackageClick(URL);
            }
        });
        ecomerceSite.setOnClickListener(new View.OnClickListener() {
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

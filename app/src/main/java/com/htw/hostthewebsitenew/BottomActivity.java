package com.htw.hostthewebsitenew;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.htw.hostthewebsitenew.bottomfragments.BlogFragment;
import com.htw.hostthewebsitenew.bottomfragments.DashboardFragment;
import com.htw.hostthewebsitenew.bottomfragments.HomeFragment;
import com.htw.hostthewebsitenew.bottomfragments.VideoFragment;
import com.htw.hostthewebsitenew.bottomfragments.WebViewFragment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class BottomActivity extends AppCompatActivity implements OnClickingPackage {

    private AlertDialog.Builder ab;
    private AlertDialog alertDialog;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedFragment = null;

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = DashboardFragment.newInstance();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomcontent, selectedFragment).addToBackStack(null).commit();
                    return true;
//                case R.id.navigation_ticket:
//                    selectedFragment = TicketFragment.newInstance();
//                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomcontent, selectedFragment).addToBackStack(null).commit();
//                    return true;
                case R.id.navigation_blogpost:
                    selectedFragment = BlogFragment.newInstance();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomcontent, selectedFragment).addToBackStack(null).commit();
                    return true;
                case R.id.navigation_videos:
                    selectedFragment = VideoFragment.newInstance();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomcontent, selectedFragment).addToBackStack(null).commit();
                    return true;
                case R.id.navigation_more:
                    selectedFragment = HomeFragment.newInstance();
                    getSupportFragmentManager().beginTransaction().replace(R.id.bottomcontent, selectedFragment).addToBackStack(null).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_bottom);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.bottomcontent, DashboardFragment.newInstance()).addToBackStack(null).commit();
    }
    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {

            ab = new AlertDialog.Builder(BottomActivity.this);
            ab.setTitle("Confirm").
                    setMessage("Are you sure you want to exit").
                    setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                            finish();

                        }
                    }).setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();

                }
            });
            alertDialog = ab.create();
            alertDialog.show();
        }
    }

    @Override
    public void onPackageClick(String URL) {

        Bundle bundle = new Bundle();
        bundle.putString("url",URL);


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        WebViewFragment webViewFragment = new WebViewFragment();
        webViewFragment.setArguments(bundle);
        ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
        ft.replace(R.id.bottomcontent, webViewFragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}

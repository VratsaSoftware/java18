package com.vsc.fragmentsdemoapp.ui.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.vsc.fragmentsdemoapp.R;
import com.vsc.fragmentsdemoapp.ui.adapters.FragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentPagerAdapter fragmentPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindElements();

        setupTabs();
    }

    private void bindElements() {
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
    }

    private void setupTabs() {
        tabLayout.addTab(tabLayout.newTab().setText(R.string.txt_phone));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.txt_sim));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        fragmentPagerAdapter.notifyDataSetChanged();
        viewPager.setAdapter(fragmentPagerAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}

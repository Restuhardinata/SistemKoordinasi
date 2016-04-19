package com.hardinata.restu.sistemkoordinasi;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;

public class ScreenSlideActivityKurikulum extends ActionBarActivity implements OnClickListener {
    private Toolbar mToolbar;

    ViewPager viewPager ;
    ViewPagerKurikulum viewPagerAdapter ;
    int page = 0 ;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurikulum);

        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Kurikulum");

        initObject();
        initComponentViews();
        initConfigurationView();

    }

    private void initObject(){
        viewPagerAdapter = new com.hardinata.restu.sistemkoordinasi.ViewPagerKurikulum(getSupportFragmentManager());
    }

    private void initComponentViews(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);

    }

    private void initConfigurationView(){
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

        }
    }
}
package com.hardinata.restu.sistemkoordinasi;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ScreenSlideActivity extends ActionBarActivity implements OnClickListener {
    private Toolbar mToolbar;

    private MenuItem mSearchAction;
    private boolean isSearchOpened = false;
    private EditText edtSeach;

    ViewPager viewPager ;
    ViewPagerAdapter viewPagerAdapter ;
    int page = 0 ;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sistemsaraf);

        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Sistem Saraf");

        initObject();
        initComponentViews();
        initConfigurationView();

    }

    private void initObject(){
        viewPagerAdapter = new com.hardinata.restu.sistemkoordinasi.ViewPagerAdapter(getSupportFragmentManager());
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

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        mSearchAction = menu.findItem(R.id.action_search);
        return super.onPrepareOptionsMenu(menu);
    }
}
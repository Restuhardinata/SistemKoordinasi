package com.hardinata.restu.sistemkoordinasi;

/**
 * OutAttacker
 */

import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class CustomPagerPendahuluan extends Fragment{

    public static final String PAGE = "page";
    ViewGroup viewGroup;
    ImageView imageView;
    private ScaleGestureDetector scaleGestureDetector;
    private Matrix matrix = new Matrix();

    public CustomPagerPendahuluan() {
// TODO Auto-generated constructor stub
    }

    public static CustomPagerPendahuluan create(int page) {

        CustomPagerPendahuluan customPager = new CustomPagerPendahuluan();
        Bundle data = new Bundle();
        data.putInt(PAGE, page);
        customPager.setArguments(data);
        return customPager ;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewGroup = (ViewGroup) inflater.inflate(R.layout.slide_layout, container, false);
        imageView = (ImageView) viewGroup.findViewById(R.id.imageView);

        switch (getArguments().getInt(PAGE)) {

            case 0:
                imageView.setImageResource(R.drawable.pendahuluan);
                break;
        }

        return viewGroup;
    }

}
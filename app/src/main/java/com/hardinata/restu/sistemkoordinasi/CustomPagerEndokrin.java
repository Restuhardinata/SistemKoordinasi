package com.hardinata.restu.sistemkoordinasi;

/**
 * OutAttacker
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomPagerEndokrin extends Fragment{

    public static final String PAGE = "page";
    ViewGroup viewGroup;
    ImageView imageView;

    public CustomPagerEndokrin() {
// TODO Auto-generated constructor stub
    }

    public static CustomPagerEndokrin create(int page) {

        CustomPagerEndokrin customPager = new CustomPagerEndokrin();
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
                imageView.setImageResource(R.drawable._se_geser_);
                break;
            case 1:
                imageView.setImageResource(R.drawable.endokrin_0);
                break;
            case 2:
                imageView.setImageResource(R.drawable.endokrin_1);
                break;
            case 3:
                imageView.setImageResource(R.drawable.endokrin_2);
                break;
            case 4:
                imageView.setImageResource(R.drawable.endokrin_3);
                break;
            case 5:
                imageView.setImageResource(R.drawable.endokrin_4);
                break;
            case 6:
                imageView.setImageResource(R.drawable.endokrin_5);
                break;
            case 7:
                imageView.setImageResource(R.drawable.endokrin_6);
                break;
            case 8:
                imageView.setImageResource(R.drawable.endokrin_7);
                break;
            case 9:
                imageView.setImageResource(R.drawable.endokrin_8);
                break;
            case 10:
                imageView.setImageResource(R.drawable.endokrin_9);
                break;
            case 11:
                imageView.setImageResource(R.drawable.endokrin_10);
                break;
            case 12:
                imageView.setImageResource(R.drawable.endokrin_11);
                break;
            case 13:
                imageView.setImageResource(R.drawable.endokrin_12);
                break;

        }

        return viewGroup;
    }

}
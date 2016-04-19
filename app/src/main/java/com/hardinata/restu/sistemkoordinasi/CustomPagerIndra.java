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

public class CustomPagerIndra extends Fragment{

    public static final String PAGE = "page";
    ViewGroup viewGroup;
    ImageView imageView;

    public CustomPagerIndra() {
// TODO Auto-generated constructor stub
    }

    public static CustomPagerIndra create(int page) {

        CustomPagerIndra customPager = new CustomPagerIndra();
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
                imageView.setImageResource(R.drawable._si_geser_);
                break;
            case 1:
                imageView.setImageResource(R.drawable.indra_hal_0);
                break;
            case 2:
                imageView.setImageResource(R.drawable.indra_hal_1);
                break;
            case 3:
                imageView.setImageResource(R.drawable.indra_hal_2);
                break;
            case 4:
                imageView.setImageResource(R.drawable.indra_hal_3);
                break;
            case 5:
                imageView.setImageResource(R.drawable.indra_hal_4);
                break;
            case 6:
                imageView.setImageResource(R.drawable.indra_hal_5);
                break;
            case 7:
                imageView.setImageResource(R.drawable.indra_hal_6);
                break;
            case 8:
                imageView.setImageResource(R.drawable.indra_hal_7);
                break;
            case 9:
                imageView.setImageResource(R.drawable.indra_hal_8);
                break;
            case 10:
                imageView.setImageResource(R.drawable.indra_hal_9);
                break;
            case 11:
                imageView.setImageResource(R.drawable.indra_hal_10);
                break;
            case 12:
                imageView.setImageResource(R.drawable.indra_hal_11);
                break;
            case 13:
                imageView.setImageResource(R.drawable.indra_hal_12);
                break;
            case 14:
                imageView.setImageResource(R.drawable.indra_hal_13);
                break;
            case 15:
                imageView.setImageResource(R.drawable.indra_hal_14);
                break;
            case 16:
                imageView.setImageResource(R.drawable.indra_hal_15);
                break;
            case 17:
                imageView.setImageResource(R.drawable.sistem_auditori);
                break;
            case 18:
                imageView.setImageResource(R.drawable.indra_hal_16);
                break;
            case 19:
                imageView.setImageResource(R.drawable.indra_hal_17);
                break;
            case 20:
                imageView.setImageResource(R.drawable.indra_hal_18);
                break;
            case 21:
                imageView.setImageResource(R.drawable.indra_hal_19);
                break;
            case 22:
                imageView.setImageResource(R.drawable.indra_hal_20);
                break;



        }

        return viewGroup;
    }

}
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

public class CustomPager extends Fragment{

    public static final String PAGE = "page";
    ViewGroup viewGroup;
    ImageView imageView;
    private ScaleGestureDetector scaleGestureDetector;
    private Matrix matrix = new Matrix();

    public CustomPager() {
// TODO Auto-generated constructor stub
    }

    public static CustomPager create(int page) {

        CustomPager customPager = new CustomPager();
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
                imageView.setImageResource(R.drawable._ss_geser_);
                break;
            case 1:
                imageView.setImageResource(R.drawable.saraf_hal_0);
                break;
            case 2:
                imageView.setImageResource(R.drawable.saraf_hal_1);
                break;
            case 3:
                imageView.setImageResource(R.drawable.saraf_hal_2);
                break;
            case 4:
                imageView.setImageResource(R.drawable.saraf_hal_3);
                break;
            case 5:
                imageView.setImageResource(R.drawable.saraf_hal_4);
                break;
            case 6:
                imageView.setImageResource(R.drawable.saraf_hal_5);
                break;
            case 7:
                imageView.setImageResource(R.drawable.saraf_hal_5_1);
                break;
            case 8:
                imageView.setImageResource(R.drawable.saraf_hal_5_2);
                break;
            case 9:
                imageView.setImageResource(R.drawable.saraf_hal_5_3);
                break;
            case 10:
                imageView.setImageResource(R.drawable.saraf_hal_6);
                break;
            case 11:
                imageView.setImageResource(R.drawable.saraf_hal_7);
                break;
            case 12:
                imageView.setImageResource(R.drawable.saraf_hal_8);
                break;
            case 13:
                imageView.setImageResource(R.drawable.saraf_hal_9);
                break;
            case 14:
                imageView.setImageResource(R.drawable.saraf_hal_10);
                break;
            case 15:
                imageView.setImageResource(R.drawable.saraf_hal_11);
                break;
            case 16:
                imageView.setImageResource(R.drawable.saraf_hal_12);
                break;
            case 17:
                imageView.setImageResource(R.drawable.saraf_hal_13);
                break;
            case 18:
                imageView.setImageResource(R.drawable.saraf_hal_14);
                break;
            case 19:
                imageView.setImageResource(R.drawable.saraf_hal_15);
                break;
            case 20:
                imageView.setImageResource(R.drawable.saraf_hal_16);
                break;
            case 21:
                imageView.setImageResource(R.drawable.saraf_hal_17);
                break;
            case 22:
                imageView.setImageResource(R.drawable.saraf_hal_18);
                break;
            case 23:
                imageView.setImageResource(R.drawable.saraf_hal_19);
                break;
            case 24:
                imageView.setImageResource(R.drawable.saraf_hal_20);
                break;
            case 25:
                imageView.setImageResource(R.drawable.saraf_hal_21);
                break;
            case 26:
                imageView.setImageResource(R.drawable.saraf_hal_21_2);
                break;
            case 27:
                imageView.setImageResource(R.drawable.saraf_hal_22);
                break;
            case 28:
                imageView.setImageResource(R.drawable.saraf_hal_23);
                break;
            case 29:
                imageView.setImageResource(R.drawable.saraf_spinal);
                break;
            case 30:
                imageView.setImageResource(R.drawable.saraf_hal_24);
                break;
            case 31:
                imageView.setImageResource(R.drawable.saraf_hal_25);
                break;

        }

        return viewGroup;
    }

}
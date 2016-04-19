package com.hardinata.restu.sistemkoordinasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Button SOAL
        Button button_soal = (Button) findViewById(R.id.button_soal);

        button_soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SoalKuis.class);
                startActivity(i);
                finish();
            }
        });

        //Button SOAL 2
        Button button_soal1 = (Button) findViewById(R.id.button_soal1);

        button_soal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EvaluasiActivity.class);
                startActivity(i);
                finish();
            }
        });


        //Button TEST BUTA WARNA
        Button button_test_warna = (Button) findViewById(R.id.button_test_buta_warna);

        button_test_warna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), QuizMain.class);
                startActivity(i);
                finish();
            }
        });

    }

}
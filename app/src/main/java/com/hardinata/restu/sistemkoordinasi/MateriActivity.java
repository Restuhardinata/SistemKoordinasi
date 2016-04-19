package com.hardinata.restu.sistemkoordinasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MateriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        //Button Pendahuluan
        Button button0 = (Button) findViewById(R.id.button0);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ScreenSlideActivityPendahuluan.class);
                startActivity(i);
            }
        });

        //Button Sistem Saraf
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ScreenSlideActivity.class);
                startActivity(i);
            }
        });

        //Button Sistem Endokrin
        Button button1 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ScreenSlideActivityEndokrin.class);
                startActivity(i);
            }
        });

        //Button Sistem Indra
        Button button2 = (Button) findViewById(R.id.button3);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ScreenSlideActivityIndra.class);
                startActivity(i);
            }
        });

    }

}
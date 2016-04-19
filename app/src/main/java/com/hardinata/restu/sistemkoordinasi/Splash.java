package com.hardinata.restu.sistemkoordinasi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by User on 3/24/2016.
 */
public class Splash extends AppCompatActivity {
    private static final int SPLASH_TIME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(Splash.this, MainActivity.class);
                        startActivity(intent);
                        Splash.this.finish();
            }

        }, SPLASH_TIME);
    }

    public boolean onCreateOptionsLayout (View view){
        getLayoutInflater().inflate(R.layout.activity_main, null);
        return true;
    }
}

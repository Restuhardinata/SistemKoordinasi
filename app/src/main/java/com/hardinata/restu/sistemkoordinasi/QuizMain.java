package com.hardinata.restu.sistemkoordinasi;

import android.R.string;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizMain extends AppCompatActivity implements OnClickListener {

     Button btn_jwb, btn_next, btn_cobalagi;
     TextView salahbenar;
     EditText ngisi;
     ImageView soal;
     int []pertanyaan = {R.drawable.buta_warna_1,R.drawable.buta_warna_2,R.drawable.buta_warna_3,
                                R.drawable.buta_warna_4,R.drawable.buta_warna_5,R.drawable.buta_warna_6,R.drawable.buta_warna_7,
                                R.drawable.buta_warna_8,R.drawable.buta_warna_9,R.drawable.buta_warna_10,R.drawable.buta_warna_11,
                                R.drawable.buta_warna_12};
     String [] jawaban = {"26","73","42","5","3","2","7","74","42","6","45","12"};
     int indeks = 0;
     int salah = 0 , benar = 0 , skor = 0;

     @Override
     protected void onCreate(Bundle savedInstanceState)
     {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.soal);

           soal = (ImageView)findViewById(R.id.imagekatniss);
           soal.setImageResource(pertanyaan[0]);

           salahbenar=(TextView)findViewById(R.id.salahbenar);

           btn_jwb = (Button)findViewById(R.id.btn_jwb);
           btn_jwb.setOnClickListener(this);

           btn_next = (Button)findViewById(R.id.btn_next);
           btn_next.setOnClickListener(this);

           btn_cobalagi = (Button)findViewById(R.id.btn_cobalagi);
           btn_cobalagi.setOnClickListener(this);

     }

     public boolean onCreateOptionsMenu(View view) {
           // Inflate the menu; this adds items to the action bar if it is present.
           getLayoutInflater().inflate(R.layout.soal, null);
           return true;
     }

     @Override
     public void onClick(View v)
     {
           if (v==btn_jwb)
           {
                ngisi = (EditText)findViewById(R.id.editTextisi);
                String jawabanuser = ngisi.getText().toString();
                if (jawabanuser.equalsIgnoreCase(jawaban[indeks]))
                {
                    btn_cobalagi.setVisibility(View.INVISIBLE);
                }
                else
                {
                    btn_cobalagi.setVisibility(View.VISIBLE);
                }
               btn_next.setVisibility(View.VISIBLE);
           }
           else if (v==btn_next)

           {
                if (indeks<pertanyaan.length-1)
                {
                     indeks ++;
                     soal.setImageResource(pertanyaan[indeks]);
                     salahbenar.setText("");
                     ngisi.setText("");
                }
                btn_next.setVisibility(View.INVISIBLE);
           }
     }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(QuizMain.this);
        builder.setMessage("Do you really want to exit?").setCancelable(
                false).setPositiveButton("Quit",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        QuizMain.this.finish();
                        Intent intent = new Intent(QuizMain.this, QuizActivity.class);
                        startActivity(intent);

                    }
                }).setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
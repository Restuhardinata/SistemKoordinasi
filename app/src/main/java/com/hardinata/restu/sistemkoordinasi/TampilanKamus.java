package com.hardinata.restu.sistemkoordinasi;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TampilanKamus extends Activity {

    private SQLiteDatabase db = null;
    private Cursor kamusCursor = null;
    private EditText txtISTILAH;
    private EditText txtDESKRIPSI;
    private DataKamus datakamus = null;
    public static final String ISTILAH = "ISTILAH";
    public static final String DESKRIPSI = "DESKRIPSI";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datakamus = new DataKamus(this);
        db = datakamus.getWritableDatabase();
        datakamus.createTable(db);
        datakamus.generateData(db);

        setContentView(R.layout.kamus);
        txtISTILAH = (EditText) findViewById(R.id.txtISTILAH);
        txtDESKRIPSI = (EditText) findViewById(R.id.txtDESKRIPSI);

    }

    public void getSEARCH(View view) {
        String result = "";
        String englishword = txtISTILAH.getText().toString();
        kamusCursor = db.rawQuery("SELECT ID, ISTILAH, DESKRIPSI "
                + "FROM kamus where ISTILAH='" + englishword
                + "' ORDER BY ISTILAH", null);

        if (kamusCursor.moveToFirst()) {
            result = kamusCursor.getString(2);
            for (; !kamusCursor.isAfterLast(); kamusCursor.moveToNext()) {
                result = kamusCursor.getString(2);
            }
        }
        if (result.equals("")) {
            result = "Search Not Found";
        }
        txtDESKRIPSI.setText(result);

    }
    public void onBackPressed() {
        finish();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
//        kamusCursor.close();
        db.close();
    }
}
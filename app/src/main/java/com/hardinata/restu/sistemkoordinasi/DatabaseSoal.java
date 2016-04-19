package com.hardinata.restu.sistemkoordinasi;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseSoal extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public DatabaseSoal(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "26");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_1);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "73");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_2);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "42");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_3);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "5");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_4);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "3");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_5);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "2");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_6);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "7");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_7);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "74");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_8);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "42");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_9);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "6");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_10);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "45");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_11);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Angka berapa yang anda lihat?");
        values.put("pil_a", "12");
        values.put("jwban","1");
        values.put("img", R.drawable.buta_warna_12);
        db.insert("tbl_soal", "soal", values);

    }

    public List<Evaluasi> getSoal(){
        List<Evaluasi> listSoal = new ArrayList<Evaluasi>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Evaluasi s = new Evaluasi();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setJwban(cursor.getInt(3));
                s.setGambar(cursor.getInt(4));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        onCreate(db);

    }

}

package com.hardinata.restu.sistemkoordinasi;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseEvaluasi extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public DatabaseEvaluasi(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, pil_d TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Perhatikan gambar struktur telinga di atas!\n"+
                "Bagian dari telinga yang berfungsi untuk memperkuat intensitas getaran ditunjukkan oleh nomor...");
        values.put("pil_a", "1");
        values.put("pil_b", "3");
        values.put("pil_c", "4");
        values.put("pil_d", "5");
        values.put("jwban","4");
        values.put("img", R.drawable.kuping);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Perhatikan gambar struktur lidah di atas !\n" +
                "Bagian alat indera yang ditunjuk huruf X berfungsi untuk mengecap rasa....");
        values.put("pil_a", "pahit");
        values.put("pil_b", "asin");
        values.put("pil_c", "asam");
        values.put("pil_d", "manis");
        values.put("jwban","1");
        values.put("img", R.drawable.lidah_manusia);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Perhatikan gambar neuron di atas !\n" +
                "Bagian yang ditunjukkan oleh nomor 1, 2, dan 6 secara berurutan adalah...");
        values.put("pil_a", "akson-badan sel-nodus ranvier");
        values.put("pil_b", "dendrit-badan sel-selubung mielin");
        values.put("pil_c", "neurit-nukleus-nodus ranvier");
        values.put("pil_d", "badan sel-dendrit-selubung mielin");
        values.put("jwban","2");
        values.put("img", R.drawable.neuroon);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Perhatikan gambar neuron di atas !\n" +
                "Bagian yang ditunjukkan oleh nomor 2 berfungsi untuk...");
        values.put("pil_a", "menerima impuls dari neuron lainnya");
        values.put("pil_b", "mengirimkan impuls ke neuron lainnya");
        values.put("pil_c", "mengendalikan metabolisme neuron");
        values.put("pil_d", "mempercepat jalannya impuls");
        values.put("jwban","3");
        values.put("img", R.drawable.neuroon);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Perhatikan gambar bagian-bagian dari Serebrum di atas !\n" +
                "Bagian yang ditunjukkan oleh nomor 1, 2, 3, dan 4 secara berurutan adalah...");
        values.put("pil_a", "lobus temporal-lobus oksipital-lobus parietal-lobus frontal");
        values.put("pil_b", "lobus oksipital-lobus parietal-lobus temporal-lobus frontal");
        values.put("pil_c", "lobus frontal-lobus oksipital-lobus parietal-lobus temporal");
        values.put("pil_d", "lobus temporal-lobus parietal-lobus oksipital-lobus frontal");
        values.put("jwban","1");
        values.put("img", R.drawable.otak);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Perhatikan gambar bagian-bagian dari Serebrum di atas !\n" +
                "Bagian yang berfungai sebagai pusat intelektual dan fisik ditunjukkan oleh nomor...");
        values.put("pil_a", "1");
        values.put("pil_b", "2");
        values.put("pil_c", "3");
        values.put("pil_d", "4");
        values.put("jwban","4");
        values.put("img", R.drawable.otak);
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
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setPil_d(cursor.getString(5));
                s.setJwban(cursor.getInt(6));
                s.setGambar(cursor.getInt(7));
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
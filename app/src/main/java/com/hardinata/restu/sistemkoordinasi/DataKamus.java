package com.hardinata.restu.sistemkoordinasi;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataKamus extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dbkamus";
    public static final String ISTILAH= "ISTILAH";
    public static final String DESKRIPSI = "DESKRIPSI";

    //Constructor DataKamus untuk initiate database
    public DataKamus(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    //method createTable untuk membuat table kamus
    public void createTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus (id INTEGER PRIMARY KEY AUTOINCREMENT, ISTILAH TEXT, DESKRIPSI TEXT);");
    }

    //method generateData untuk mengisikan data ke kamus.
    public void generateData(SQLiteDatabase db){
        ContentValues cv=new ContentValues();
        cv.put(ISTILAH, "neuron");
        cv.put(DESKRIPSI, "Unit fungsional sistem saraf, berukuran panjang sekita 39 inci, serta terdiri atas bagian badan sel, dendrit, dan akson");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "perikarion");
        cv.put(DESKRIPSI, "Berfungsi mengendalikan metabolisme keseluruhan neuron");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "sel neuroglia");
        cv.put(DESKRIPSI, "Sel penunjang pada susunan saraf pusat yang berfungsi sebagai jaringan ikat");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "glia");
        cv.put(DESKRIPSI, "Sel penunjang pada susunan saraf pusat yang berfungsi sebagai jaringan ikat");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "dendrit");
        cv.put(DESKRIPSI, "Juluran sitoplasma yang relatif pendek, bercabang-cabang, dan berfungsi untuk menerima impuls (sinyal) dari sel lain untuk dikirimkan ke badan sel");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "neuron multipolar");
        cv.put(DESKRIPSI, "Memiliki satu akson dan dua dendrit atau lebih. Contohnya, neuron yang terdapat di otak dan medula spinalis");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "neuron bipolar");
        cv.put(DESKRIPSI, "Memiliki dua juluran berupa dendrit dan akson. Contohnya, neuron pada organ indra seperti mata, hidung, dan telinga");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "neuron unipolar");
        cv.put(DESKRIPSI, "Neuron bipolar yang tampak hanya memiliki satu juluran dari badan sel. Contohnya, neuron pada embrio dan fotoreseptor mata");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "astrosit");
        cv.put(DESKRIPSI, "Berbentuk bintang, berfungsi sebagai lem yang menyatukan neuron-neuron");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "oligodendrosit");
        cv.put(DESKRIPSI, "Bentuk menyerupai astrosit tetapi memiliki badan sel yang lebih kecil, membentuk lapisan mielin untuk melapisi akson");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "mikroglia");
        cv.put(DESKRIPSI, "Berukuran paling kecil dan bersifat fagosit, berfungsi untuk pertahanan imun");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "sel ependima");
        cv.put(DESKRIPSI, "Merupakan membran epitelium yang melapisi rongga serebral dan medula spinalis");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "eksitasi");
        cv.put(DESKRIPSI, "Meningkatkan impuls, contohnya asetilkolin dan norepinefrin");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "inhibisi");
        cv.put(DESKRIPSI, "Menghambat impuls, contohnya GABA (gamma aminobutyric acid) pada jaringan otak dan glisin pada medula spinalis");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "sinapsis");
        cv.put(DESKRIPSI, "Hubungan antara neuron yang satu dengan neuron lainnya;titik temu antara ujung akson dari neuron yang satu dengan dendrit dari neuron lainnya");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "impuls saraf");
        cv.put(DESKRIPSI, "Rangsangan/pesan yang diterima oleh reseptor dari lingkungan luar, kemudian dibawa oleh neuron atau serangkaian pulsa elekktrik yang menjadi serabut saraf");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "gerak sadar");
        cv.put(DESKRIPSI, "Gerak yang terjadi karena disengaja atau disadari");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "gerak refleks");
        cv.put(DESKRIPSI, "Gerak yang tidak disengaja atau tidak disadari");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "meninges");
        cv.put(DESKRIPSI, "Lapisan pelindung dari jaringan ikat yang terdapat pada otak dan medula spinalis");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "pia mater");
        cv.put(DESKRIPSI, "Lapisan terdalam pada meninges yang halus dan tipis, mengandung banyak pembuluh darah, serta melekat pada otak atau medula spinalis");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "piamater");
        cv.put(DESKRIPSI, "Lapisan terdalam pada meninges yang halus dan tipis, mengandung banyak pembuluh darah, serta melekat pada otak atau medula spinalis");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "araknoid");
        cv.put(DESKRIPSI, "Lapisan tengah pada meninges, mengandung sedikit pembuluh darah.");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "dura mater");
        cv.put(DESKRIPSI, "Lapisan terluar pada meninges, tebal dan kuat, serta terdiri dari dua lapisan");
        db.insert("kamus", ISTILAH, cv);
        cv.put(ISTILAH, "duramater");
        cv.put(DESKRIPSI, "Lapisan terluar pada meninges, tebal dan kuat, serta terdiri dari dua lapisan");
        db.insert("kamus", ISTILAH, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
    }
}
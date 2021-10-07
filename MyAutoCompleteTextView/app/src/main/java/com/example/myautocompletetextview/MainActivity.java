package com.example.myautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    //membuat array konstantan nama kota, menggunakan static agar bisa langsung terpanggil
    private static final String[] KOTA = new String[] {
            "Magetan", "Madiun", "Jember", "Bondowoso", "Lumajang", "Banyuwangi", "Malang", "yogyakarta", "Kediri",
    };
    //dideklarasikan
    AutoCompleteTextView autoCompleteKota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteKota = findViewById(R.id.autoCompleteKota); //sode masi eror dan belum tau sumber eror

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, KOTA);
        autoCompleteKota.setAdapter(adapter);
    }
}

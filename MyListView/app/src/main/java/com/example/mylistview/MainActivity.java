package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {
    // membuat methode ListViewMonth
    ListView ListViewMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mendeklarasikan data array dari daftar nama bulan
        ListViewMonth = findViewById(R.id.listViewMonth);
        //meng get data untuk mendapatkan daftar nama bulan
        String[] months = new DateFormatSymbols().getMonths();
        //menampilkan data list ke listview melalui adaptep
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        ListViewMonth.setAdapter(adapter);
        //action klik
        ListViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
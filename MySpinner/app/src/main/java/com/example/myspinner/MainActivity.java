package com.example.myspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // membuat methode spinner
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //untuk menampilkan id layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);  // kode eror, masi belum tau sebab eror

        //membuat adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.country, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            //membuat toas
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String negara = parent.getItemAtPosition(position).toString();
                Toast.makeText(parent.getContext(), "Pilih negara: "+ negara, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
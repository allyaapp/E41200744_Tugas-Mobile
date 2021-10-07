package com.example.recyclerviewdatamovie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //mendeklarasi recyclerView
    RecyclerView recyclerView;
    //memanggil objek dari movie recycler view adapter
    MoviesRecyclerViewAdapter adapter;
    ArrayList<Movies> objMovies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        // Mengisi data movie
        objMovies.add(new Movies("Squid Game", "Action, Adventure, Drama", "Dong-hyuk Hwang", 8.3, "Hundreds of cash-strapped players accept a strange invitation to compete in children's games. Inside, a tempting prize awaits with deadly high stakes. A survival game that has a whopping 45.6 billion-won prize at stake", "17 September 2021"));
        objMovies.add(new Movies("Train to Busan", "Action, Horor, Thriller", "Sang-ho Yeon", 7.6, "While a zombie virus breaks out in South Korea, passengers struggle to survive on the train from Seoul to Busan.", "2016"));
        objMovies.add(new Movies("Ajari Aku Islam", "Drama", "Deni Pusung", 7.7, "Kenny (Roger Danuarta), a Medan Chinese young man fell in love with Fidya (Cut Meyriska) a Batak Melayu Muslim girl. Over time, they love each other, but they were also hit by cultural and religious differences.", "2019"));
        objMovies.add(new Movies("Miracle in Cell No. 7", "Drama", "Mehmet Ada Öztekin", 8.2, "A story of love between a mentally-ill father who was wrongly accused of murder and his lovely six year old daughter. Prison will be their home. Based on the 2013 Korean movie 7-beon-bang-ui seon-mul (2013).", "2019"));
        objMovies.add(new Movies("Flu", "Action, Drama", "Sung-su Kim", 6.6, "Chaos ensues when a lethal, airborne virus infects the population of a South Korean city less than 20 kilometers from Seoul.", "2013"));

        //menerapkan adapter u tuk menampilkan data
        adapter = new MoviesRecyclerViewAdapter(objMovies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}
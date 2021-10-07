package com.example.recyclerviewdatamovie;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Movie;
import android.os.Bundle;
import android.widget.TextView;

public class DetailMovieActivity2 extends AppCompatActivity {
    //mendeklarasi dari activity detail movie
    TextView textViewTitle, textViewRating, textViewGenre, textViewReleaseDate, textViewDirector, textViewDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie2);

        textViewTitle = findViewById(R.id.tvTitle);
        textViewRating = findViewById(R.id.tvRating);
        textViewGenre = findViewById(R.id.tvGenre);
        textViewReleaseDate = findViewById(R.id.tvReleaseDate);
        textViewDirector = findViewById(R.id.tvDirector);
        textViewDescription = findViewById(R.id.tvDescription);

        //memanggil data intent
        Movies movies = getIntent().getParcelableExtra("MOVIES");
        // meng set nilai
        textViewTitle.setText(movies.getTitle());
        textViewRating.setText(String.valueOf(movies.getRating()));
        textViewGenre.setText(movies.getGenre());
        textViewReleaseDate.setText(movies.getReleasedate());
        textViewDirector.setText(movies.getDirector());
        textViewDescription.setText(movies.getDescription());

    }
}
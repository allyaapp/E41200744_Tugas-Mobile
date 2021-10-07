package com.example.recyclerviewdatamovie;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MoviesRecyclerViewAdapter extends RecyclerView.Adapter<MoviesRecyclerViewAdapter.MovieViewHolder> {
    ArrayList<Movies> arrayListMovies;

    public MoviesRecyclerViewAdapter(ArrayList<Movies> arrayListMovies) {
        this.arrayListMovies = arrayListMovies;
    }

    @NonNull
    @Override
    public MoviesRecyclerViewAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesRecyclerViewAdapter.MovieViewHolder holder, int position) {
        // untuk nge get data dari setiap index objek
        final Movies movies = arrayListMovies.get(position);

        // memanggil nilai yang tersimpan di array list
        holder.textViewTitle.setText(movies.getTitle());
        holder.textViewRating.setText(String.valueOf(movies.getRating()));
        holder.textViewReleaseDate.setText(movies.getReleasedate());

        //memberikan action pada saat data di klik untuk menampilkan detail list
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //melempar nilai agar dapat ditangkap detail movie
                Intent intent = new Intent(holder.itemView.getContext(), DetailMovieActivity2.class);
                intent.putExtra("MOVIES", movies);
                //menjalankan perpindahan dari main activity ke detail movie
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListMovies.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewRating, textViewReleaseDate;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.tvTitle);
            textViewRating = itemView.findViewById(R.id.tvRating);
            textViewReleaseDate = itemView.findViewById(R.id.tvReleaseDate);
        }
    }
}

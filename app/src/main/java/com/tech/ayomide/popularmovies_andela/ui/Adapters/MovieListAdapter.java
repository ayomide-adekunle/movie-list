package com.tech.ayomide.popularmovies_andela.ui.Adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tech.ayomide.popularmovies_andela.Model.PopularMovies;
import com.tech.ayomide.popularmovies_andela.Model.Result;
import com.tech.ayomide.popularmovies_andela.R;

import com.tech.ayomide.popularmovies_andela.ui.OnItemClickListener;

import java.util.List;


public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.ViewHolder> {

    private OnItemClickListener mMovieClick;
    private Context mContext;
    private List<Result> mMovies;
    private LayoutInflater mInflater;

    public MovieListAdapter(List<Result> movies, Context context, OnItemClickListener movieClick){
        this.mContext = context;
        mInflater = LayoutInflater.from(mContext);
        mMovies = movies;
        this.mMovieClick = movieClick;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.grid_item, parent, false);
        return new ViewHolder(view, mMovieClick);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(mMovies.get(position));
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }


    public void updateAdapter(List<Result> movies) {
        notifyDataSetChanged();
        mMovies = movies;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbnail;

        public ViewHolder(View itemView, final OnItemClickListener mMovieClick) {
            super(itemView);

            thumbnail =(ImageView) itemView.findViewById(R.id.movie_tumbnail);
        }

        public void bind(final Result movie){
            Picasso.with(itemView.getContext())
                    .load(movie.getThumbnailImage())
                    .into(thumbnail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mMovieClick.onItemClick(movie, thumbnail);
                }
            });
        }


    }
}

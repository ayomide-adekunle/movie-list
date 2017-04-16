package com.tech.ayomide.popularmovies_andela.Data;

import com.tech.ayomide.popularmovies_andela.Data.Remote.MovieRestService;
import com.tech.ayomide.popularmovies_andela.Model.PopularMovies;


public class MovieRepository {

    private MovieRestService mMovieRestService;

    public MovieRepository(MovieRestService movieRestService){
        this.mMovieRestService = movieRestService;
    }

    public PopularMovies getPopuplar(String filter, String key){
        //mMovieRestService.getMovies(filter, key).
        return null;
    }
}

package com.tech.ayomide.popularmovies_andela.Data.Remote;

import com.tech.ayomide.popularmovies_andela.Model.PopularMovies;
import io.reactivex.Observable;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface MovieRestService {

    @GET("movie/{filter}?language=en-US&page=1")
    Call<PopularMovies> getMovies(@Path("filter") String filter , @Query("api_key") String api_key);
}

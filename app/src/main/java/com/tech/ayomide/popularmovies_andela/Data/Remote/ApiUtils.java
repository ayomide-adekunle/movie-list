package com.tech.ayomide.popularmovies_andela.Data.Remote;

import com.tech.ayomide.popularmovies_andela.Data.RestClient;

public class ApiUtils {

    public static final String BASE_URL = "https://api.themoviedb.org/3/";

    public static com.tech.ayomide.popularmovies_andela.Data.Remote.MovieRestService getMovieRestService() {
        return RestClient.getClient(BASE_URL).create(com.tech.ayomide.popularmovies_andela.Data.Remote.MovieRestService.class);
    }
}

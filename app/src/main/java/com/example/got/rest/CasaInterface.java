package com.example.got.rest;

import com.example.got.model.CasaResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CasaInterface {
    // curl -X GET -i 'http://api.themoviedb.org/3/movie/top_rated?api_key=7e8f60e325cd06e164799af1e317d7a7'

    @GET("houses/")
    Call<CasaResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    // curl -X GET -i 'http://api.themoviedb.org/3/movie/238?api_key=7e8f60e325cd06e164799af1e317d7a7'

    @GET("movie/{id}")
    Call<CasaResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}

package com.example.got.rest;

import com.example.got.model.LivroResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface LivroInterface {
    // curl -X GET -i 'http://api.themoviedb.org/3/movie/top_rated?api_key=7e8f60e325cd06e164799af1e317d7a7'

    @GET("books/")
    Call<LivroResponse> getBooks(@Query("page") int page, @Query("pageSize")int pageSize);

}

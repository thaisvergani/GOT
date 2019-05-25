package com.example.got.activity;

import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.got.R;
import com.example.got.adapter.LivrosAdapter;
import com.example.got.model.Livro;
import com.example.got.model.LivroResponse;
import com.example.got.rest.ApiLivro;
import com.example.got.rest.LivroInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();


    // TODO - insert your themoviedb.org API KEY here
    //private final static String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //if (API_KEY.isEmpty()) {
        //    Toast.makeText(getApplicationContext(), "Please obtain your API KEY from themoviedb.org first!", Toast.LENGTH_LONG).show();
        //   return;
        //}

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        LivroInterface apiService =
                ApiLivro.getClient().create(LivroInterface.class);

        Call<LivroResponse> call = apiService.getBooks(1,50);
        call.enqueue(new Callback<LivroResponse>() {
            @Override
            public void onResponse(Call<LivroResponse> call, Response<LivroResponse> response) {
                int statusCode = response.code();
                List<Livro> movies = response.body().getResults();
                recyclerView.setAdapter(new LivrosAdapter(movies, R.layout.list_item_livro, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<LivroResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }
}

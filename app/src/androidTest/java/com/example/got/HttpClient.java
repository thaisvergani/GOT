package com.example.got;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpClient {

    public String doRequest(){
        OkHttpClient client = new OkHttpClient();
        String url = "https://www.anapioficeandfire.com/api/books";
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = null;

        try{
            response = client.newCall(request).execute();
             Log.e("HTTPCLIENT RESULT", response.body().string());
            return response.body().string();
        } catch (Exception ex){
            Log.e("HTTPCLIENT", ex.getMessage());
        }

        return null;
    }
}

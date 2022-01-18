package com.example.test;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitService {
    String URL = "http://13.125.171.174/";

    @GET("/rest_api_test")
    Call<PostResult> getURL();


//    @GET("/rest_api_test")
//    Call<List<PostResult>> getPosts(@Query("userid") String id);
}

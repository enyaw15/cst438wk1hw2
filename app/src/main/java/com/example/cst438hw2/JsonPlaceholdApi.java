package com.example.cst438hw2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholdApi {
    @GET("posts")
    Call<List<Post>> getPosts();
}

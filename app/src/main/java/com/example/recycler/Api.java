package com.example.recycler;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface Api {
    @Headers("Content-Type: application/json")
    @GET("v1/cases?country=Russia")
    Call< List <Get>> getGet();

}

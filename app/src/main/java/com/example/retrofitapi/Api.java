package com.example.retrofitapi;

import com.example.retrofitapi.Pojo.Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    //list for call type, 2nd type of the list(model)
    Call<List<Model>> getHeroes();



}

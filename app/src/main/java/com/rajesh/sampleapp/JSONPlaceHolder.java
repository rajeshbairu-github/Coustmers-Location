package com.rajesh.sampleapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceHolder {

    @GET("users")
    Call<List<UserData>> getUserDate();
}

package com.example.myapplication.data.retrofit;

import com.example.myapplication.data.models.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("forecast")
    Call<WeatherResponse> getWeather(@Query("q") String city,
                                     @Query("APPID") String key);
}

package com.vsc.demoproject.data.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("data/2.5/weather")
    Call<CurrentWeather> getCurrentWeater(@Query("q") String cityName,
                                          @Query("appid") String apiKey);
}

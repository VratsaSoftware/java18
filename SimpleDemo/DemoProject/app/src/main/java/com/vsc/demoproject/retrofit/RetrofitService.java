package com.vsc.demoproject.retrofit;

import com.vsc.demoproject.data.model.CurrentWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("data/2.5/weather")
    Call<CurrentWeather> getCurrentWeater(@Query("q") String cityName,
                                          @Query("appid") String apiKey);
}

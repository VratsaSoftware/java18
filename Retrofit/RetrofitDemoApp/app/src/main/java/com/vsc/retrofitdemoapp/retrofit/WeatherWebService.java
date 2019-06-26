package com.vsc.retrofitdemoapp.retrofit;

import com.vsc.retrofitdemoapp.models.CurrentWeather;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class WeatherWebService implements CurrentWeatherRepository {

    private static final String BASE_URL = "http://api.openweathermap.org";
    private static final String API_KEY = "3d999e294c31847d6359dc908859b157";

    private static WeatherWebService webService;
    private WeatherService service;

    private WeatherWebService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(WeatherService.class);
    }

    public static WeatherWebService getInstance() {
        if (webService == null) {
            return webService = new WeatherWebService();
        } else {
            return webService;
        }
    }


    @Override
    public void getWeather(String name, final CurrentWeatherListener listener) {
        Call<CurrentWeather> call = service.getCurrentWeater(name, API_KEY);
        call.enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                listener.onWeatherReceived(response.body());
            }

            @Override
            public void onFailure(Call<CurrentWeather> call, Throwable t) {
                listener.onWeatherFailed();
            }
        });
    }
}

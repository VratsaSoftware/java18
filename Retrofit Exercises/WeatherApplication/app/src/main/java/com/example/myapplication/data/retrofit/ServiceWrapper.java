package com.example.myapplication.data.retrofit;

import com.example.myapplication.data.models.WeatherResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceWrapper {
    Retrofit retrofit;
    WeatherService service;
    private static final String API_KEY = "2673c8b42291d1a7d4666b40ef428fca";

    public ServiceWrapper(){
        retrofit = new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/data/2.5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(WeatherService.class);
    }

    public void getWeather(String city, final WeatherListener weatherListener) {
        service.getWeather(city, API_KEY).enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.isSuccessful()) {
                    weatherListener.onWeatherReceived(response.body());
                } else  {
                    weatherListener.onError();
                }
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                t.printStackTrace();
                weatherListener.onError();
            }
        });
    }

    public interface WeatherListener{
        void onWeatherReceived(WeatherResponse weatherResponse);
        void onError();
    }
}

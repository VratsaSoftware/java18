package com.vsc.demoproject.retrofit;

import com.vsc.demoproject.data.ApiContants;
import com.vsc.demoproject.data.model.CurrentWeather;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitWebService implements RetrofitRepository {

    private static RetrofitWebService webService;
    private RetrofitService service;

    private RetrofitWebService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiContants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(RetrofitService.class);
    }

    public static RetrofitWebService getInstance() {
        if (webService == null) {
            return webService = new RetrofitWebService();
        } else {
            return webService;
        }
    }

    @Override
    public void getCurrentWeather(String city, final WeatherListener listener) {
        Call<CurrentWeather> call = service.getCurrentWeater(city, ApiContants.API_KEY);
        call.enqueue(new Callback<CurrentWeather>() {
            @Override
            public void onResponse(Call<CurrentWeather> call, Response<CurrentWeather> response) {
                listener.onWeatherReceived(response.body());
            }

            @Override
            public void onFailure(Call<CurrentWeather> call, Throwable t) {
            }
        });
    }
}

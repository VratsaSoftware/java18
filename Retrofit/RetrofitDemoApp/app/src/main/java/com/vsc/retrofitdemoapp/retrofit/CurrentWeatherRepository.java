package com.vsc.retrofitdemoapp.retrofit;

import com.vsc.retrofitdemoapp.models.CurrentWeather;

public interface CurrentWeatherRepository {

    void getWeather(String name, CurrentWeatherListener listener);

    interface CurrentWeatherListener {
        void onWeatherReceived(CurrentWeather currentWeather);

        void onWeatherFailed();
    }
}

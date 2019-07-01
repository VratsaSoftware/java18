package com.vsc.demoproject.retrofit;

import com.vsc.demoproject.data.model.CurrentWeather;

public interface RetrofitRepository {

    void getCurrentWeather(String city, WeatherListener listener);

    interface WeatherListener {

        void onWeatherReceived(CurrentWeather currentWeather);
    }
}

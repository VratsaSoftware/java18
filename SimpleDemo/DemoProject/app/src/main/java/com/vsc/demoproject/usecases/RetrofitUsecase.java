package com.vsc.demoproject.usecases;

import com.vsc.demoproject.data.model.CurrentWeather;
import com.vsc.demoproject.retrofit.RetrofitRepository;
import com.vsc.demoproject.retrofit.RetrofitWebService;

public class RetrofitUsecase {

    private RetrofitRepository retrofitRepository;
    private ViewListener viewListener;

    public RetrofitUsecase() {
        this.retrofitRepository = RetrofitWebService.getInstance();
    }

    public void getCurrentWeaher(String city) {
        retrofitRepository.getCurrentWeather(city, new RetrofitRepository.WeatherListener() {
            @Override
            public void onWeatherReceived(CurrentWeather currentWeather) {
                viewListener.showCurrentWeather(currentWeather.getName()
                        + " " + currentWeather.getMain().getTemp());
            }
        });
    }

    public void setViewListener(ViewListener listener) {
        this.viewListener = listener;
    }

    public interface ViewListener {
        void showCurrentWeather(String currentWeatherInfo);
    }
}

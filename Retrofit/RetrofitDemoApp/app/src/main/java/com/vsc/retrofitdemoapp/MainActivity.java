package com.vsc.retrofitdemoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vsc.retrofitdemoapp.models.CurrentWeather;
import com.vsc.retrofitdemoapp.quotemodels.Quote;
import com.vsc.retrofitdemoapp.quoteretrofit.ForismaticRepository;
import com.vsc.retrofitdemoapp.quoteretrofit.ForismaticWebService;
import com.vsc.retrofitdemoapp.retrofit.CurrentWeatherRepository;
import com.vsc.retrofitdemoapp.retrofit.WeatherWebService;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String CITY_NAME = "Vratsa";

    private static final String METHOD = "getQuote";
    private static final String FORMAT = "json";
    private static final String LANG = "en";

    private CurrentWeatherRepository repository;
    private ForismaticRepository forismaticRepository;

    private Button btnGetWeather;
    private TextView txtCurrentTemp;
    private TextView txtQuote;
    private Button btnGetQuote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repository = WeatherWebService.getInstance();
        forismaticRepository = ForismaticWebService.getInstance();

        bindElements();
    }

    private void bindElements() {
        txtCurrentTemp = findViewById(R.id.txt_current_temp);
        btnGetWeather = findViewById(R.id.btn_get_temp);
        btnGetWeather.setOnClickListener(this);

        txtQuote = findViewById(R.id.txt_quote);
        btnGetQuote = findViewById(R.id.btn_get_quote);
        btnGetQuote.setOnClickListener(this);
    }

    private void getQuote() {
        forismaticRepository.getQuote(METHOD, FORMAT, LANG, new ForismaticRepository.ForismaticListener() {
            @Override
            public void onQuoteReceived(Quote quote) {
                txtQuote.setText(quote.getQuoteText() + "\n" + quote.getQuoteAuthor());
            }

            @Override
            public void onQuoteFailed() {

            }
        });
    }

    private void getCurrentWeather() {
        repository.getWeather(CITY_NAME, new CurrentWeatherRepository.CurrentWeatherListener() {
            @Override
            public void onWeatherReceived(CurrentWeather currentWeather) {
                txtCurrentTemp.setText(currentWeather.getName() + " " + currentWeather.getMain().getTemp() + "K");
            }

            @Override
            public void onWeatherFailed() {
                Log.e("Response", "API failed");
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get_temp:
                getCurrentWeather();
                break;
            case R.id.btn_get_quote:
                getQuote();
                break;
        }
    }
}

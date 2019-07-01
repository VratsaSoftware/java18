package com.vsc.demoproject.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vsc.demoproject.R;
import com.vsc.demoproject.data.ApiContants;
import com.vsc.demoproject.usecases.RetrofitUsecase;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        RetrofitUsecase.ViewListener, Toolbar.OnMenuItemClickListener {

    private TextView txtCurrentWeather;
    private Button btnGetWeather;
    private RetrofitUsecase usecase;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usecase = new RetrofitUsecase();
        usecase.setViewListener(this);

        txtCurrentWeather = findViewById(R.id.txt_weather_info);
        btnGetWeather = findViewById(R.id.btn_get_weather);
        btnGetWeather.setOnClickListener(this);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setOnMenuItemClickListener(this);
    }

    @Override
    public void onClick(View view) {
        usecase.getCurrentWeaher(ApiContants.CITY_NAME);
    }

    @Override
    public void showCurrentWeather(String currentWeatherInfo) {
        txtCurrentWeather.setText(currentWeatherInfo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        usecase.getCurrentWeaher(ApiContants.CITY_NAME);
        return false;
    }
}

package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.data.models.WeatherResponse;
import com.example.myapplication.data.retrofit.ServiceWrapper;
import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkWeather(binding.edtCity.getText().toString());
            }
        });
    }

    private void checkWeather(String city) {
        ServiceWrapper serviceWrapper = new ServiceWrapper();

        serviceWrapper.getWeather(city, new ServiceWrapper.WeatherListener() {
            @Override
            public void onWeatherReceived(WeatherResponse weatherResponse) {
                Log.e("TTT", weatherResponse.city.country);
                binding.txtWeatherInfo.setText(String.format("City: %s\nWeather: %s\nTemp: %.2f",
                        weatherResponse.city.name, weatherResponse.list.get(0).weather.get(0).description, weatherResponse.list.get(0).main.temp - 273,15));
            }

            @Override
            public void onError() {
                Toast.makeText(MainActivity.this, "Ooops! Something goes wrong!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

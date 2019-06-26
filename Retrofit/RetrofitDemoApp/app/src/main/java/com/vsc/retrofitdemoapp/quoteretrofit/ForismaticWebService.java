package com.vsc.retrofitdemoapp.quoteretrofit;

import com.vsc.retrofitdemoapp.quotemodels.Quote;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ForismaticWebService implements ForismaticRepository {

    private static final String BASE_URL = "http://api.forismatic.com/api/";

    private static ForismaticWebService webService;
    private ForismaticService service;

    private ForismaticWebService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(ForismaticService.class);

    }

    public static ForismaticWebService getInstance() {
        if (webService == null) {
            return webService = new ForismaticWebService();
        } else {
            return webService;
        }
    }


    @Override
    public void getQuote(String method, String format, String lang, final ForismaticListener listener) {
        Call<Quote> call = service.getQuote(method, format, lang);
        call.enqueue(new Callback<Quote>() {
            @Override
            public void onResponse(Call<Quote> call, Response<Quote> response) {
                listener.onQuoteReceived(response.body());
            }

            @Override
            public void onFailure(Call<Quote> call, Throwable t) {
                listener.onQuoteFailed();
            }
        });
    }
}

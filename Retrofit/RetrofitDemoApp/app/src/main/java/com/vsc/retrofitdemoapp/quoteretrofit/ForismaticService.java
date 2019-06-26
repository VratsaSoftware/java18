package com.vsc.retrofitdemoapp.quoteretrofit;

import com.vsc.retrofitdemoapp.quotemodels.Quote;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ForismaticService {

    @POST("1.0/")
    Call<Quote> getQuote(@Query("method") String method, @Query("format") String format,
                         @Query("lang") String lang);
}

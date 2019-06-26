package com.vsc.retrofitdemoapp.quoteretrofit;

import com.vsc.retrofitdemoapp.quotemodels.Quote;

public interface ForismaticRepository {

    void getQuote(String method, String format, String lang, ForismaticListener listener);

    interface ForismaticListener {
        void onQuoteReceived(Quote quote);

        void onQuoteFailed();
    }
}

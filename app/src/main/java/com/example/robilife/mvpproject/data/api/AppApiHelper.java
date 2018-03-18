package com.example.robilife.mvpproject.data.api;

import android.util.Log;

import com.example.robilife.mvpproject.data.api.model.QuoteOfTheDayResponse;
import com.example.robilife.mvpproject.data.api.model.markesResponse;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by khalifa on 1/4/18.
 */
@Singleton
public class AppApiHelper implements ApiHelper {

    private static final String TAG = "AppApiHelper";

    private ApiService mApiService;

    @Inject
    public AppApiHelper(ApiService apiService) {
        mApiService = apiService;
    }

    @Override
    public QuoteOfTheDayResponse getQuot() {

        final QuoteOfTheDayResponse quoteOfTheDayResponse = new QuoteOfTheDayResponse();

        Call<QuoteOfTheDayResponse> call = mApiService.getQuoteOfTheDay();
        call.enqueue(new Callback<QuoteOfTheDayResponse>() {
            @Override
            public void onResponse(Call<QuoteOfTheDayResponse> call, Response<QuoteOfTheDayResponse> response) {
               if (response.body() != null){
                   quoteOfTheDayResponse.setContents(response.body().getContents());
                   quoteOfTheDayResponse.setSuccess(response.body().getSuccess());
               }
                else
                   try {
                       Log.d(TAG, "onResponse: null"+response.errorBody().string());
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
            }

            @Override
            public void onFailure(Call<QuoteOfTheDayResponse> call, Throwable t) {

                Log.d(TAG, "onFailure: "+t.getMessage().toString());
            }
        });

        /*Call<markesResponse> call = mApiService.getListMark();
        call.enqueue(new Callback<markesResponse>() {
            @Override
            public void onResponse(Call<markesResponse> call, Response<markesResponse> response) {
                if (response.body() != null){
                    for (int i = 0; i < response.body().getData().size(); i++) {
                        Log.d(TAG, "onResponse: "+response.body().getData().get(i).getName());
                    }
                }
                else
                    try {
                        Log.d(TAG, "onResponse: null"+response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }

            @Override
            public void onFailure(Call<markesResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.getMessage());
            }
        });*/
        return quoteOfTheDayResponse;
    }

}

package com.example.robilife.mvpproject.data.api;

import com.example.robilife.mvpproject.data.api.model.QuoteOfTheDayResponse;
import com.example.robilife.mvpproject.data.api.model.markesResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by khalifa on 1/16/18.
 */

public interface ApiService {

    @GET("qod.json")
    Call<QuoteOfTheDayResponse> getQuoteOfTheDay();

    /*@GET(ApiEndPoint.ENDPOINT_LIST_MAKES)
    Call<markesResponse> getListMark();*/
}

package com.example.robilife.mvpproject.data.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by khalifa on 1/16/18.
 */

public class Contents {

    @SerializedName("quotes")
    @Expose
    private List<Quote> quotes = null;

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }
}

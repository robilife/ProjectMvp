package com.example.robilife.mvpproject.data.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by khalifa on 1/16/18.
 */

public class QuoteOfTheDayResponse {

    @SerializedName("success")
    @Expose
    private Success success;
    @SerializedName("contents")
    @Expose
    private Contents contents;

    public Success getSuccess() {
        return success;
    }

    public void setSuccess(Success success) {
        this.success = success;
    }

    public Contents getContents() {
        return contents;
    }

    public void setContents(Contents contents) {
        this.contents = contents;
    }
}

package com.example.robilife.mvpproject.data.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by khalifa on 1/16/18.
 */

public class Quote {

    @SerializedName("quote")
    @Expose
    private String quote;
    @SerializedName("length")
    @Expose
    private String length;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("id")
    @Expose
    private String id;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

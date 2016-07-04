package com.android.atiqorin.newsapp;

/**
 * Created by atiqorin on 7/4/16.
 */
public class NewsItem {
    String title;
    String date;
    String url;
    String thumbnail;

    public NewsItem(String title, String date, String url, String thumbnail) {
        this.title = title;
        this.date = date;
        this.url = url;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}

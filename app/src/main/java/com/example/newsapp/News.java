package com.example.newsapp;

public class News {
    private String mSection;
    private String mWebPublicationDate;
    private String mWebTitle;
    private String mWebUrl;
    private String mAuthor;

    public News(String author, String section, String webTitle, String webPublicationDate, String webUrl) {
        mAuthor = author;
        mSection = section;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mWebUrl = webUrl;
    }
public String getSection() {
    return mSection;
}
    public String getWebTitle() {
        return mWebTitle;
    }

    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getWebUrl() {
        return mWebUrl;
    }

    public String getAuthor() {
        return mAuthor;
    }
}




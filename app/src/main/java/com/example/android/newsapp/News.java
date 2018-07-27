package com.example.android.newsapp;


/**
 * An {@link News} object contains information related to a single earthquake.
 */
public class News {


    /** Headline of the news story */
    private String mHeadline;

    /** Time of the earthquake */
    private String mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     *
     * @param headline is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public News(String headline, String timeInMilliseconds, String url) {

        mHeadline = headline;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Returns the location of the earthquake.
     */
    public String getHeadline() {
        return mHeadline;
    }

    /**
     * Returns the time of the earthquake.
     */
    public String getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}

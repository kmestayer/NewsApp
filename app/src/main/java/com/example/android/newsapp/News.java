package com.example.android.newsapp;


/**
 * An {@link News} object contains information related to a news story.
 */
public class News {


    /** Headline of the news story */
    private String mHeadline;

    /** Time of the earthquake */
    private String mTimeInMilliseconds;

    /** Website URL of the news story */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     *
     * @param headline is the headline of the story
     * @param timeInMilliseconds is the time when the story was posted
     * @param url is the website URL to find more details about the news story
     */
    public News(String headline, String timeInMilliseconds, String url) {

        mHeadline = headline;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }


    /**
     * Returns the headline of the story.
     */
    public String getHeadline() {
        return mHeadline;
    }

    /**
     * Returns the time of the story.
     */
    public String getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the story.
     */
    public String getUrl() {
        return mUrl;
    }
}

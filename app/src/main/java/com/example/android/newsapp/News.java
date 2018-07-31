package com.example.android.newsapp;


/**
 * An {@link News} object contains information related to a news story.
 */
public class News {


    /** Headline of the news story */
    private String mHeadline;

    /** Time of the earthquake */
    private String mDate;

    /** Website URL of the news story */
    private String mUrl;

    /**Contributor of article*/
    private String mContributor;

    /**
     * Constructs a new {@link News} object.
     *
     *
     * @param headline is the headline of the story
     * @param date is the time when the story was posted
     * @param url is the website URL to find more details about the news story
     * @param contributor is contributor of the article
     */
    public News(String headline, String date, String url, String contributor) {

        mHeadline = headline;
        mDate = date;
        mUrl = url;
        mContributor = contributor;
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
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the story.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the contributor of the story.
     */
    public String getContributor() {
        return mContributor;
    }
}

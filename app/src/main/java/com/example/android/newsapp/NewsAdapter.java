package com.example.android.newsapp;


import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * An {@link NewsAdapter} knows how to create a list item layout for each news story
 * in the data source (a list of {@link News} objects).
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class NewsAdapter extends ArrayAdapter<News> {

    /** String containing the split position of Date **/
    private static final String DATE_SEPARATOR = "T";
    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news is the list of news stories, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news story at the given position in the list of news stories
        News currentNews = getItem(position);


        // Get the original location string from the News object
        String originalHeadline = currentNews.getHeadline();

        // Find the TextView with view ID location
        TextView originalHeadlineView = listItemView.findViewById(R.id.headline);
        // Display the headline of the current news story in that TextView
        originalHeadlineView.setText(originalHeadline);

        // Get the contributer name
        String contributor = currentNews.getContributor();
        // Find the TextView with contributor location
        TextView contributorView = listItemView.findViewById(R.id.contributor);
        // Display the headline of the current news story in that TextView
        contributorView.setText(contributor);


        //Get date
        String originalDate = currentNews.getDate();
        String date =null;

        // If date contains a "T", split String here and assign first part to date.
        if(originalDate.contains(DATE_SEPARATOR)) {
            String[] parts = originalDate.split(DATE_SEPARATOR);
            date = parts[0];
        }

        // Converts the date to format of "MM-dd-yyyy".
        // Reference: https://stackoverflow.com/questions/35939337/how-to-convert-date-to-a-particular-format-in-android/35939543#35939543
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date newDate = null;
        try {
            newDate = spf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        spf = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        date = spf.format(newDate);

        // Sets text of the date TextView.
        // Find the TextView with view ID date
        TextView dateView = listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        dateView.setText(date);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}

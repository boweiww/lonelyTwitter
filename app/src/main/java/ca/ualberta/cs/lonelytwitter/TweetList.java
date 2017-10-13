package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.DuplicateFormatFlagsException;

/**
 * Created by Rebejohn on 2017-10-12.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList() {

    }

    public void add(Tweet tweet) {
        if(this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);

    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);

    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);

    }

    public int getCount(Tweet tweet) {
        return tweets.size();

    }


    public ArrayList<Tweet> getTweets() {

        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });
        return this.tweets;
    }

}

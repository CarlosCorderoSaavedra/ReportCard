package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;

public class ReportCard extends AppCompatActivity {

    private String mArtistName;
    private int mNumberOfAlbums;
    private int mNumberOfSongs;
    private int mNumberOfAwards;
    private int mNumberOfFeatures;
    private int mNumberOfPlatinumAlbums;

    public ReportCard(String artistName, int numberOfAlbums, int numberOfSongs, int numberOfAwards, int numberOfFeatures, int numberOfPlatinumAlbums) {

        mArtistName = artistName;
        mNumberOfAlbums = numberOfAlbums;
        mNumberOfSongs = numberOfSongs;
        mNumberOfAwards = numberOfAwards;
        mNumberOfFeatures = numberOfFeatures;
        mNumberOfPlatinumAlbums = numberOfPlatinumAlbums;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public void setmArtistName(String artistName) {
        this.mArtistName = artistName;

    }

    public int getmNumberOfAlbums() {
        return mNumberOfAlbums;
    }

    public void setmNumberOfAlbums(int numberOfAlbums) {
        mNumberOfAlbums = numberOfAlbums;
    }

    public int getmNumberOfSongs() {
        return mNumberOfSongs;
    }

    public void setmNumberOfSongs(int numberOfSongs) {
        mNumberOfSongs = numberOfSongs;
    }

    public int getmNumberOfAwards() {
        return mNumberOfAwards;
    }

    public void setmNumberOfAwards(int numberOfAwards) {
        mNumberOfAwards = numberOfAwards;
    }

    public int getmNumberOfFeatures() {
        return mNumberOfFeatures;
    }

    public void setmNumberOfFeatures(int numberOfFeatures) {
        mNumberOfFeatures = numberOfFeatures;
    }

    public int getmNumberOfPlatinumAlbums() {
        return mNumberOfPlatinumAlbums;
    }

    public void setmNumberOfPlatinumAlbums(int numberOfPlatinumAlbums) {
        mNumberOfPlatinumAlbums = numberOfPlatinumAlbums;
    }

    @Override
    public String toString() {
        return "Number of albums: " + getmNumberOfAlbums() + "\nNumber of songs " + getmNumberOfSongs() +
                "\nNumber of awards: " + getmNumberOfAwards() + "\nNumber of features: " + getmNumberOfFeatures() +
                "\nNumber of platinum albums: " + getmNumberOfPlatinumAlbums();
    }
}

package com.example.pt16.models;

import com.example.pt16.R;

import java.util.ArrayList;
import java.util.List;

public class MovieModel {
    private String title;
    private String badge;
    private String rating;
    private String year;
    private String duration;
    private String ageRating;
    private String genre;
    private String mediaType;
    private int imgResId;

    public MovieModel(String title, String badge, String rating, String year,
                      String duration, String ageRating, String genre, String mediaType, int imgResId) {
        this.title = title;
        this.badge = badge;
        this.rating = rating;
        this.year = year;
        this.duration = duration;
        this.ageRating = ageRating;
        this.genre = genre;
        this.mediaType = mediaType;
        this.imgResId = imgResId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        this.ageRating = ageRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public int getImgResId() {
        return imgResId;
    }

    public void setImgResId(int imgResId) {
        this.imgResId = imgResId;
    }

    public static List<MovieModel> generateData() {
        List<MovieModel> list = new ArrayList<>();
        list.add(new MovieModel(
                "Riverdale",
                "Free",
                "4.5",
                "2021",
                "148 Minutes",
                "PG-13",
                "Action",
                "Movie",
                R.drawable.movie_1
        ));
        list.add(new MovieModel(
                "Life of PI",
                "Premium",
                "4.5",
                "2021",
                "148 Minutes",
                "PG-13",
                "Action",
                "Movie",
                R.drawable.movie_2
        ));
        list.add(new MovieModel(
                "Avengers: Endgame",
                "Premium",
                "4.8",
                "2019",
                "181 Minutes",
                "PG-13",
                "Action",
                "Movie",
                R.drawable.movie_1
        ));
        list.add(new MovieModel(
                "Stranger Things",
                "Free",
                "4.7",
                "2022",
                "50 Minutes",
                "TV-MA",
                "Sci-Fi",
                "Series",
                R.drawable.movie_1
        ));
        list.add(new MovieModel(
                "The Dark Knight",
                "Premium",
                "4.9",
                "2008",
                "152 Minutes",
                "PG-13",
                "Action",
                "Movie",
                R.drawable.movie_2
        ));
        list.add(new MovieModel(
                "Inception",
                "Free",
                "4.8",
                "2010",
                "148 Minutes",
                "PG-13",
                "Sci-Fi",
                "Movie",
                R.drawable.movie_2
        ));
        return list;
    }
}

package day10.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Movie {
    private int id;
    private String title;
    private String genre;
    private String regDate;
    private String dateFormat;

    public Movie(int id, String title, String genre, String dateformat) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.dateFormat = dateformat;
    }

    public Movie() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public String getDate()
    {
        long currentTime = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String result = sdf.format(currentTime);
        return result;
    }

    public String toString()
    {
        return getId()+"\t"+getTitle()+"\t"+getGenre()+"\t"+getDate();
    }

}


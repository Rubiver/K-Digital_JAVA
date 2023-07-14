package day10.dto;

import java.util.List;

public class Movie {
    private int id;
    private String title;
    private String genre;

    public Movie(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
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
    public String toString()
    {
        return getId()+"\t"+getTitle()+"\t"+getGenre();
    }

}


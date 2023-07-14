package day10.dao;

import day10.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private List<Movie> movie = new ArrayList<>();

    public DAO (){}
    public void addMovie(Movie movie) {
        this.movie.add(movie);
    }
    public List<Movie> getMovie()
    {
        return movie;
    }
}

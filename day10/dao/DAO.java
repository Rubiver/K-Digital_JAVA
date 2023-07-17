package day10.dao;

import day10.dto.Movie;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private List<Movie> movie = new ArrayList<>();

    public DAO() {
    }

    public void addMovie(Movie movie) {
        this.movie.add(movie);
    }

    public List<Movie> getMovie() {
        return movie;
    }

    public List<Movie> searchByTitle(String title) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movie) {
            if (movie.getTitle().contains(title)) {
                result.add(movie);
            }
        }
        return result;
    }

    public void deleteById(int id) {
        for(Movie deleteMovie : movie){
            if(deleteMovie.getId() == id){
                movie.remove(deleteMovie);
            }
        }
    }
}

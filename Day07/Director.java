package Day07;

public class Director
{
    private String name;
    private String directedMovie;

    public Director (String name, String movie)
    {
        this.name = name;
        this.directedMovie = movie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirectedMovie(String directedMovie) {
        this.directedMovie = directedMovie;
    }

    public String getName() {
        return name;
    }

    public String getDirectedMovie() {
        return directedMovie;
    }
}
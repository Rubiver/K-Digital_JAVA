package Day07;

public class Movie {
    private int id;
    private String title;
    private  String genre;
    private  String[] cast = new String[2];
    private Director director;

    public Movie (){}
    public Movie(int id, String title, String genre, String[] cast,Director director){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.cast = cast;
        this.director = director;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }
    public void showMovies()
    {
        System.out.print(id+"\t"+title+"\t"+genre+"\t");
        for(int i=0; i<cast.length;i++)
        {
            System.out.print(cast[i]+" ");
        }
        System.out.println("\t"+director.getName()+"\t"+director.getDirectedMovie());
    }
}

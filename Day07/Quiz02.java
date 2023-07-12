package Day07;

public class Quiz02 {
    public static void main(String[] args) {
        System.out.println("<<Netflix 영화 관리 시스템 >>");
        Movie[] mv = new Movie[3];
        String[] titles = new String[]{"영화1","영화2","영화3"};
        String[] genres = new String[]{"장르1","장르2","장르3"};
        String[] directors = new String[]{"감독1","감독2","감독3"};
        String[] filmo = new String[]{"영화4","영화5","영화6"};
        String[] cast = new String[] {"배우1", "배우2"};
        Director dir;
        /*for(int i=0; i<mv.length; i++)
        {
            mv[i] = new Movie();
            mv[i].setId(1000+i+1);
            mv[i].setTitle(titles[i]);
            mv[i].setGenre(genres[i]);
        }*/
        for(int i=0; i<mv.length; i++)
        {
            int id = 1000+i+1;
            String title = "영화"+(i+1);
            String genre = "장르"+(i+1);
            dir = new Director(directors[i],filmo[i]);
            mv[i] = new Movie(id,title,genre,cast,dir);
            mv[0].getCast()[0] = ""; //자료형을 잘 생각하면 이런 식으로 작성가능.
            //mv[i] = new Movie(id,title,genre,new String[]{"1","2"},dir); 메서드에 new String[]처럼 배열을 넘길 수 있음.
            //mv[i] = new Movie(id,title,genre,new String[]{"1","2"},new Director("a","as"));
        }
        System.out.println("ID\t\t영화\t\t장르\t\t배우\t\t\t감독\t\t영화");
        for(int i=0; i<mv.length; i++)
        {
            mv[i].showMovies();
        }
    }
}

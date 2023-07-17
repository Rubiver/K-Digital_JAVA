package day10.oop4_practice.view;

import day10.dao.DAO;
import day10.dto.Movie;

import java.awt.font.ImageGraphicAttribute;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main{
    //입출력 등의 반복적인 행위는 메서드로 묶어서 한번에 처리.
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        long currentTime = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd");
        String result = sdf.format(currentTime);
        Date date = sdf.parse(result);

        DAO manager = new DAO();
        List<Movie> mv = manager.getMovie();
        while (true) {
            System.out.println("1. 신규영화 등록");
            System.out.println("2. 영화목록 출력");
            System.out.println("3. 영화정보 검색");
            System.out.println("4. 영화정보 삭제");
            System.out.println("5. 영화정보 수정");
            System.out.println("0. 종료");
            int sel = Integer.parseInt(sc.nextLine());
            switch (sel) {
                case 1:
                    int id;
                    String title;
                    String genre;
                    String dateformat;
                    System.out.print("등록할 ID >>");
                    id = Integer.parseInt(sc.nextLine());
                    System.out.print("등록할 영화 이름 >>");
                    title = sc.nextLine();
                    System.out.print("등록할 영화 장르 >>");
                    genre = sc.nextLine();
                    System.out.print("등록할때 날짜 형식 >>");
                    dateformat = sc.nextLine();
                    manager.addMovie(new Movie(id, title, genre,dateformat));
                    break;
                case 2:
                    System.out.println("ID\tTitle\tGenre\tDate");
                    /*for (Movie i : mv) {
                        System.out.println(i);
                    }*/
                    for(int i=0; i<manager.getMovie().size(); i++)
                    {
                        System.out.println(manager.getMovie().get(i).getId()+"\t"
                                +manager.getMovie().get(i).getTitle()+"\t"
                        +manager.getMovie().get(i).getTitle()+"\t"
                        +manager.getMovie().get(i).getDate());
                    }
                    break;
                case 3:
                    String searchTitle = "";
                    System.out.println("검색할 영화 이름 : ");
                    searchTitle = sc.nextLine();
                    for (int i = 0; i < manager.getMovie().size(); i++) {
                        if (manager.getMovie().get(i).getTitle().equals(searchTitle)) {
                            //DAO에 영화 제목 검색을 담당하는 메서드를 정의했음. 그거 사용해도 됨.
                            System.out.println("검색한 영화 이름 : "+searchTitle);
                            System.out.println(manager.getMovie().get(i));
                            break;
                        } else {
                            System.out.println("해당 영화는 없습니다.");
                        }
                    }
                    break;
                case 4:
                    int deleteId;
                    System.out.println("삭제할 영화 ID : ");
                    deleteId = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < manager.getMovie().size(); i++) {
                        if (manager.getMovie().get(i).getId() == deleteId) {
                            System.out.println("삭제한 영화 ID : "+deleteId+"삭제한 영화 이름 : "+manager.getMovie().get(i).getTitle());
                            manager.getMovie().remove(i);
                            break;
                        } else {
                            System.out.println(manager.getMovie().get(i).getTitle());
                            System.out.println("해당 영화는 없습니다.");
                        }
                    }
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력했습니다.");
                    break;
            }
        }
    }

}

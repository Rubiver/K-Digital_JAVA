package Day09;

import java.util.Scanner;

class Member {
    private int id;
    private String name;
    private int point;

    public Member(int id, String name, int point){
        this.id = id;
        this.name = name;
        this.point = point;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("신규 회원 등록 시스템");
        Silver sil1 = new Silver(1001, "kwon", 1000);
        Silver sil2 = new Silver(1002, "jane", 2000);
        Silver sil3 = new Silver(1003, "june", 3000);
        System.out.println("1. 신규 회원 등록");
        System.out.println("2. 회원 목록 출력");
        System.out.println("3. 프로그램 종료");
        int sel=Integer.parseInt(sc.nextLine());
        switch (sel)
        {
            case 1:
                System.out.println("신규회원등록");
                break;
            case 2:
                System.out.println("ID\t\tName\tPoint\tBonus");
                System.out.println(sil1.getId()+"\t"+sil1.getName()+"\t"+sil1.getPoint()+"\t"+sil1.getBonus(sil1.getPoint()));
                System.out.println(sil2.getId()+"\t"+sil2.getName()+"\t"+sil2.getPoint()+"\t"+sil2.getBonus(sil2.getPoint()));
                System.out.println(sil3.getId()+"\t"+sil3.getName()+"\t"+sil3.getPoint()+"\t"+sil3.getBonus(sil3.getPoint()));
            case 3:
                System.out.println("프로그램 종룐");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}

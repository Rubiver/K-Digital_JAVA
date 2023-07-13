package Day09.view;

import Day09.dto.Gold;
import Day09.dto.Silver;
import Day09.dao.DAO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // MVC (Model, View, Controller Design Pattern)
        //MVC 1~2 and Spring MVC까지 배울 예정.  언어마다 보편적으로 쓰이는 디자인 패턴이 있음.

        //Model : 데이터와 관련된 입출력 및 수정, 삭제( CRUD )를 처리하는 영역
        //View : 사용자와 접하는 엔드포인트로서 UI를 전담하는 영역. UI를 구현하는 클래스를 별도로 구현
        //Controller : 프로그램 흐름을 통제하는 영역

        //현재 기준 회원관리 시스템의 치명적 문제점 3가지
        //1. 코드 중복이 많음 -> 코드의 유지보수에 어려움이 발생. 해결방법 : 상속(Inheritance)
        //상속은 코드의 중복제거, 코드 재활용, 다형성을 구현하는 목적으로 사용.
        //2. 코드 결합도가 높다. -> 다형성으로 해결 (여기선 DAO 클래스가 수정되지 않도록 함)
        //3. 저장소 문제 -> Collection으로 해결.

        Scanner sc = new Scanner(System.in);
        //Refactoring을 통해 view, dao, dto로 구분하여 코딩
        DAO manager = new DAO(); //DAO의 addMember 메서드는 static이 아니기 때문에 인스턴스를 생성해줌.
        System.out.println("신규 회원 등록 시스템");
        //Silver[] member = new Silver[3];  DAO 클래스로 이동함.

        while(true)
        {
            System.out.println("1. 신규 회원 등록");
            System.out.println("2. 회원 목록 출력");
            System.out.println("3. 프로그램 종료");
            int sel=Integer.parseInt(sc.nextLine());
            switch (sel)
            {
                case 1:
                    manager.addMember(new Silver(1001, "kwon", 1000)); //DAO의 addMember 메서드를 사용.
                    manager.addMember(new Silver(1002, "jane", 2000));
                    manager.addMember(new Silver(1003, "june", 3000));
                    manager.addMember(new Gold(1004, "adele", 4000)); //DAO의 addMember 메서드를 사용.
                    manager.addMember(new Gold(1005, "hank", 5000));
                    System.out.println("입력 완료!");
                    break;
                case 2:
                    Silver[] silverMember = manager.getSilverMember();
                    Gold[] goldMember = manager.getGoldMember();
                    System.out.println("ID\t\tName\tPoint\tBonus");

                    for(int i=0; i < manager.getSilverIndex(); i++) //배열에 들어있는 값은 silverMember.length로는 다 알지 못하고 index로 알 수 있음.
                    {
                        System.out.println(silverMember[i].getId()+"\t"+silverMember[i].getName()+"\t"+silverMember[i].getPoint()+"\t"+silverMember[i].getBonus());
                    }
                    for(int i=0; i<manager.getGoldIndex(); i++)
                    {
                        System.out.println(goldMember[i].getId()+"\t"+goldMember[i].getName()+"\t"+goldMember[i].getPoint()+"\t"+goldMember[i].getBonus());
                    }
                    break;
                case 3:
                    System.out.println("프로그램 종룐");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }



       // Gold gMem = new Gold(1004,"rkwo",3000);
        //System.out.println(gMem.getId()+"\t"+gMem.getName()+"\t"+gMem.getPoint()+"\t"+gMem.getBonus());

    }
}

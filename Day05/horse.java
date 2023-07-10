package Day05;

import java.util.Scanner;

public class horse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel = 0;
        int selectHorse = 0;
        int money = 0;
        int whoWin = 0;
        int wallet = 0;
        while(true) {
            System.out.println("경마 게임에 오신걸 환영합니다.");
            System.out.println("1. 게임시작");
            System.out.println("2. 금액 충전");
            System.out.println("3. 금액 조회");
            System.out.println("4. 게임 종료");
            System.out.print(">>");
            sel = Integer.parseInt(sc.nextLine());

            switch (sel) {
                case 1:
                    System.out.println("1번말 - 우승 경력 많음. 그러나, 은퇴를 앞에둠.");
                    System.out.println("2번말 - 이번 달 성적이 제일 좋음.");
                    System.out.println("3번말 - 슈퍼 루키말");
                    System.out.print("베팅하고 싶은 말 선택 >>");
                    selectHorse = Integer.parseInt(sc.nextLine());
                    System.out.print("베팅할 금액 >>");
                    money = Integer.parseInt(sc.nextLine());
                    whoWin = (int) (Math.random() * 3 + 1);
                    if((wallet-money) < 0)
                    {
                        System.out.println("금액이 부족합니다.");
                    }
                    else {
                        wallet -= money;
                        if (whoWin == selectHorse) {
                            System.out.println("베팅에 성공하셨습니다. 베팅금액인 " + money + "원에서 두배인 " + (money * 2) + "원이 되었습니다.");
                            money *= 2;
                            wallet += money;
                        } else {
                            System.out.println("베팅에 실패 하셨습니다.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("얼마를 충전하시겠습니까?");
                    System.out.print(">>");
                    wallet = Integer.parseInt(sc.nextLine());
                    System.out.println("충전완료");
                    break;
                case 3:
                    System.out.println("현재 충전된 금액은 " + wallet + "원 입니다.");
                    break;
                case 4:
                    System.out.println("게임 종료");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}

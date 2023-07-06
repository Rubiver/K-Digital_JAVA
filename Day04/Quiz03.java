package Day04;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 10000;
        int cola = 0;
        int cof = 0;
        int juice = 0;
        int select = 0;
        while(true)
        {
            System.out.println("<<<ATM Simulator>>>");
            System.out.println("1. 콜라 (1200)");
            System.out.println("2. 커피 (1000)");
            System.out.println("3. 과일주스 (3000)");
            System.out.println("4. 소지품 확인");
            System.out.println("5. 종료");
            System.out.print("선택 > ");
            select = Integer.parseInt(sc.nextLine());
            if(select == 5)
            {
                System.out.println("시뮬레이션을 종료합니다.");
                System.exit(0);
            }
            else if(select == 1)
            {
                if((money-1200)<0)
                {
                    System.out.println("현재 잔액이 부족합니다.");
                    continue;
                }
                else
                {
                    cola++;
                    money -= 1200;
                    System.out.println("콜라를 1개 구입했습니다.");
                }
            }
            else if(select == 2)
            {
                if((money-1000)<0)
                {
                    System.out.println("현재 잔액이 부족합니다.");
                    continue;
                }
                else
                {
                    cof++;
                    money -= 1000;
                    System.out.println("콜라를 1개 구입했습니다.");
                }
            }
            else if(select == 3)
            {
                if((money-3000)<0)
                {
                    System.out.println("현재 잔액이 부족합니다.");
                    continue;
                }
                else
                {
                    juice++;
                    money -= 3000;
                    System.out.println("주스를 1개 구입했습니다.");
                }
            }
            else if(select == 4)
            {
                System.out.println("<< 현재 소지품 정보 >>");
                System.out.println("현재 잔액은 "+ money + " 원 입니다.");
                System.out.println("보유한 콜라 : " +cola);
                System.out.println("보유한 커피 : " +cof);
                System.out.println("보유한 주스 : " +juice);
            }
        }
    }
}

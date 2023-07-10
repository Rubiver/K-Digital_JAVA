package Day04;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 1000;
        int temp = 0;
        int select = 0;
        while(true)
        {
            System.out.println("<<<ATM Simulator>");
            System.out.println("1. 입금");
            System.out.println("2. 출금");
            System.out.println("3. 잔액 조회");
            System.out.println("4. 종료");
            System.out.print("선택 > ");
            select = Integer.parseInt(sc.nextLine());
            if(select == 4)
            {
                System.out.println("시뮬레이션을 종료합니다.");
                System.exit(0);
            }
            else if(select == 1)
            {
                while(true) {
                    try {
                        System.out.print("얼마를 입글하시겠습니까? > ");
                        money += Integer.parseInt(sc.nextLine());
                        System.out.println("현재 잔액은 " + money + " 원 입니다.");
                        break;
                    } catch (Exception e) {
                        System.out.println("숫자만 입력주해주세요.");
                    }
                }
            }
            else if(select == 2)
            {
                while(true)
                {
                    try{
                        System.out.print("얼마를 출금하시겠습니까? >");
                        temp = Integer.parseInt(sc.nextLine());
                        if((money-temp)<0)
                        {
                            System.out.println("잔액이 부족합니다.");
                        }
                        else
                        {
                            money -= temp;
                            System.out.println(temp+"원 출금하여 "+money+" 원 남았습니다.");
                            temp = 0;
                            break;
                        }
                    }catch (Exception e)
                    {
                        System.out.println("숫자만 입력해주세요.");
                    }
                }//try-catch구문으로 예외처리하는 방법
            }
            else if(select == 3)
            {
                System.out.println("현재 잔액은 "+ money + " 원 입니다.");
            }

        }

    }
}

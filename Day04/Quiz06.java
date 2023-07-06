package Day04;

import java.util.Scanner;

public class Quiz06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 가위 바위 보 ===");
        int sel = 0;
        double com;
        // 1.가위 2. 바위 3. 보
        while(true)
        {
            com = Math.random() * 3 + 1;
            System.out.print("숫자 입력 (1.가위 2.바위 3. 보) > ");
            sel = Integer.parseInt(sc.nextLine());
            if(!(sel== 1 || sel == 2 || sel == 3))
            {
                System.out.println("잘못 입력했습니다.");
            }
            else if(sel == 1 && (int)com == 1)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 가위, 컴퓨터 : 가위");
                System.out.println("무승부");
            }
            else if(sel == 1 && (int)com == 2)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 가위, 컴퓨터 : 바위");
                System.out.println("컴퓨터 승");
            }
            else if(sel == 1 && (int)com == 3)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 가위, 컴퓨터 : 보");
                System.out.println("유저 승");
            }
            else if(sel == 2 && (int)com == 1)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 바위, 컴퓨터 : 가위");
                System.out.println("유저 승");
            }
            else if(sel == 2 && (int)com == 2)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 바위, 컴퓨터 : 바위");
                System.out.println("무승부");
            }
            else if(sel == 2 && (int)com == 3)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 바위, 컴퓨터 : 보");
                System.out.println("컴퓨터 승");
            }
            else if(sel == 3 && (int)com == 1)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 보, 컴퓨터 : 가위");
                System.out.println("컴퓨터 승");
            }
            else if(sel == 3 && (int)com == 2)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 보, 컴퓨터 : 바위");
                System.out.println("유저 승");
            }else if(sel == 3 && (int)com == 3)
            {
                System.out.println("==========결과==========");
                System.out.println("유저 : 보, 컴퓨터 : 보");
                System.out.println("무승부");
            }
            /*
            //비긴 경우를 한번에 정리
            else if(sel == (int)com)
            {
                if(sel == 1)
                {
                    System.out.println("==========결과==========");
                    System.out.println("유저 : 가위, 컴퓨터 : 가위");
                    System.out.println("무승부");
                }
                else if(sel == 2)
                {
                    System.out.println("==========결과==========");
                    System.out.println("유저 : 바위, 컴퓨터 : 바위");
                    System.out.println("무승부");
                }
                else if(sel == 3)
                {
                    System.out.println("==========결과==========");
                    System.out.println("유저 : 보, 컴퓨터 : 보");
                    System.out.println("무승부");
                }
            }*/
            System.out.println("=======================");
        }
    }
}

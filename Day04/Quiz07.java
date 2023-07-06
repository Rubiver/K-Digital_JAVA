package Day04;

import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sel = 0;
        int com = 0;
        int score = 1;
        int rank = 100;

        while(true)
        {
            System.out.println("=== Up & Down Game ===");
            System.out.println("=== 1. Game Start ===");
            System.out.println("=== 2. Game Score ===");
            System.out.println("=== 3. End Game ===");
            System.out.print("선택 >> ");
            sel = Integer.parseInt(sc.nextLine());
            switch (sel)
            {
                case 1:
                    com = (int)(Math.random() * 100 +1);
                    while(true)
                    {
                        System.out.print("Input Number : ");
                        num = Integer.parseInt(sc.nextLine());
                        if(num == com)
                        {
                            System.out.println(score+"번 만에 맞췄습니다.");
                            if(rank>=score)
                            {
                                rank = score;
                            }
                            score = 0;
                            break;
                        }
                        else if(num > com)
                        {
                            System.out.println("Down!");
                            score++;
                        }
                        else if(num < com)
                        {
                            System.out.println("Up!");
                            score++;
                        }
                    }
                    break;
                case 2:
                    System.out.println("현재 1위는 "+rank+"번 만에 맞췄습니다.");
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }

    }
}

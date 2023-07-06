package Day04;

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sel = 0;
        int com = 0;
        int score = 1;
        int comScore = 1;
        int rank = 100;
        int comAns = 0;
        int comAimin = 1;
        int comAimax = 100;
        int playerWin = 0;
        int aiWin = 0;

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
                        comAns = (int)(Math.random()*(comAimax-comAimin+1) + comAimin);
                        System.out.println("ComAns : "+comAns+ " min : "+comAimin+" max :"+comAimax);
                        System.out.print("Input Number : ");
                        num = Integer.parseInt(sc.nextLine());
                        if(num == com)
                        {
                            System.out.println(score+"번 플레이어가 만에 맞췄습니다.");
                            playerWin++;
                            if(rank>=score)
                            {
                                rank = score;
                            }
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

                        if(comAns == com)
                        {
                            System.out.println(score+"번 만에 컴퓨터가 먼저 맞췄습니다.");
                            aiWin++;
                            if(rank>=score)
                            {
                                rank = score;
                            }
                            break;
                        }
                        else if(comAns > com)
                        {
                            //System.out.println("Down!");
                            comAimax = comAns;
                            comScore++;
                        }
                        else if(comAns < com)
                        {
                            //System.out.println("Up!");
                            comAimin = comAns;
                            comScore++;
                        }
                    }
                    comAimin = 1;
                    comAimax = 100;
                    comScore = 0;
                    score = 0;
                    break;
                case 2:
                    System.out.println("현재 1위는 "+rank+"번 만에 맞췄습니다.");
                    System.out.println("======= 전적 =======");
                    System.out.println("총 전적 : "+(playerWin+aiWin)+"전");
                    System.out.println("플레이어 : "+playerWin+"승 "+aiWin+"패");
                    System.out.println("컴퓨터 : "+aiWin+"승 "+playerWin+"패");
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

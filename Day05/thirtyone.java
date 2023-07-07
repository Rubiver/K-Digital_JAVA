package Day05;

import java.util.Scanner;

public class thirtyone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sel = 0;
        int ansState = 0;
        int comRepeat = 0;
        int userRepeat = 0;
        int userAns = 0;
        int comAns = 0;
        int playerWin = 0;
        int aiWin = 0;

        while (true)
        {
            System.out.println("=== 31 Game ===");
            System.out.println("=== 1. Game Start ===");
            System.out.println("=== 2. Game Score ===");
            System.out.println("=== 3. End Game ===");
            System.out.print("선택 >> ");
            sel = Integer.parseInt(sc.nextLine());
            switch (sel)
            {
                case 1:
                    exit : while(true)
                    {
                        System.out.print("몇 개의 숫자를 입력하시겠습니까? (최대 3개) >> ");
                        userRepeat = sc.nextInt();
                        System.out.println("반복 횟수 : "+userRepeat+" 현재 번호 : "+ansState+" 어디까지 가능 ? "+(ansState+userRepeat));
                        //연속되지 않는 수는 입력하지 못하게 해야함.
                        for(int i = ansState+1; i<=ansState+userRepeat; i++)
                        {
                            System.out.print(i+"번째 숫자 입력("+userRepeat+"개 가능) : ");
                            userAns = sc.nextInt();
                            if(ansState == userAns)
                            {
                                System.out.println("번호 중복");
                                break exit;
                            }
                        }
                        ansState = userAns;

                        if(userAns == 31)
                        {
                            System.out.println("게임 종료. 유저 패배 ");
                            ++aiWin;
                            break;
                        }

                        comRepeat = (int)(Math.random() * 3 + 1);

                        for(int i = ansState+1; i<=ansState+comRepeat; i++)
                        {
                            comAns = i;
                            System.out.println("컴퓨터 대답 : "+comAns);
                        }
                        System.out.println("컴퓨터의 마지막 대답 : "+comAns);
                        ansState = comAns;

                        if(comAns == 31)
                        {
                            System.out.println("게임 종료. 컴퓨터 패배 ");
                            ++playerWin;
                            break;
                        }
                    }
                case 2:
                    System.out.println("======= 전적 =======");
                    System.out.println("총 전적 : "+(playerWin+aiWin)+"전");
                    System.out.println("플레이어 : "+playerWin+"승 "+aiWin+"패");
                    System.out.println("컴퓨터 : "+aiWin+"승 "+playerWin+"패");
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}

//사용자 입력을 한번에 하려고했으나 10이 넘어가면 길이를 사용하는 로직에서 문제가 발생함.
/*
int sel = 0;
        int ansState = 0;
        char ansChar;
        int comRepeat = 0;
        int userRepeat = 0;
        String userAns = " ";
        String comAns = " ";
    while(true)
    {
        System.out.print("최대 3개 숫자 가능 >> ");
        userAns = sc.nextLine().replace(" ","");
        System.out.println("사람 대댑 : "+userAns);
        System.out.println("전에 했던 번호 있음? "+userAns.contains(comAns));
        if(userAns.length() > 3 )
        {
            System.out.println("최대 3개의 숫자만 가능합니다.");
        }
        else if(userAns.contains(comAns))
        {
            System.out.println("번호 중복");
        }
        else
        {
            comRepeat = (int)(Math.random() * 3 + 1);
            ansChar =  userAns.charAt(userAns.length()-1);
            ansState = Integer.parseInt(String.valueOf(ansChar));

            //Log
            System.out.println("마지막 번호 : "+ansState);
            System.out.println("컴퓨터가 몇개를 부를지 : "+comRepeat);

            for(int i=ansState+1; i<ansState+comRepeat+1; i++)
            {
                comAns = String.valueOf(i);
                System.out.println("컴퓨터 대답 : "+comAns);
            }
            ansChar =  userAns.charAt(userAns.length()-1);
            ansState = Integer.parseInt(String.valueOf(ansChar));
            if(ansState == 31)
            {
                System.out.println("패배");
                break;
            }
        }
    }*/

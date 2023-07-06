package Day04;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 동전 앞뒤 맞추기 ===");
        int sel = 0;
        double a;
        while(true)
        {
            a = Math.random() * 2 + 1;
            System.out.print("숫자 입력 (1.앞면 2.뒷면) > ");
            sel = Integer.parseInt(sc.nextLine());
            if(sel == (int)a)
            {
                System.out.println("맞췄습니다.");
            }
            else if( !(sel==1 || sel == 2))
            {
                System.out.println("잘못된 선택입니다.");
                continue;
            }
            else
            {
                System.out.println("틀렸습니다.");
            }
        }
    }
}

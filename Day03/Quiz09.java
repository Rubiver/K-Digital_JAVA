package Day03;
import java.util.Scanner;

public class Quiz09 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 구구단 출력 프로그램 ===");
        System.out.print("2~9단 중 선택 : ");
        int dan = sc.nextInt();
        if(dan > 2 || dan < 9)
        {
            for(int i=1; i<=9; i++)
            {
                System.out.println(dan + " * " + i + " = " + i*dan);
            }
            //반복문 없이 일일이 작성하다 보면 반복문을 어떻게 작성해야될지 알 수도 있음.
        }
        else
        {
            System.out.println("범위를 벗어남.");
        }

    }
}

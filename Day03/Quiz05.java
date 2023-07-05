package Day03;

import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        //int num = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 숫자 입력 : ");
        int num2 = sc.nextInt();
        if(num1 == num2)
        {
            System.out.println("숫자 같음!");
        }
        else if(num1 > num2)
        {
            System.out.println("첫 번째 숫자가 더 크다!");
        }
        else
        {
            System.out.println("두 번째 숫자가 더 크다!");
        }
    }
}

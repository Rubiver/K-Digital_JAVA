package Day03;

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        //두 정수를 입력받아 덧셈한 결과를 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();
        System.out.println(num1+" + "+num2+" = " + (num1+num2));
    }
}

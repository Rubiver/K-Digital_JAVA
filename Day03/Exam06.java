package Day03;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        String a = sc.nextLine();
        int b = Integer.parseInt(a);
        //코드 축약
        //int b = Integer.parseInt(sc.nextLine());

        System.out.println("100 + " + a + " = " + (b + 100));
    }
}

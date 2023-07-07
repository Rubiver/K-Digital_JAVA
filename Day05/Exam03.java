package Day05;

import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20;
        int temp = 0;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("Swap");
        temp = a;
        a = b;
        b = temp;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }
}

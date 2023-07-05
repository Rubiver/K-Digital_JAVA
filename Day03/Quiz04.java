package Day03;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.print("이 름 : ");
        String name = sc.nextLine();
        System.out.println("======================");
        System.out.print("국 어 : ");
        int kor = sc.nextInt();
        System.out.print("영 어 : ");
        int eng = sc.nextInt();
        System.out.print("수 학 : ");
        int mat = sc.nextInt();
        System.out.println("======================");
        int result = kor+eng+mat;
        System.out.println("합 계 : "+result);
        System.out.println("평 균 : "+result/3f);
        System.out.println("======================");
    }
}

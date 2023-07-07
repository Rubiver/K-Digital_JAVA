package Day05;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] student = new String[3];
        int[] kor = new int[3];
        int[] eng = new int[3];

        for(int i=0; i < student.length; i++)
        {
            System.out.println((i+1)+"번째 학생 이름 : ");
            student[i] = sc.nextLine();
            System.out.println(student[i]+"학생의 국어 점수 : ");
            kor[i] = Integer.parseInt(sc.nextLine());
            System.out.println(student[i]+"학생의 영어 점수 : ");
            eng[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("이름     국어      영어      합계      평균");
        for(int i=0; i< student.length; i++)
        {
            System.out.print(student[i]+"     "+kor[i]+"     "+eng[i]+"     "+(kor[i]+eng[i])+"     "+((kor[i]+eng[i])/2.0));
            System.out.println("");
        }
    }
}

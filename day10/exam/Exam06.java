package day10.exam;

import Day09.dto.Gold;

import java.util.Scanner;

public class Exam06 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        String str = "hello";
        int[] arr = new int[] {1,2,3};

        System.out.println(sc); //sc만 출력하면 값이 아닌 주소값이 나옴. 암묵적인 약속으로 sc.toString()해서 출력함.
        System.out.println(str);
        System.out.println(arr); //arr.toString()

        //참조변수형
    }
}

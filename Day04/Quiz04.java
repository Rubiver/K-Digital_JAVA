package Day04;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  a = Math.random() * 9 ;
        System.out.println("0부터 9까지 랜덤 수 : "+(int)a);
        double  b = Math.random() * 10 + 1 ;
        System.out.println("1부터 10까지 랜덤 수 : "+(int)b);
        double  c = Math.random() * (35-20+1) + 20 ;
        System.out.println("20부터 35까지 랜덤 수 : "+(int)c);
        double  d = Math.random() * 1 + 0.5;
        System.out.println("0 또는 1 : "+(int)d);
    }
}

package Day02;

public class Exam04 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 3.14f;
        char c1 = 'A';
        char c2 = 'B';

        System.out.println("결과 : " + i1 + i2);
        System.out.println("결과 : " + (i1+i2));
        System.out.println("결과 : " + i1 + f1);
        System.out.println("결과 : " + (i1 + f1));
        System.out.println("결과 : " + f1 + c1);
        System.out.println("결과 : " + (f1 + c1));
        System.out.println("결과 : " + c1 + c2);
        System.out.println("결과 : " + (c1 + c2));
        /*
        결과 : 1020 -> string으로 프로모션
        결과 : 30 -> 괄호안 연산이 먼저 되고 string으로 프로모션
        결과 : 103.14 -> 문자로
        결과 : 13.14 ->괄호
        결과 : 3.14A -> 문자
        결과 : 68.14 -> 괄호
        결과 : AB -> 문자
        결과 : 131 -> 괄호
         */
    }
}

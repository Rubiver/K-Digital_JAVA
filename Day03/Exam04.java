package Day03;
import java.io.*;
public class Exam04 {
    public static void main(String[] args) throws Exception {
        //throws Exceoption - 예외전가
        char ch;
        int a;
        System.out.print("글자 하나를 입력하세요 : ");
        a = System.in.read(); //System.in.read()의 값은 사용자가 임의로 정하면 정수를 얻어 낼 수 있음.
        ch = (char)a;
        System.out.println("사용자가 입력한 아스키코드 10진수 : "+a);
        System.out.println(ch);

        int a2;
        System.out.print("글자 하나를 입력하세요 : ");
        a2 = System.in.read(); //System.in.read()는 키보드 입력을 읽어내는 것보다 실질적으로 버퍼에 저장된 내용을 읽어냄.
        System.out.println("사용자가 입력한 아스키코드 10진수 : "+a2);

        int a3;
        System.out.print("글자 하나를 입력하세요 : ");
        a3 = System.in.read(); //System.in.read()는 키보드 입력을 읽어내는 것보다 실질적으로 버퍼에 저장된 내용을 읽어냄.
        System.out.println("사용자가 입력한 아스키코드 10진수 : "+a3);

        //Buffer에 저장되는 방식을 알게됨.
    }
}

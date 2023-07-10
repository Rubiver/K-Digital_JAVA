package Day06;

import java.io.IOException;
import java.util.Scanner;

public class Exam04 {

    public static void main(String[] args) {
        //자바에 존재하는 예외 종료 두가지
        //Checked Exception : 문법검사로 감지된 오류 등 JVM에서 미리 예외 발생 가능성을 탐지하는 종류의 예외
        //Unchecked Exception : JVM에서 미리 예외 처리 발생 가능성을 감지 못하는 종류의 예외.
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try //예외처리의 대표적 방법. 예외가 생길 수 있는 구문을 한 곳에 묶어줌.
        {
            Integer.parseInt("AABABAS"); //숫자 형태의 문자열을 입력해줘야 함.
            Integer.parseInt("684");
            System.out.println("실행 구간");
        }
        catch (Exception e) //try내의 코드를 수행하다가 오류가 발생하면 문제에 대한 정보를 가지고 catch로 이동.
        {
            //e.printStackTrace();
            System.out.println("예외 발생");
        }
        System.out.println("완료구간");
    }
}

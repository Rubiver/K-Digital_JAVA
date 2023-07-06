package Day04;

import java.util.Scanner;

public class Day03_Exam11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 자바에서 String타입에 대해 비교를 수행할 때는 ==이 아니라 .equals를 사용해야함.

        String str1 = "딸기"; //Shared Cosntant 영역에 딸기 문자열 저장, 스택의 str1에는 딸기에 대한 주소값을 가지고있음
        String str2 = new String("딸기"); //딸기라는 문자열이 이미 있는 경우 Heap메모리에 Instance영역을 생성하고, Shared Constant의 딸기 문자열 주소지를 저장.
        //즉 스트링을 ==으로 비교할때는 각 변수에 저장된 주소로 비교를 하게됨.


        System.out.print("좋아하는 과일 입력 : ");
        String select = sc.nextLine();
        
        if(select == "딸기")
        {
            System.out.println("딸기는 영어로 Strawberry");
        }
        else if(select.equals("사과"))
        {
            System.out.println("사과는 영어로 Apple");
        }
        else
        {
            System.out.println("다시 입력해주세요.");
        }
        //select == "과일명"이 제대로 작동하지 않는 이유 : 딸기라는 글자는 heap이라는 메모리에 저장되어있고 select는 딸기에 대한 메모리 주소값을 가지고있기 때문에 주소와 과일명을 비교하게 된다.
        //문자를 비교하기 위해선 select.equals("과일명")을 사용해야한다.

    }
}

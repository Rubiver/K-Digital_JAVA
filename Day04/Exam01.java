package Day04;
public class Exam01 {
    public static void main(String[] args) {
        //변수의 종류 - 지역변수 : {} 내에 선언된 변수
        {
            int a = 10;
        }
        //^서로 다른 {} = 서로 다른 지역v
        {
            int a = 20;
        }
        
        int b = 20; //main 지역에 존재하는 변수
        {
            b = 10; //상위의 지역에 존재하는 변수이기 때문에 별도 선언없이 사용가능.
        }
        {
            System.out.println(b);
        }

        // 정적변수
        // 멤버변수
        
        
    }
}

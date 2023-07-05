package Day03;
import java.util.Scanner;
public class Quiz06 {
    public static void main(String[] args) {
        //1부터 100사이의 수를 입력 받아서 홀수인지 짝수인지 출력
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            if(num == 9999)
            {
                System.out.println("종료코드 입력.");
                break;
            }
            if(num>= 1 && num <= 100)
            {
                if(num%2==0)
                {
                    System.out.println("짝수입니다");
                }
                else
                {
                    System.out.println("홀수입니다.");
                }
            }
            else
            {
                System.out.println("범위를 벗어났습니다.");
            }

        }
    }
}

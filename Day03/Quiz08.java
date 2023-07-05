package Day03;
import java.util.Scanner;
public class Quiz08 {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("출력 회수를 입력하세요 : ");
        int count = sc.nextInt();

        //3입력시  Hello Java를 3번 출력
        for(int i=0; i<count; i++)
        {
            System.out.println("Hello Java!");
        }

        int j=0;
        while(j < count)
        {
            System.out.println((j+1)+" : Hello Java!");
            j++;
        }
    }
}

package Day03;
import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 1 ~ n 까지의 합 구하기 ===");
        System.out.print("n입력 : ");
        int num = sc.nextInt();
        int hap=0;
        for(int i=1; i<= num; i++)
        {
            hap += i;
        }
        System.out.println("1 ~ "+ num +"까지의 합은 "+ hap +"입니다.");

    }
}

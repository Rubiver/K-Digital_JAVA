package Day03;
import java.util.Scanner;
public class Quiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //사용잘부터 이름과 연락처 입력받고 출력

        // Solution 1
        System.out.print("이름을 입력하시오 : ");
        String name = sc.nextLine();

        System.out.print("연락처를 입력하시오 : ");
        String num = sc.nextLine();

        System.out.println("안녕하세요."+ name +"입니다.");
        System.out.println("급한 연락은."+ num +"로 연락바랍니다.");

        // Solution 2
        System.out.print("이름과 연락처를 입력하시오 : ");
        String str = sc.nextLine();
        System.out.println("안녕하세요. "+str.substring(0,3)+" 입니다. 급한 연락은."+ str.substring(4)+"로 연락바랍니다.");

    }
}

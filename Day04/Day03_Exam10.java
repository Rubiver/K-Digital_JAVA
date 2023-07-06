package Day04;

import java.util.Scanner;

public class Day03_Exam10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("좋아하는 언어 선택");
        System.out.println("1. C언어  2. C++  3. Java  4. Python");
        System.out.print("선택 > ");
        int select = Integer.parseInt(sc.nextLine());

        switch (select)
        {
            case 1:
                System.out.println("당신이 좋아하는 언어는 C언어입니다. C언어는 데니스 리치가 만들었습니다.");
                break;
            case 2:
                System.out.println("당신이 좋아하는 언어는 C++입니다. C++은 비얀 스트로스트립이 만들었습니다.");
                break;
            case 3:
                System.out.println("당신이 좋아하는 언어는 Java입니다. Java는 제임스 고슬링이 만들었습니다.");
                break;
            case 4:
                System.out.println("당신이 좋아하는 언어는 Python입니다. Python은 로섬이 만들었습니다.");
                break;
            default:
                System.out.println("잘못된 값을 입력했습니다.");
                break;
        }
    }
}

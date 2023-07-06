package Day04;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        String ops;
        System.out.println("=== 계산기 프로그램 ===");
        /*
        while(true)
        {
            System.out.print("연산 기호 입력 : ");
            ops = sc.nextLine();
            if(ops.equals("q"))
            {
                System.out.println("계산을 종료합니다.");
                break;
            }
            else if( !(ops.equals("+") || ops.equals("-") || ops.equals("*") || ops.equals("/")))
            {
                System.out.println("연산기호를 잘못 입력하셨습니다. 다시 입력하세요.");
                continue;
            }
            System.out.print("숫자 1 입력 : ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("숫자 2 입력 : ");
            num2 = Integer.parseInt(sc.nextLine());
            switch (ops)
            {
                case "*":
                    result = num1 * num2;
                    System.out.println("=== 결과 ===");
                    System.out.println(num1 + " " + ops + " "+num2 + " = "+result);
                    break;
                case "+":
                    result = num1 + num2;
                    System.out.println("=== 결과 ===");
                    System.out.println(num1 + " " + ops + " "+num2 + " = "+result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("=== 결과 ===");
                    System.out.println(num1 + " " + ops + " "+num2 + " = "+result);
                    break;
                case "/":
                    result = num1 / num2;
                    System.out.println("=== 결과 ===");
                    System.out.println(num1 + " " + ops + " "+num2 + " = "+result);
                    break;
                default:
                    break;
            }
        }*/

        while(true)
        {
            System.out.print("연산 기호 입력 (q 입력시 종료) : ");
            ops = sc.nextLine();
            if(ops.equals("q"))
            {
                System.out.println("계산을 종료합니다.");
                System.exit(0); //해당 문장 실행 시 즉시 프로그램을 종료함.
                break; //반복문을 나가는 것이지 프로그램을 종료하는 것이 아님.

            }
            else if( !(ops.equals("+") || ops.equals("-") || ops.equals("*") || ops.equals("/")))
            {
                System.out.println("연산기호를 잘못 입력하셨습니다. 다시 입력하세요.");
                continue;
            }
            //여기서 아래의 코드를 else로 묶어서 하나의 제어문으로 제어가능.
            System.out.print("숫자 1 입력 : ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("숫자 2 입력 : ");
            num2 = Integer.parseInt(sc.nextLine());
            if(ops.equals("+"))
            {
                result = num1 + num2;
                System.out.println("=== 결과 ===");
                System.out.println(num1 + " " + ops + " "+num2 + " = "+result);
            }
            else if(ops.equals("-"))
            {
                result = num1 - num2;
                System.out.println("=== 결과 ===");
                System.out.println(num1 + " " + ops + " "+num2 + " = "+result);
            }
            else if(ops.equals("*"))
            {
                result = num1 * num2;
                System.out.println("=== 결과 ===");
                System.out.println(num1 + " " + ops + " "+num2 + " = "+result);
            }
            else if(ops.equals("/"))
            {
                result = num1 / num2;
                System.out.println("=== 결과 ===");
                System.out.println(num1 + " " + ops + " "+num2 + " = "+ (num1/(float)num2));
            }
            else if(ops.equals('q'))
            {
                break;
            }
        }

    }
}

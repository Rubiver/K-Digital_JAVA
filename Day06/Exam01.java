package Day06;

public class Exam01 {
    public static int plus(int num1, int num2) //매개변수 num1, num2 해당 형태를 메서드 프로토타입, 메서드 원형이라고 함.
    {
        int result = num1 + num2;
        return result;  //return의 목적, 메서드의 종료, 결과의 반환. 즉, return 이후에 작성된 코드는 실행되지 않음.
    }

    //두 정수를 인자로 전달받아 뺄셈한 결과를 반환하는 minus메서드
    public static int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    //두 정수를 받아 나눗셈 divide
    public static double divide(double a, double b) {
        double result = a / b;
        return result;
    }

    //두 정수를 받아 더 큰수를 반환하는 bigger
    public static int bigger(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }

    //과일 문자열을 전달받아 해당하는 영단어에 대해 한글로 변경
    public static String translate(String st) {
        String result = "";
        if (st.equals("Apple")) {
            return "사과";
        } else if (st.equals("Grape")) {
            return "포도";
        } else {
            return "none";
        }
    }

    //시작값, 끝값을 전달받아 난수를 반환
    public static int myRand(int start, int end) {
        int result = (int) ((Math.random() * (end - start + 1) + start));
        return result;
    }

    public static void main(String[] args) {
        //메서드() 와 같이 작성하면 메서드를 Call한 것임.
        //()안에 전달하는 값을 인수 또는 인수 값이라고 함. (parameter, argument)
        int result = plus(10, 5);
        //메서드의 반환된 값이 int형이기 때문에 숫자처럼 다룰 수 있음.
        //제어문을 제외한 모든 "method()" 형식의 문장은 메서드임.
        //plus라는 메서드를 부른 main은 Caller가 되고 부름받은 plus메서드는 Callee가 된다.

        System.out.println("10-5 : " + minus(10, 5));
        System.out.println("10/3 : " + divide(10, 3));
        System.out.println("10 vs 5  : " + bigger(10, 5));
        System.out.println("3 vs 9  : " + bigger(3, 9));
        System.out.println("Apple  : " + translate("Apple"));
        System.out.println("Grape  : " + translate("Grape"));
        System.out.println("6~12  : " + myRand(6, 12));

        // ※주의점 - 메서드 콜 발생 시 어떤 리턴값이 반환되는지 알아야함.
    }
}

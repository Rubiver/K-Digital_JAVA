package Day06;

public class Exam06 {
    public static void func(int num)
    {
        num = 5; //스택 메모리에서 별도의 func 스택이 생김. main의 num에 반영되지 않음.
    }
    public static void main(String[] args) {
        int num = 10;
        func(num);
        System.out.println(num);
    }
}

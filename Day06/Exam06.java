package Day06;

public class Exam06 {
    public static void func(int num) //num은 매개변수이자 func의 지역변수
    {
        num = 5; //스택 메모리에서 별도의 func 스택이 생김. main의 num에 반영되지 않음.
    }
    public static void func(int[] num) //참조 자료형은 주소를 넘기는 것이기 때문에 여러 메서드가 하나의 값을 공유할 수 있음.
    {
        num[0] = 5;
    }
    public static  void  func(String st)
    {
        st = "2";
    }
    public static void main(String[] args) {
        int num = 10;
        func(num);
        System.out.println(num);

        int[] arr = new int[] {10};
        func(arr); //int형 배열인 arr에 대한 주소값
        System.out.println(arr[0]);

        String[] st = new String[]{"asdadasdadsad","asdadasdsad"};
        func(st[0]);
        System.out.println(st[0]); //hmm..

    }
}

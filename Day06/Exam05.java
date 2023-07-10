package Day06;

public class Exam05 {
    public static void func(){
        System.out.println("매개 변수가 없는 메서드");
    }
    public static void  func(int num)
    {
        System.out.println("integer 매개변수가 한개 있는 메서드");
    }
    public static void  func(double num)
    {
        System.out.println("doubler 매개변수가 한개 있는 메서드");
    }
    /*public static double func(double num)
    {
       자료형으로는 구분하지 못함.
    }*/
    public static void func(int num1, int num2)
    {
        System.out.println("매개변수가 두개 있는 메서드");
    }
    public static void main(String[] args) {
        //Method OverLoading
        func();
        func(1);
        func(3.14);
        func(1,2);
        //같은 메서드 이름이지만 매개변수의 개수로 구분할 수 있게 됨.

        System.out.println("");
        //println메서드도 오버로딩으로 구현한 것임.
    }
}

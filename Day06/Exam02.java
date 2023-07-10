package Day06;

public class Exam02 {
    public static boolean isEven(int num)
    {
        boolean result = num % 2 == 0;
        return result;
    }
    public static void greeting(String name) //시나리오1 : return 값을 어떤 것으로 할지 모르겠음.
    {
        //해당 메서드 역할 : 전달 받은 이름에게 인사함.
        System.out.println("Hello "+name);

    }
    public static void main(String[] args) {
        greeting("Tom"); //return할 값이 없어서 자료형을 어떤 것으로 할지 모르겠다면 void형으로 하면 된다.
        boolean result = isEven(10);
    }
}

package Day09.exam;

class A{

}
class B extends  A{

}
public class Exam01 {
    public static void main(String[] args) {
        //다형성, 하나의 변수에 여러타입의 데이터를 저장할 수 있을 때 다형성을 가진다고 표현함.
        A a1 = new A();
        B b1 = new B();

        A a2 = new B(); //상속관계에서 다형성이 나타남.


    }
}

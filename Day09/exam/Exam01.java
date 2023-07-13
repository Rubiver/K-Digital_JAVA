package Day09.exam;

class A{
    public void funcA(){
        System.out.println("A");
    }
    public void sound()
    {
        System.out.println("B");
    }

}
class B extends  A{
    public void funcA(){
        System.out.println("B");
    }
    public void funcB(){
        System.out.println("B");
    }
    public void sound()
    {
        System.out.println("B");
    }
}
class C extends  A{

    public void sound()
    {
        System.out.println("C");
    }
}
public class Exam01 {
    public static void main(String[] args) {
        //다형성, 하나의 변수에 여러타입의 데이터를 저장할 수 있을 때 다형성을 가진다고 표현함.
        //다형성 변수는 참조했을 때, 자신의 자료형 만큼만 접근이 가능하다. 만ㄴ약 저장된 인스턴스 전체의 기능을 원한다면 적절한 Down Casting이 필요하다.
        //해당 규칙의 예외 : 오버라이딩된 메서드에 대해서는 다운 캐스팅이 필요없음.
        A a1 = new A();
        B b1 = new B();

        A a2 = new B(); //상속관계에서 다형성이 나타남. Up Casting이 일어남.
        A a3 = new C();
        //자바에서 다형성은 상속관계에 있는 클래스 중 부모 클랫 참조 변수에게 발생하는 성질이다.
        //이때, 다형성을 가지는 부모클래스 참조변수는 자신을 상속받는 하위클래스 인스턴스의 주소를 저장할 수 있다.

        //a3.sound();
        a2.funcA(); //클래스 B의 기능을 사용하지 못함.
        ((B)a2).funcB(); //캐스팅을 통해 클래스B의 기능을 사용할 수 있음. Down Casting이 일어남.
        //계보상 상위 클래스인 A 클래스가 하위클래스인 B 클래스로 낮아졌기 때문에 Down Casting

        a2.funcA(); //A클래스가 오버라이딩으로 인해 "무효화"되어있기 때문에 B클래스의 funcA가 실행됨.
    }
}

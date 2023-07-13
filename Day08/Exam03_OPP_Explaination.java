package Day08;

import Day08.beans.Calculator;

public class Exam03_OPP_Explaination {
    //객체지향 기본 문법 - Class / Instance / Private, Public, Package(default) / getter , setter
    // constructor, default constructor / static

    //객체지향 중급 문법 - 상속 / Protected /★다형성 / 추상화 / ★Collection - ★:중요순위높음

    public String instanceField = "instanceField"; //instance member field, 인스턴스가 생성되어야만 존재할 수 있는 변수
    public static String classField = "classField"; // class member field (static), 인스턴스의 존재 여부와 무관하게 존재하는 변수
    //프로그램 시작 후 클래스에서 변수를 접근할 때 생성됨.
    public void func1(){
        instanceField = "";
        Exam03_OPP_Explaination.classField = "";
        //해당 메서드가 실행되는 것은 인스턴스가 생성된 것을 전제하기 때문에 instanceField와 classField 둘다 사용 가능
    }
    public static void func2(){
        //instanceField = ""; 오류발생
        Exam03_OPP_Explaination e = new Exam03_OPP_Explaination();
        e.instanceField = ""; // 사용가능
        //해당 메서드는 프로그램 시작시 생성되기 떄문에 instance가 생성되지 않아도 되지만, 그렇기 때문에 instanceField가 생성되지 않아 사용할 수 없다.
        //classField는 프로그램 시작시 생성되었기 때문에 사용가능하다.
    }

    public static void main(String[] args) {
        Exam03_OPP_Explaination.classField = "Hello"; //인스턴스 생성없이 사용가능
        //classField = "";
        Exam03_OPP_Explaination e1 = new Exam03_OPP_Explaination();
        Exam03_OPP_Explaination e2 = new Exam03_OPP_Explaination();
        e1.instanceField = "sup"; //인스턴스 생성 후 사용가능
        //instanceField = ""; 사용 못하는 이유 : e1이라는 인스턴스가 생성되지 않은 것과 같고, 생성이 되었지만

        System.out.println(classField);
        System.out.println(e1.instanceField);
        System.out.println(e2.instanceField);

        e1.classField = "e1 write";
        System.out.println(e2.classField); //static이 붙은 classField
        //e2.classField = "e2 write";
        //이런 방식으로 사용하는 것이 좋지 않기에 class에서 호출해 사용하는 것이 좋음.
        Exam03_OPP_Explaination.classField = "yes";

        //main이 static이기 때문에  메서드에 static을 넣어 주는 것이고 static없이 사용하길 원하면 new를 통해 인스턴스를 만들어서 사용가능.

        //static : class member를 선언할 때 사용한다, static 멤버를 가진 클래스를 처음 엑세스할 때 단 한번 생성된다.
        //public static의 장점 : public static ㅅ용시 전역변수와 같아 언제, 어디서나 사요 가능한 편리한 변수로 사용 가능. (Scope 문제로 부터 자유로움)
        //static member field를 남발해선 안되는 이유 : 메모리 관리가 최적화되지 않는다.
        //                                         이름 관리가 불편하다.
        //                                         동시성 문제가 발생할 가능성이 높다(multi thread 관련..)

        //public static 으로 선언된 멤버 - 프로그램 전체에 길치 Access가 잦고, 메모리에서 사라지는 일이 없는 종류의 데이터.

        Calculator calc = new Calculator();
        System.out.println(calc.plus(10,5));
        System.out.println(Calculator.minus(10,5));
    }
}

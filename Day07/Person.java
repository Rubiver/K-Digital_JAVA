package Day07;

public class Person {
    //클래스 구성요소 4가지
    //멤버변수 Member Field (Class 안에 존재하는 변수, 클래스를 구성)
    double heihgt;
    double weight;
    //접근제한자 : ★Public / Protected / Pakage / ★Private 자료형 앞에 작성가능.
    private String name;
    private int age;
    private String contact;
    //private으로 지정한 변수에 직접 접근하지 못함.
    //private을 안붙혀도 되는 상황이 있지만 private을 사용하는 것을 권고함.

    //멤버 메서드 Member Method
    void eatFood(){}
    public void printInfo()
    {
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("연락처 : "+contact);
    }
    public void writeInfo(String name, int age, String contact)
    {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    //생성자 Constructor
    
    //중첩 클래스 Nested class
}

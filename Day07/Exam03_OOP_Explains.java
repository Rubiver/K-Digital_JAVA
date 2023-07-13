package Day07;

import Day07.beans.TV;

/*
class Person {
    double heihgt;
    double weight;
    String name;
    int age;
    String contact;
}*/
public class Exam03_OOP_Explains {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.setChannel(10);
        System.out.println(tv.getChannel());

        tv.getThis().getThis().getThis();
        //Chaining
        //대표적인 chaining 기법 라이브러리 Stringbuilder  게시판 구성때 사용함

        Person kwon = new Person();
        //kwon.name = "권석경";
        //kwon.contact = "010-9623-8879";
        kwon.writeInfo("권석경",24,"010-9623-8879"); //24?
        kwon.printInfo();

        //System.out.println(kwon.name);
        //System.out.println(kwon.age);

        //클래스를 잘 만드는 방법.
        //1. 정보은닉 - 클래스 내부의 구성요소 중 외부에 노출될 필요가 없는 경우 숨김.
        //Encapsulation, 굳이 사용자가 건들이지 않아도 되는 값은 보여주지 않음.
        //접근제한자 : Public / Protected / Package / Private 자료형 앞에 작성가능.
        //접근 제한자 순서는 접근할 수 있는 범위 순으로 정렬한 것임
        // Package는 윈도우의 폴더와 역할(종류에 따라 "정리")이 같음.
        //Exam파일과 TV클래스를 각각 exam, beans라는 다른 패키지에 옮기면 서로 사용할 수 없음.

    }
}

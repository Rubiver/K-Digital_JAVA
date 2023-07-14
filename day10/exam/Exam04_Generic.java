package day10.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam04_Generic {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<String>(); //배열이지만 동적으로 변하기 때문에 크기를 정해주지 않아도됨.
        // <> : Generic 문법 - 아직 정해지지 않은 타입에 특정 타입을 지정해주는 문법. 왼쪽에서 자료형을 정하면 오른쪽에선 생략이 가능하다.
        //ArrayList와 LinkedList의 메서드는 추상메서드로 만들어져 있고 사용방법이 강제된다. 그렇기 때문에 서로 바꿔도 문법에 문제가 없다.
        arr.add("java");
        arr.add("collection");
        arr.add("practice");
        //arr.add(new Integer(10));  Generic 문법으로 자료형을 String타입으로 정해놨기 때문에 String 이외 자료형은 에러가 생김.
        //arr.add(Double.valueOf(3.14));
        //arr.add(new Scanner(System.in));

        arr.get(0).length(); //object타입때는 length() 메서드를 사용하지 못했지만, 현재는 String형을 입력,반환을 하기 때문에 length()메서드를 사용할 수 있다.

        //String st = arr.get(0); 오류 발생, .get으로 꺼낸 0번째 데이터는 String이 아닌 up casting된 오브젝트형 데이터이고, 그렇기 때문에 오류가 발생한 것임.
        String st = String.valueOf(arr.get(0));

        //자바에서 생성하는 자료형의 제일 꼭대기는 Object이다.
        //object를 상속받기 때문에 다형성을 가지고, 다양한 자료형을 가진 데이터를 저장할 수 있음.
        //각각 값들은 object형으로 promotion(up casting)이 일어남.

        for(int i=0; i< arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("");
        //비순차적 데이터 끼워넣기
        arr.add(1,"python");
        for(int i=0; i< arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("");
        //비순차적 데이터 삭제
        arr.remove(0);
        for(int i=0; i< arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println("");

        for(int i=0; i< arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }

        //day09의 DAO, Main에 대한 List 자료형을 List<String>으로 바꾼 것이 있음.
    }
}

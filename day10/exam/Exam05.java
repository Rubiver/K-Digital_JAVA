package day10.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam05 {
    public static void main(String[] args) {
        //변형 For 문 - foreach
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("banana");

        //기존 for문 으로
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("");
        //변형 for문 : foreach
        //데이터 묶음을 가진 collection이 와야함
        for (String i:list) {
            System.out.println(i);
        }
    }
}

package Day09.exam;

import java.util.*;

public class Exam08 {
    public static void main(String[] args) {
        //List
        //저장 순서가 존재, 데이터 중복을 허용.
        //소규모의 데이터를 저잦ㅇ하고 관리할 때 가장 많이 사용되는 형태.
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10); //테이터 중복 허용.
        System.out.println(arr);

        //Set - 저장에 순서가 없음, 데이터 중복을 허용하지 않음.
        //중복 필터로 사용되는 경향이 있음. 가장 사용도 낮음.
        Set<String> hashSet = new HashSet<>(); //Tree셋보다 Hash를 더 많이 사용.
        Set<String> treeSet = new TreeSet<>();
        
        hashSet.add("Grape");
        hashSet.add("Mango");
        hashSet.add("Orange"); //값을 중복해서 넣어도 하나만 존재
        for(String e : hashSet){
            System.out.println(e);
        }
        //set안의 값을 개발자가 원하는대로 가져오지 못하기 때문에 foreach문 등으로 값을 출력.
        Set<Integer> lotto = new HashSet<>();
        while(true){
            lotto.add((int)(Math.random()*45+1));
            if(lotto.size() == 7) { break; }
        }
        System.out.println(lotto);

        //Map
        //Key와 Value 쌍으로 하나의 데이터가 구성됨.
        //Key는 중복을 허용하지 않고, 순서가 없음. Value는 중복을 허용(순서는 Key에 의해 결정됨)
        //데이터에 이름값(key)를 붙여서 전송하거나 사용해야 할 때 주로 사용 됨.
        Map<Integer, String> map = new HashMap<>();
        //key값과 value를 합쳐서 entry라고 부름
        map.put(1,"first");
        map.put(1,"second"); //중복은 허용하지 않음.
        map.put(3,"third");
        System.out.println(map); //{1=second, 3=third}
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get(1)); //숫자 key면 for문 돌려서 뽑을 수 있을듯

    }
}

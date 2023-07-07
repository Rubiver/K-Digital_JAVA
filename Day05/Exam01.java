package Day05;

public class Exam01 {
    public static void main(String[] args) {
        //배열
        int[] arr; //참조 변수를 만듬. Heap 메모리를 사용하기 위해 new 키워드 사용.
        int arr3[];//C언어 방식으로도 코딩이 가능하지만 지양하는 것이 좋음.
        int[] arr2 = new int[5]; //실질적으로 배열을 만드는 문장. 배열의 크기는 new int[] 쪽에 해야함.

        arr2[0] = 10; //배열은 0부터 시작
        arr2[1] = 20;
        arr2[2] = 30;

        int[] arr4 = new int[] {10,20,30}; //초기값을 넣어준 상태에선 new int[]의 배열 크기를 적지 않아도 됨.


    }
}

package day10.exam;

public class Exam03 {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] = "java";
        arr[1] = "collection";
        arr[2] = "practice";

        //비 순차적 데이터 삽입
        arr[3] = arr[2];
        arr[2] = arr[1];
        arr[1] = "python";

        //비 순차적 데이터 삭제
        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = arr[3];
        arr[3] = "";

        //범위를 벗어나는 입ㄹ겨
        // arr[4] = "out"; 오류발생

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

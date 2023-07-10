package Day06;

public class Exam03 {
    public static void main(String[] args) {
        String str = "hello";
        int length = str.length();
        System.out.println(length);

        System.out.println(str.charAt(1));
        System.out.println(str.charAt(str.length()-1));
        //문자열에 대한 인덱스 값을 받아서 해당 인덱스에 있는 char형 문자 1글자를 반환.

        System.out.println(str.startsWith("p"));
        System.out.println(str.startsWith("h"));
        System.out.println(str.endsWith("o"));
        //parameter에 입력한 값으로 시작or 끝나는 문자열인지 true or false로 반환

        System.out.println(str.contains("el"));
        //문자열이 포함되는지 확인

        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
}

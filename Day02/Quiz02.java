package Day02;

public class Quiz02 {
    public static void main(String[] args) {
        int a = 1325;
        int b = 9327;
        System.out.println(a*b);

        long l = 10000000000L + 5000; //int형의 최대는 약 21억이기 때문에 100억은 long을 사용해야함.
        System.out.println(l);

        char c1 = 'A';
        char c2 = 'B';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("" + c1 + c2);
    }
}

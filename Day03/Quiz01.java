package Day03;

public class Quiz01 {
    public static void main(String[] args) {
        //false
        //11 : 21
        int a = 10;
        int b = 20;
        System.out.println(++a == 10 && b++ == 20);
        System.out.println(a + " : " + b);
        //b가 20인 이유 : ++a == 10 의 연산 이후 숏컷 연산으로 인해 b++ 연산이 수행되지 않음.

    }
}

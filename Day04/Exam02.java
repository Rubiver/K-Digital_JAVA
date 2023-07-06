package Day04;
public class Exam02 {
    public static void main(String[] args) {
        //난수 Random Number
        //Math.random() - 0~1 사이의 실수 값을 생성, 어떠한 값을 곱해주면 해당 값이 최대 범위가 됨.
        double a = Math.random() * 10; //0부터 9.99999까지의 값이 나옴
        int n = (int)a;
        System.out.println(n);

        //난수 범위 설정
        //최대값 y 최소값 x 일때 random number * (y - x + 1) + x
        int x = 10;
        int y = 30;
        int rangeRand = (int)(Math.random() * (y - x + 1)) + x; //범위 공식
        System.out.println(rangeRand);
    }
}

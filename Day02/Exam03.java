package Day02;
public class Exam03 {
    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte)i;
        //캐스팅 해야함. int형이 byte형보다 크기 때문에 캐스팅이 필요.
        ch = (char)b;
        //캐스팅 해야함 char형은 음수값을 표현하지 못하기 때문에 캐스팅이 필요.
        short s = (short) ch;
        //캐스팅 해야함.
        float f = (float) l;
        //캐스팅 안해도됨. float형이 long형보다 크기 때문에 프로모션이 일어남.
        i = (int)ch;
        //캐스팅 안해도됨. int형이 char형보다 크기 때문에 프로모션이 일어남.
    }
}

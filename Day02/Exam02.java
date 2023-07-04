package Day02;
public class Exam02 {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        char c = 'A';
        int i;
        float f;
        long l = 100L;

        s = b;

        //c = b;
        c = (char)b;
        //char는 음수 값을 표현하지 못해서 바이트보다 크지만 프로모션이 일어나지 않음.

        //s = c;
        s = (short)c;
        //short와 charc는 서로 같은 2바이트를 쓰지만 양의 값을 char형이 더 많이 표현이 가능함. 강제 형변환을 통해 값 저장 가능.

        //c = s;
        c = (char)s;
        //위와 동일

        //i = 100L;
        i = (int)100L;
        i = 100;
        //long형이 int형보다 작기때문에 프로모션이 일어나지 않음.
        //캐스팅과 숫자 뒤의 L을 떼는 것으로 가능.

        l = 500;

        f = l;

        //f = 5.11;
        f = 5.11f;
        //자바의 소수값은 기본적으로 double형으로 인식되기 때문에 float형에 저장하기 위해선 소수값 뒤에 f를 입력해주어야 함.
    }
}
package Day02;
public class Exam01 {
    public static void main(String[] args) {
        byte a = 127;
        byte b = -128;
        //Byte = 8bit, 2^8개 만큼 저장 가능. 범위는 -128~127
        short c =  32767;
        //short = 16bit, 2^16개 만큼 저장 가능. 범위는 -32768~32767
        char d = 'A';
        /*
        char는 127개의 ASCII Code를 저장할 수 있도록 2바이트의 공간이 있고,
        음수가 필요가 없기 떄문에 범위는 0~ 65335.
        'A'와 같이 작은따옴표로 작성한 문자는 숫자와 같은 취급.
        */
        int e = 2000000081;
        //int는 2^32개 만큼 저장가능. 범위는 약-21억~21억
        long f = 8999999999999999999L;
        //long은 2^64개 만큼 저장가능. 범위는 매우 큼;;
        //자바에선 인트형 범위보다 큰 숫자를 인식하지 못하기 때문에 높은 숫자는 L을 뒤에 붙히면 된다.
        float g = 1.1f;
        //2^32개 만큼 저장 가능. 자바에서 소수는 기본적으로 double로 인식을함. float을 사용하려면 숫자 뒤에 f를 붙히면 된다.
        double h = 3.14;
        //2^64개 만큼 저장 가능.
        boolean i = true;
        //boolean은 true와 false만 저장 가능.
        String st = "asd";
        //참조형이지만 기본형만큼 많이 사용.

        //Data type Promotion 다른 자료형이지만 서로의 자료형에 대해 대소비교를 했을 때, 더 큰 자료형에는 자료형이 달라도 대입이 가능.
        c = a;
        e = c;
        f = e;
        //byte 변수에 0000 0101로 저장되어있을 때, byte형 변수를 short형 변수에 대입했을 경우 그 크기에 맞게 빈공간을 생성하여 0000 0000 0000 0101 이와 같이 저장됨.
        //실수형은 항상 정수형보다 크기 때문에 정수형 값을 실수형에 대입하는 경우 실수형으로 변경됨.
        //대표적인 프로모션 형상 : 값을 출력할 때, 값을 서로 잇기 위해 +를 사용하는데 이때 프로모션이 발생함. 값을 나눌때 한쪽에 실수형으로 바꿔준다면 프로모션이 일어남

        //Casting
        int integerNumber = 0;
        float floatNumber = 1.0f;
        System.out.println(floatNumber);
        integerNumber = (int)floatNumber;
        System.out.println(integerNumber);
        //연산이 정상적으로 수행될 수 있도록 강제적으로 데이터형을 변환시킴.
        //그러나 강제형변환시 값이 데이터 손실이 발생할 수 있다.
        byte byteNumber = 0;
        short shortNumber = 1000;
        byteNumber = (byte)shortNumber;
        System.out.println(byteNumber);


    }
}
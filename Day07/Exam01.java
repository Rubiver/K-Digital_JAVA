package Day07;

public class Exam01 {
    public static void main(String[] args) {
        //Class : 관련된 정보들에 대한 변수와 메서드를 묶어서 관리하는 단위
        //        특정 대상에 대한 설계도
        //자바에서는 모든 코드가 class 내부에 작성되야함. 그러므로 프로젝트를 실행하는 main메서드를 포함하는 클래스가 필요
        //이때 메인을 포함하는 클래스는 설계도 본연의 목적을 벗어난, 예외적인 클래스로 작성됨.
        //Instance : 클래스 설계도를 바탕으로 메모리상에 구현된 실체
        //lg : TV Instance의 주소를 저장하는 참조변수
        TV lg1; //클래스를 만들고 불러옴. 즉, 자료형을 만듬.
        TV lg = new TV(); //Heap 메모리에 instance를 생성함.
        lg.brand = "LG";
        lg.powerOn();
        //lg.channel = 1;
        lg.setChannel(10);
        //실체는 instance class는 설계도임.
    }
}

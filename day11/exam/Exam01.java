package day11.exam;

public class Exam01 {
    public static void main(String[] args) {
        //OOP5 Practice, Network Programming
        //IP Address : 컴퓨터 네트워크 상에서 각 기기의 LAN카드가 가지는 고유한 주소 값
        //Port : 컴퓨터 내부에서 네트워크 프로그램들을 구분짓는 고유 서비스 번호
        //컴퓨터 내에서 사용되는 프로그램들은 포트번호가 중복되어선 안된다. (프로그램이 안켜진다? 포트번호 겹치는지 확인)
        //1~1024번은 Well Known 포트로서 사용을 피하는 것이 좋음.

        //Server :네트워크에서 서비스를 제공하는 장비
        //Client : 네트워크 서비스를 이용하는 장비

        //Socket : 네트워크 프로그램이 통신을 수행하기 위해 필수적으로 가져야하는 논리적 단말기 연결까지의 역할만을 담당(데이터 통신은 Stream이 담당)
        //Stream : Socket을 통해 연결된 통신에서 데이터를 주고 받을 수 있는 논리적 통로.
        //  내 컴퓨터에서 상대에게 보낼 때는 OutputStream, 상대로부터 내 컴퓨터로 데이터를 받을 때는 InputStream

        //ServerSocket : 접속하는 사용자마다 Socket을 생성해서 하나씩 연결해주는 역할을 수행함.
        for(int i=0; i< 30; i++)
        {
            int randNum = (int)(Math.random()*3+1);
            System.out.println(randNum);
        }
    }
}
package day13.exam;

class Worker extends Thread{
    public void run(){
        System.out.println("Thread Run");
        for(int i=1; i<=100; i++)
        {
            System.out.print(i + " ");
        }
    }

}
public class Exam01{
    public static void main(String[] args){
        //multi thread 사용법
        // 1. thread 클래스를 상속받는 사용자 정의 클래스를 제작한다. (extends Thread)
        // 2. thread 클래스로부터 public void run() 메서드를 오버라이딩
        // 3. 병렬 처리하고자 하는 코드를 run() 메서드 내부에 구현한다.
        // 4. 제작 된 클래스를 바탕으로 인스턴스를 생성한다. (객체 생성)
        // 5. 생성된 인스턴스로부터 start() 메서드를 call한다.
        Worker work = new Worker();
        Worker work2 = new Worker();
        work.start();
        work2.start();
        for(int i=1; i<=100; i++)
        {
            System.out.print(i + " ");
        }

    }
}

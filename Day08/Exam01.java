package Day08;

import javazoom.jl.player.Player;

import java.io.FileInputStream;

public class Exam01 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("Day08/990.mp3");
            //pakage 폴더명까지 적어주어야 오류가 실행되지 않음.
            Player playMP3 = new Player(fis);
            playMP3.play();
        }
        catch(Exception exc){
            exc.printStackTrace();
            System.out.println("Failed to play the file.");
        }
        //NullPointerException 주소값이 없는 변수를 참조할때 발생하는 오류.
        //해결책 - 해당 예외가 발생한 부분의 .앞의 변수가 null인 상태이다.
    }
}

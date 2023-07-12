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
    }
}

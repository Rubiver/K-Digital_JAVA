package day13.quiz;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import static day13.quiz.Quiz02.game;

class Sentence extends Thread{
    private String[] fruits = new String[]{
            "Apple","Orange","Mango",
            "Kiwi","Strawberry" };
    public void run(){
        while(true){
            int rand = (int)(Math.random()*fruits.length);
            game.add(fruits[rand]);
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
            }
            if(game.size()>15){
                System.out.println("단어 15개 초과. 게임 종료");
                System.out.println("최종 점수 : "+Word.score);
                System.exit(0);
            }
        }

    }
}
class Word extends Thread{
    String word;
    public static int score = 0;
    public void run(){
        while(true){

            /*String input = JOptionPane.showInputDialog("단어 입력 : ");
            boolean result = Quiz02.game.remove(input);
            if(result){
                score++;
            }
            //메인에서 print로 배열만 출력해주면 실행가능.
            */

            word = Quiz02.msg;
            /*if(game.get(0).equals(word)){
                System.out.println(game.get(0));
                game.remove(0);
                score++;
            }*/
            for(String st : game){
                if(st.equals(word)){
                    game.remove(st);
                    score++;
                }
            }
        }
    }
}
public class Quiz02 {
    public static List<String> game = new CopyOnWriteArrayList<>();
    //copyonwirtearraylist - concurrent 에러 발생시
    public static String msg;
    public static void main(String[] args) throws InterruptedException {
        //thread 1번 - Apple, Orange, Mange, Kiwi, Strawberry 중 하나의 단어를
        //랜덤하게 1초에 한번씩 game에 추가.
        
        //thread 2번 - 사용자로부터 메시지를 입력받아 gamelist 안에 일치하는 문자열이 있으면 삭제하세요.
        
        //main - gamelist안에 있는 단어 목록을 화면에 1초에 한번씩 반복적으로 무한하게 출력
        //game list 내부에 단어 개수가 15개를 초과하면 gameover를 출력하고 종료
        Scanner sc = new Scanner(System.in);
        Sentence sen = new Sentence();
        Word word = new Word();
        game.add("Apple");
        sen.start();
        word.start();

        //String sentenceView;
        //while
        //sentenceView = game.toString();
        //msg = JOptionPane.showInputDialog(sentenceView+" ");
        while (true){
            msg = JOptionPane.showInputDialog(game.toString());
            System.out.println(game);
            Thread.sleep(1000);
        }

    }
}

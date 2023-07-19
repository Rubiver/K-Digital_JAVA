package day13.quiz;

import javax.swing.JOptionPane;

class Worker extends Thread{
    static int i=0;
    int score = 0;
    public void run(){
        System.out.println("Thread Start");

        for(i=10; i> 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {            }
        }
        System.out.println("종료");
        System.out.println("점수 : "+score);
        System.exit(0);
    }
}
public class Quiz01 {
    public static void main(String[] args) throws Exception {
        Worker worker = new Worker();

        String[] sentence = new String[]{"public static void main(String[] args)",
        "DataInputStream dis = new DataInputStream()",
        "Scanner sc = new Scanner(System.in)"};
        worker.start();
        while(true){
            int rand = (int)(Math.random()*3);
            //new Worker().start(); 이름없는 인스턴스 생성 - 익명 인스턴스
            String msg = JOptionPane.showInputDialog(sentence[rand]);
            if(msg.equals(sentence[rand])){
                System.out.println("성공");
                worker.i += 5;
                worker.score ++;
            }else{
                System.out.println("실패");
                worker.i -= 2;
            }
        }
        //System.exit(0);

    }
}

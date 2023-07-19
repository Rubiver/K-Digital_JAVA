package day13.quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

class MultiThread extends Thread {
    Socket client;

    public MultiThread(Socket soc) {
        this.client = soc;
    }
    //10.2.7.32 IP
    //port 12345

    public void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
            while (true){
                String msg = dataInputStream.readUTF();
                System.out.println(client.getInetAddress()+" "+msg);
                if(msg.equals("date")){
                    long currentTime = System.currentTimeMillis();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
                    String result = sdf.format(currentTime);
                    dataOutputStream.writeUTF(result);
                    dataOutputStream.flush();
                }else if(msg.equals("lotto")){
                    Set<Integer> lotto = new HashSet<>();
                    while(true){
                        lotto.add((int)(Math.random()*45+1));
                        if(lotto.size() == 6) { break; }
                    }
                    dataOutputStream.writeUTF(String.valueOf(lotto));
                    dataOutputStream.flush();
                }else if(msg.equals("wiseword")){
                    String[] wiseword = new String[]{"신은 죽었다.","빛이 있으라.","보다 먼 곳으로."};
                    int randNum = (int)(Math.random()*3+1);
                    dataOutputStream.writeUTF(wiseword[randNum]);
                    dataOutputStream.flush();
                } else if (msg.equals("exit")) {
                    break;
                } else{
                    dataOutputStream.writeUTF("서버-그런 명령은 없습니다.");
                    dataOutputStream.flush();
                }
            }
        } catch (Exception e) {
            System.out.println(client.getInetAddress()+" 로부터 연결 끊김.");
        }
    }
}
public class MultiLottoServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(15000);
        while(true){
            Socket client = serverSocket.accept();
            new MultiThread(client).start();
        }
    }
}

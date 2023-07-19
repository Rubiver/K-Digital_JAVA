package day13.quiz;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

class ExamThread extends Thread {
    Socket client;

    public ExamThread(Socket soc) {
        this.client = soc;
    }
    //10.2.7.32 IP
    //port 12345

    public void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(client.getInputStream());
            while (true){
                String msg = dataInputStream.readUTF();
                System.out.println("클라이언트 메시지 : " + msg);
                //System.out.println(client.getInetAddress()+"클라이언트 메시지 : " + msg);
            }
        } catch (Exception e) {
            System.out.println(client.getInetAddress()+" 로부터 연결 끊김.");
        }
    }
}

public class MultiThreadServer {
    public static void main(String[] args) throws Exception {

        ServerSocket server = new ServerSocket(12345);

        while (true) {
            Socket client = server.accept();
            new ExamThread(client).start();
        }


    }
}

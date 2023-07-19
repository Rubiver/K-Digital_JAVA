package day13.quiz;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//해당 코드 원본은 0717 networkcode에서 보관중.
class ChatThread extends Thread {
    public static ServerSocket serverSocket; //port 안넣음

    static {
        try {
            serverSocket = new ServerSocket(12345);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Socket client;
    String msg = "";

    static {
        try {
            client = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void run(){
        InputStream inputStream = null;
        try {
            inputStream = client.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try { //while 밖에 try-catch 하는 것이 옳은 코드
            while(true){
                msg = dataInputStream.readUTF();
                System.out.println(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Server {
    //0717 ip - 10.2.7.32 : 12345
    /*public static ServerSocket serverSocket; //port 안넣음

    static {
        try {
            serverSocket = new ServerSocket(12345);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Socket client;

    static {
        try {
            client = serverSocket.accept();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

    public static void main(String[] args) throws Exception {

        //new Socket("10.2.1.144",15000); //Socket을 새로 만드는 것이 아님.

        //InputStream inputStream = ChatThread.client.getInputStream();
        OutputStream outputStream = ChatThread.client.getOutputStream();
        //DataInputStream dataInputStream = new DataInputStream(inputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        ChatThread chat = new ChatThread();
        chat.start();
        Scanner sc = new Scanner(System.in);
        String mes = "";
        while(true){
            mes = sc.nextLine();
            dataOutputStream.writeUTF(mes);
            //dataOutputStream.writeUTF(JOptionPane.showInputDialog("클라이언트에게 보낼 메시지"));
            dataOutputStream.flush();
        }

    }
}

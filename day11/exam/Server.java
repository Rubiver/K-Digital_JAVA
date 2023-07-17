package day11.exam;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
//해당 코드 원본은 0717 networkcode에서 보관중.
public class Server {
    //0717 ip - 10.2.7.32 : 12345
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(12345); //port 안넣음
        Socket client = serverSocket.accept();
        //new Socket("10.2.1.144",15000); //Socket을 새로 만드는 것이 아님.

        InputStream inputStream = client.getInputStream();
        OutputStream outputStream = client.getOutputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        while(true){
            dataOutputStream.writeUTF(JOptionPane.showInputDialog("클라이언트에게 보낼 메시지"));
            dataOutputStream.flush();
            String msg = dataInputStream.readUTF();
            System.out.println("클라이언트가 보낸 메시지 : "+msg);
        }

    }
}

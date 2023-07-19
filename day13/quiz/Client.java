package day13.quiz;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
class ChatThreadClient extends Thread {

    Socket client;

    {
        try {
            client = new Socket("10.2.7.32",12345);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    String msg = "";

    public void run(){
        while(true){
            InputStream inputStream = null;
            try {
                inputStream = client.getInputStream();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                msg = dataInputStream.readUTF();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("상대방 : "+msg);
        }
    }
}
public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("10.2.1.144",15000);

        //InputStream inputStream = client.getInputStream();
        OutputStream outputStream = client.getOutputStream();
        //DataInputStream dataInputStream = new DataInputStream(inputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        ChatThreadClient chat = new ChatThreadClient();
        chat.start();

        while(true){
            dataOutputStream.writeUTF(JOptionPane.showInputDialog("서버에게 보낼 메시지"));
            dataOutputStream.flush();
        }
    }
}
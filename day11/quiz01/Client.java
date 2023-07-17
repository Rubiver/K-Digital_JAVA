package day11.quiz01;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("10.2.1.144",15000);
        InputStream inputStream = client.getInputStream();
        OutputStream outputStream = client.getOutputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        while(true){
            dataOutputStream.writeUTF(JOptionPane.showInputDialog("명령어"));
            dataOutputStream.flush();
            String msg = dataInputStream.readUTF();
            System.out.println("서버의 메시지 : "+msg);
        }
    }
}

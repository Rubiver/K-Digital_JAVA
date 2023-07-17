package day11.exam;

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
            String msg = dataInputStream.readUTF();
            System.out.println("서버에서 온 메시지 : "+msg);
            dataOutputStream.writeUTF(JOptionPane.showInputDialog("서버에게 보낼 메시지"));
            dataOutputStream.flush();
        }
    }
}
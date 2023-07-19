package day13.exam;

import javax.swing.*;
import java.io.DataOutputStream;
import java.net.Socket;

public class Exam02 {
    public static void main(String[] args) throws Exception{
        Socket sock = new Socket("localhost",12345);
        DataOutputStream dataOutputStream = new DataOutputStream(sock.getOutputStream());

        dataOutputStream.writeUTF(JOptionPane.showInputDialog("메시지 입력"));
        dataOutputStream.flush();
    }
}

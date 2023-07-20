package day14.exam;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

class FileThread extends Thread{
    Socket sock;
    public FileThread(Socket socket){
        this.sock  = socket;
        System.out.println(this.sock.getInetAddress()+"로 부터 접속");
    }
    public void run(){
        try{
            DataOutputStream dataOutputStream = new DataOutputStream(sock.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(sock.getInputStream());

            File root = new File("C:/FTPHome");
            File[] fileList = root.listFiles();

            dataOutputStream.writeInt(fileList.length); //Client는 readInt로 파일의 갯수를 받아야함.
            for(File files : fileList){ //Client가 Server에서 보내는 filelist를 받아야함. (DataInputStream, readUTF)
                dataOutputStream.writeUTF(files.getName());
            }
            dataOutputStream.flush();

            String fileName = dataInputStream.readUTF();
            System.out.println(sock.getInetAddress()+"가 요청한 파일 : "+fileName);

            File target = new File("C:/FTPHome/"+fileName);
            FileInputStream fileInputStream = new FileInputStream(target);
            DataInputStream fileDataInputStream = new DataInputStream(fileInputStream);

            dataOutputStream.writeLong(target.length());
            dataOutputStream.flush();
            //전달사항 15
            //security 23
            // uploadTest 42
            byte[] fileContents = fileDataInputStream.readAllBytes();
            dataOutputStream.write(fileContents);
            dataOutputStream.flush();

        }catch (Exception e){
            System.out.println(sock.getInetAddress()+"로부터 연결 끊김");
        }
    }
}
public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket socket = new ServerSocket(25000);
        //IP : 10.2.7.32
        //Port : 25000
        while(true){
            Socket client = socket.accept();
            new FileThread(client).start();
        }
    }
}

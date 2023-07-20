package day14.exam;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

class UploadThread{

}

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("localhost",25000);
        Scanner sc = new Scanner(System.in);

        DataInputStream dataInputStream = new DataInputStream(client.getInputStream());

        //File file = new File();

        while(true){try{
            DataInputStream dis = new DataInputStream(client.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
            int num = dis.readInt();
            for(int i=0; i<num; i++){
                System.out.println(dis.readUTF());
            }
            String fileNmae = sc.nextLine();
            dataOutputStream.writeUTF(fileNmae);

            long fileSize = dataInputStream.readLong();
            byte[] contents = new byte[(int)fileSize];
            System.out.println("불러오기 전");
            dataInputStream.readFully(contents);
            System.out.println("불러오기 후");


            //byte[] bytes = dataInputStream.readAllBytes();
            System.out.println("test1");
            File path = new File("C:/FTPHome/Download/"+fileNmae);
            System.out.println("test2");
            DataOutputStream filedos = new DataOutputStream(new FileOutputStream(path));
            System.out.println("test3");
            filedos.write(contents);
            System.out.println("test4");
            filedos.flush();
            System.out.println("test5");
            filedos.close();
            System.out.println("파일 저장 완료");


        }catch (Exception e){

        }
        }
    }
}

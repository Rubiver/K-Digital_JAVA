package Day08;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPFile;

import java.io.File;
import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        Scanner sc = new Scanner(System.in);
        int sel = 0;
        System.out.println("===============");
        System.out.println("1. Connect FTP Server ");
        System.out.println("2. Exit Program ");
        sel = Integer.parseInt(sc.nextLine());
        switch (sel) {
            case 1:
                System.out.println("Input IP :");
                String ip = sc.nextLine();
                System.out.println("Input Port :");
                int port = Integer.parseInt(sc.nextLine());
                try {
                    System.out.println("Try to connect " + ip + " port :" + port);
                    client.connect(ip, port);
                    System.out.println("<< FTP Server is Connected >>");
                } catch (Exception e) {
                    System.out.println("Connecting Server Failure..");
                }
                System.out.print("Input ID : ");
                String id = sc.nextLine();
                System.out.print("Input Password : ");
                String passwd = sc.nextLine();
                try {
                    client.login(id, passwd);
                    System.out.println("<< Login Complete >>");
                } catch (Exception e) {
                    System.out.println("Login Failure..");
                    break;
                }
                System.out.println("");
                out:
                while (true) {
                    int menu = 0;
                    System.out.println("1. Upload File ");
                    System.out.println("2. Download File ");
                    System.out.println("3. Delete File ");
                    System.out.println("4. Disconnect FTP Server ");
                    menu = Integer.parseInt(sc.nextLine());
                    switch (menu) {
                        case 1:
                            String filename = "";
                            System.out.print("Input Upload file's absolute path : ");
                            filename = sc.nextLine();
                            File uploadFile = new File("/" + filename);
                            try {
                                client.upload(uploadFile);
                                System.out.println("Upload Complete");
                                break;
                            } catch (Exception e) {
                                System.out.println("Upload Failure..");
                            }
                            break;
                        case 2:
                            try {
                                FTPFile[] list = client.list();
                                for (int i = 0; i < list.length; i++) {
                                    System.out.println((i + 1) + ". " + list[i].getName() + " Type : " + client.getType());
                                }
                                System.out.print("Input download file name(number) : ");
                                //String fileName = sc.nextLine();
                                int selector = Integer.parseInt(sc.nextLine());
                                String fileName = list[selector - 1].getName();
                                File downFile = new File("C:/FTPHome/Download/" + fileName);
                                client.download(fileName, downFile);
                                /*for(int i=0; i<list.length; i++)
                                {
                                    if(list[i].getName().equals(fileName))
                                    {
                                        System.out.println(list[i].getName()+" "+fileName);
                                        client.download(fileName,downFile);
                                        System.out.println("Download Complete");
                                    }
                                }*/
                                break;
                            } catch (Exception e) {
                                System.out.println("Download Failure.");
                            }
                            break;
                        case 3:
                            try {
                                FTPFile[] list = client.list();
                                for (int i = 0; i < list.length; i++) {
                                    System.out.println(list[i].getName());
                                }
                                System.out.print("Input Delete file name : ");
                                String fileName = sc.nextLine();
                                client.deleteFile(fileName);
                                break;
                            } catch (Exception e) {
                                System.out.println("Delete failure");
                            }
                            break;
                        case 4:
                            try {
                                System.out.println("Disconnecting.....");
                                client.disconnect(true);
                                break out;
                            } catch (Exception e) {
                                System.out.println("Disconnect Failure");
                            }
                        default:
                            System.out.println("Input error");
                    }
                }
                break;
            case 2:
                System.out.println("Exit Program");
                break;
            default:
                System.out.println("Input error");

        }

    }
}
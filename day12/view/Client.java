package day12.view;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket client = new Socket("10.2.1.144", 12345);
        Scanner sc = new Scanner(System.in);
        InputStream inputStream = client.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        String msg;
        String clientData;
        String id;
        String pwd;
        String name;
        int menu;
        while(true){
            System.out.println("<<인증>>");
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            menu = Integer.parseInt(sc.nextLine());
            dataOutputStream.writeUTF(String.valueOf(menu));
            switch (menu){
                case 1:
                    System.out.print("ID >>");
                    id = sc.nextLine();
                    System.out.print("PWD >>");
                    pwd = sc.nextLine();
                    msg = id+" "+pwd;
                    dataOutputStream.writeUTF(msg);
                    dataOutputStream.flush();
                    System.out.println(dataInputStream.readUTF());
                    //while
                    out : while (true){
                            System.out.println("<<학생 관리 시스템>>");
                            System.out.println("1. 학생 정보 등록"); //학번, 이름, 국, 영, 수 입력
                            System.out.println("2. 학생 목록 출력"); //학번, 이름, 국,영,수, 합계 평균
                            System.out.println("3. 학생 정보 검색 (이름)");
                            System.out.println("4. 학생 정보 삭제 (ID)");
                            menu = Integer.parseInt(sc.nextLine());
                            dataOutputStream.writeUTF(String.valueOf(menu));
                            dataOutputStream.flush();
                            switch (menu) {
                                case 1:
                                    String temp;
                                    String stu;
                                    String stuName;
                                    int kor;
                                    int eng;
                                    int math;
                                    System.out.print("학번 >> ");
                                    stu = sc.nextLine();
                                    System.out.print("이름 >> ");
                                    stuName = sc.nextLine();
                                    System.out.print("국어 점수 >> ");
                                    kor = Integer.parseInt(sc.nextLine());
                                    System.out.print("영어 점수 >> ");
                                    eng = Integer.parseInt(sc.nextLine());
                                    System.out.print("수학 점수 >> ");
                                    math = Integer.parseInt(sc.nextLine());
                                    temp = stu + " " + stuName + " " + kor + " " + eng + " " + math;
                                    dataOutputStream.writeUTF(temp);
                                    dataOutputStream.flush();
                                    break;
                                case 2:
                                    System.out.println("학번\t이름\t국\t영\t수\t합계\t평균");
                                    System.out.println(dataInputStream.readUTF()) ;
                                    break;
                                case 3:
                                    System.out.print("이름으로 학생정보 검색하기 >> ");
                                    clientData = sc.nextLine();
                                    dataOutputStream.writeUTF(clientData);
                                    dataOutputStream.flush();
                                    System.out.println(dataInputStream.readUTF());
                                    break;
                                case 4:
                                    System.out.print("ID로 학생정보 삭제하기 >> ");
                                    clientData = sc.nextLine();
                                    dataOutputStream.writeUTF(clientData);
                                    dataOutputStream.flush();
                                    System.out.println(dataInputStream.readUTF());
                                    break;
                                default:
                                    break out;
                        }
                    }
                    break;
                case 2:
                    System.out.print("ID >>");
                    id = sc.nextLine();
                    System.out.print("PWD >>");
                    pwd = sc.nextLine();
                    System.out.print("NAME >>");
                    name = sc.nextLine();
                    msg = id+" "+pwd+" "+name;
                    dataOutputStream.writeUTF(msg);
                    dataOutputStream.flush();

                     System.out.println(dataInputStream.readUTF());
                    break;
                case 3:
                    System.out.println("ID\tPWD\tNAME\tDATE");
                    System.out.println(dataInputStream.readUTF());
                    break;
                default:
                    System.out.println("잘못된 입력");
                    break;
            }
        }
    }
}

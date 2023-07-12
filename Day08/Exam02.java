package Day08;

import it.sauronsoftware.ftp4j.FTPClient;

import java.io.File;
import java.text.Format;

public class Exam02 {
    public static void main(String[] args) {
        //FTP, File Transfer Protocol
        FTPClient client = new FTPClient();
        //client.connect("10.2.13.151");
        //client.login("java", "1234");

        try {
            client.connect("10.2.3.11",21);
        } catch (Exception e) {
            System.out.println("서버 접속에 실패했습니다.");
            e.printStackTrace(); //에러 수정을 위해 개발단계에선 반드시 작성
                                 //배포 단계에선 제거.
            System.exit(0);
        }
        try {
            client.login("java", "1234");
        }catch (Exception e){
            System.out.println("로그인 실패");
            e.printStackTrace();
            System.exit(0);
        }

        try {
            client.changeDirectoryUp();
            String files = client.currentDirectory();
            System.out.println(files);
        }catch (Exception e){
            System.out.println("실패");
        }
        /*
        File folder = new File("");
        try {
            System.out.println(client.list());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        File text = new File("C:/FTPHome/Download/DownloadComplete.mp3");
        File mp3 = new File("C:/FTPHome/Download/DownloadComplete.mp3");
        //이거 아니면 client.downloat("", new File("C:/FTPHome/Download/다운로드성공.txt"); 처럼 작성
        //실행하고 싶은 코드
        try
        {
            client.download("download.txt", text);
            client.download("Adam Levine-1-Lost Stars.mp3", mp3);
        }catch (Exception e)
        {
            System.out.println("다운로드 실패");
        }*/

        //접속 종료
        try {
            client.disconnect(true);
            System.out.println("정상 종료됨.");
        }catch (Exception e)
        {
            System.out.println("접속 종료도 실패;;");
            e.printStackTrace();
        }

    }
}

package day14.exam;

import java.io.File;
import java.io.FileInputStream;

public class Exam01 {
    public static void main(String[] args) {
        //file 클래스 : 하드디스크에 저장된 파일을 CPU가 통제할 수 있도록 램에 인스턴스화 시킬 수 있게 설계해놓은 Class type
        //file에 대한 정보를 다루기 위한 클래스, 파일 내부 내용변경등은 하지 못함.
        String path = "";
        File file = new File("C:/FTPHome/security.txt");
        File folder = new File("C:/FTPHome/");
        System.out.println("파일 존재 여부 : "+file.exists());
        System.out.println("파일여부 "+file.isFile());
        System.out.println("폴더여부 "+file.isDirectory());
        System.out.println("파일 크기 "+file.length()); //꽤 많이 쓰임. 파일이름, 경로까지
        System.out.println("파일 절대경로 "+file.getAbsolutePath());
        //file.listFiles(); 디렉토리 대상으로 폴더 내부에 존재하는 파일의 리스트를 검색
        File[] list = folder.listFiles();
        for(File files : list){
            System.out.println(files.getName());
        }

        //Stream에서 input와 output의 기준은 램에서 데이터가 들어오느냐, 나가느냐이다.

    }
}

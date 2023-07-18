package day12.object;

import day12.dao.MemberDAO;
import day12.dao.StudentDAO;
import day12.dto.MemberDTO;
import day12.dto.StudentDTO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(12345);
        Socket client = serverSocket.accept();
        MemberDAO memberDAO = new MemberDAO();
        StudentDAO studentDAO = new StudentDAO();

        InputStream inputStream = client.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        OutputStream outputStream = client.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        String[] info = new String[3];
        while(true){
            String msg = "";
            msg = dataInputStream.readUTF();
            if(msg.equals("1")){
                System.out.println("로그인 화면에서 대기중");
                msg = dataInputStream.readUTF();
                info = msg.split(" ");
                if(memberDAO.validID(info[0],memberDAO.getSHA256(info[1]))){
                    //dataOutputStream.writeUTF("로그인 성공");
                    dataOutputStream.writeBoolean(true);
                    //while
                    while(true){
                        msg = "";
                        msg = dataInputStream.readUTF();
                        switch (msg){
                            case "1":
                                //register
                                System.out.println("학생 정보 등록중");
                                msg = dataInputStream.readUTF();
                                String[] temp = new String[5];
                                temp = msg.split(" ");
                                studentDAO.setStudent(new StudentDTO(temp[0],temp[1],Integer.parseInt(temp[2]),Integer.parseInt(temp[3]),Integer.parseInt(temp[4])));
                                System.out.println("학생 등록 종료");
                                break;
                            case "2":
                                //print
                                System.out.println("학생 출력중");
                                List<StudentDTO> list = studentDAO.getStudent();
                                String print = "";
                                for (StudentDTO stu : list){
                                    print = print + stu.getId()+"\t"+stu.getName()+"\t"
                                            +stu.getKor()+"\t"+stu.getEng()+"\t"+stu.getMath()+"\t"
                                            +stu.getSum()+"\t"+stu.getAvg() + "\n";
                                }
                                dataOutputStream.writeUTF(print);
                                dataOutputStream.flush();
                                System.out.println("학생 출력 종료");
                                break;
                            case "3":
                                //search by name
                                System.out.println("학생 검색 중");
                                List<StudentDTO> searchList = studentDAO.getStudent();
                                String search = "";
                                msg = dataInputStream.readUTF();
                                for (StudentDTO stu : searchList){
                                    if(stu.getName().equals(msg)){
                                        search = search + stu.getId()+"\t"+stu.getName()+"\t"
                                                +stu.getKor()+"\t"+stu.getEng()+"\t"+stu.getMath()+"\t"
                                                +stu.getSum()+"\t"+stu.getAvg() + "\n";
                                    }
                                }
                                dataOutputStream.writeUTF(search);
                                dataOutputStream.flush();
                                System.out.println("학생 검색 종료");
                                break;
                            case "4":
                                //delete
                                System.out.println("학생 삭제중");
                                msg = dataInputStream.readUTF();
                                if(studentDAO.deleteById(msg)){
                                    dataOutputStream.writeUTF("데이터 삭제 완료");
                                }else {
                                    dataOutputStream.writeUTF("데이터 삭제 실패");
                                }
                                dataOutputStream.flush();
                                System.out.println("학생 삭제 종료");
                                break;
                            default:
                                break;
                        }
                    }
                }else {
                    dataOutputStream.writeBoolean(false);
                    //dataOutputStream.writeUTF("로그인 실패");
                }
                dataOutputStream.flush();
                System.out.println("ID\tPWD");
                System.out.println(info[0]+"\t"+info[1]);
            }else if(msg.equals("2")){
                System.out.println("회원가입 화면에서 대기중");
                dataOutputStream.writeUTF("어서오세요");
                dataOutputStream.flush();
                msg = dataInputStream.readUTF();
                info = msg.split(" ");
                for(int i=0; i<info.length; i++)
                {
                    if(info[i].equals(null) || info[i].equals("")){
                        System.out.println("회원가입 실패.");
                    }
                }
                memberDAO.setMember(new MemberDTO(info[0],memberDAO.getSHA256(info[1]),info[2],System.currentTimeMillis()));
                System.out.println("회원가입 성공.");
            }else if(msg.equals("3")){
                List<MemberDTO> members = memberDAO.getMember();
                for(MemberDTO data : members ){
                    dataOutputStream.writeUTF(data.getId()+"\t"+data.getPassword()+"\t"
                    +data.getPassword()+"\t"+data.getDate());
                }
                dataOutputStream.flush();
            }else {
                if(msg.equals("0")) break;
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
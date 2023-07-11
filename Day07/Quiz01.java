package Day07;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {
        //Student class 사용
        Student st = new Student();
        Student[] stu = new Student[3]; //객체배열
        //3명의 학생 정보를 Scanner로 입력
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<stu.length; i++)
        {
            stu[i] = new Student();
            System.out.println("학생 "+(i+1)+"정보 입력");
            System.out.print("ID >> ");
            stu[i].setId(Integer.parseInt(sc.nextLine()));
            System.out.print("이름 >> ");
            stu[i].setName(sc.nextLine());
            System.out.print("국어 성적 >> ");
            stu[i].setKor(Integer.parseInt(sc.nextLine()));
            System.out.print("영어 성적 >> ");
            stu[i].setEng(Integer.parseInt(sc.nextLine()));
            System.out.print("수학 성적 >> ");
            stu[i].setMath(Integer.parseInt(sc.nextLine()));
            stu[i].setHap((stu[i].getKor()+stu[i].getEng()+stu[i].getMath()));
            stu[i].setAvg(stu[i].getHap()/3.0);
        }
        System.out.println("\t학번\t\t이름\t\t국어\t\t\t영어\t\t수학\t\t합계\t\t평균");
        for(int i=0; i<stu.length;i++)
        {
            stu[i].getSungjuk();
        }
        /*
        // 입력이 종료되면 출력.
        int[] id = new int[3];
        String[] name = new String[3];
        int[] kor = new int[3];
        int[] eng = new int[3];
        int[] math = new int[3];

        for(int i=0; i<3; i++)
        {
            System.out.println("학생 "+(i+1)+"정보 입력");
            System.out.print("ID >> ");
            id[i] = Integer.parseInt(sc.nextLine());
            System.out.print("이름 >> ");
            name[i] = sc.nextLine();
            System.out.print("국어 성적 >> ");
            kor[i] = Integer.parseInt(sc.nextLine());
            System.out.print("영어 성적 >> ");
            eng[i] = Integer.parseInt(sc.nextLine());
            System.out.print("수학 성적 >> ");
            math[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(" 학번\t\t이름\t\t국어\t\t\t영어\t\t\t수학\t\t\t\t합계\t\t\t평균");
        for(int i=0; i<3; i++)
        {
            st.setId(id[i]);
            st.setName(name[i]);
            st.setKor(kor[i]);
            st.setEng(eng[i]);
            st.setMath(math[i]);
            st.setHap(kor[i]+eng[i]+math[i]);
            st.setAvg((kor[i]+eng[i]+math[i])/3.0);
            st.getSungjuk();
        }
        */
    }
}

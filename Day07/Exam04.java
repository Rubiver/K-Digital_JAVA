package Day07;
public class Exam04 {
    public static void showStudent(int id, String name, int kor, int eng, int mat)
    {
        Student stu = new Student(); //오버로딩된 student 생성자를 사용
        stu.setId(id);
        stu.setName(name);
        stu.setKor(kor);
        stu.setMath(mat);
        stu.setEng(eng);
        //stu.getInfo();
        System.out.println("ID : "+stu.getId()+"\t이름 : "+stu.getName()+"\t국어 점수 : "+stu.getKor()+"\t영어 점수 : "+stu.getEng()+"\t수학 점수 : "+stu.getMath());
    }
    public static void main(String[] args) {
        showStudent(1001,"Jack",80,85,64);
        showStudent(1002,"Jane",90,75,88);
        showStudent(1003,"Ryan",45, 99, 99);

        //생성자로
        Student stu1 = new Student(1001,"Jack",80,85,64);
        stu1.getInfo();
        Student stu2 = new Student(1002,"Jane",90,75,88);
        stu2.getInfo();
        Student stu3 = new Student(1003,"Ryan",45, 99, 99);
        stu3.getInfo();
    }
}

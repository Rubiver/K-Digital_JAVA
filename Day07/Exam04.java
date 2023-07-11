package Day07;
public class Exam04 {
    public static void showStudent(int id, String name, int kor, int eng, int mat)
    {
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setKor(kor);
        stu.setMath(mat);
        stu.setEng(eng);
        stu.getInfo();
    }
    public static void main(String[] args) {
        Student stu = new Student();
        showStudent(1001,"Jack",80,85,64);
        showStudent(1002,"Jane",90,75,88);
        showStudent(1003,"Ryan",45, 99, 99);

    }
}

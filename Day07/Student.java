package Day07;

public class Student{
    private int id;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEng() {
        return eng;
    }

    public int getId() {
        return id;
    }

    public int getKor() {
        return kor;
    }

    public int getMath() {
        return math;
    }

    public String getName() {
        return name;
    }

    public void getInfo()
    {
        System.out.println("ID : "+id+"\t이름 : "+name+"\t국어 점수 : "+kor+"\t영어 점수 : "+eng+"\t수학 점수 : "+math);
    }
}
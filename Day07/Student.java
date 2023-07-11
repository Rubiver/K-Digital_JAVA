package Day07;

import java.lang.reflect.Constructor;

public class Student{
    private int id;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int hap;
    private double avg;
    //멤버변수에 따로 값을 정해주는 것은 main에서 student 인스턴스를 만들면 변수들에 해당 값을 기본값으로 정하겠다는 것임.
    //Default Value라고 하며 인스턴스 생성 시 제일 먼저 대입됨.

    //Constructor (생성자 메서드)
    //생성자는 새롭게 생성되는 인스턴스의 초기값을 설정할 때 사용되는 메서드이다.
    //생성자 이름은 클래스 이름과 동일 해야함.
    //생성자는 return 값을 가지지 않는다.
    //생성자의 호출 시점은 임의로 지정할 수 없다.

    public Student(){}
    public Student(int id, String name, int kor, int eng, int mat){
        System.out.println("생성자 호출");
        //mqin에서
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = mat;
        this.math = this.math + mat;
    }
    //생성자는 직접 코딩하지 않아도 생성됨. public Student(){} 이런 식으로, Default Constructor라고 불림.
    //클래스 내에서 두번째로 값을 대입함.

    public void setEng(int eng) {
        this.eng = eng;
    }
    //클래스 내에서 세번째로 값을 대입함.

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

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setHap(int hap) {
        this.hap = hap;
    }

    public int getHap() {
        return hap;
    }

    public double getAvg() {
        return avg;
    }

    public void getInfo()
    {
        System.out.println("ID : "+id+"\t이름 : "+name+"\t국어 점수 : "+kor+"\t영어 점수 : "+eng+"\t수학 점수 : "+math);
    }
    public void getSungjuk()
    {
        System.out.println("ID : "+id+"\t이름 : "+name+"\t국어 점수 : "+kor+"\t영어 점수 : "+eng+"\t수학 점수 : "+math+"\t합계 : "+hap+"\t평균 : "+avg);
    }
}
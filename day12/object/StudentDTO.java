package day12.object;

public class StudentDTO {
   private String id;
   private String name;
   private  int kor;
   private int eng;
   private int math;

    public StudentDTO() {
    }

    public StudentDTO(String id, String name, int kor, int eng, int math) {
        this.id = id;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getSum(){
        int result = this.kor+this.eng+this.math;
        return result;
    }
    public double getAvg(){
        double result = getSum() / 3.0;
        return result;
    }

}

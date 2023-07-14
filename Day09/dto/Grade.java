package Day09.dto;

//추상 클래스 : 인스턴스 생성 목적이 아닌 기능 구현을 위한 설계 목적으로 제작되는 설계도.
public abstract class Grade {
    private int id;
    private String name;
    private int point;
    public Grade(int id, String name, int point){ //super()를 통해 값을 넘겨주기 위해 생성자를 만들어줌.
        this.id = id;
        this.name = name;
        this.point = point;
    }
    public Grade(){}
    //생성자는 상속 대상이 아님
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public int getPoint() {
        return point;
    }
    abstract public double getBonus(); //기능의 형태만(설계목적)을 구현하기 위해서 추상메서드로 만듬. 이때, abstract 키워드를 붙혀주어야함.
    public String toString() //Object 클래스에 있는 toString 메서드 오버라이드
    {
        return getId()+"\t"+getName()+"\t"+getPoint()+"\t"+getBonus();
    }

}

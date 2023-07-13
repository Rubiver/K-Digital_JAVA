package Day09.dto;

//Gold is a [grade]?
//Silver is a [grade]? => IS-A 상속
//A 클래스와 B 클래스가 코드 중복 시, 같은 속성(특징)인 경우 상속으로 중복을 제거할 수 있다.

//부모 클래스 - super class, 자식 클래스 - derived class

//만약
public class Gold extends Grade{
    /*public Gold()
    {
        super(); //보이지 않지만 default constructor는 현재 이렇게 존재함. super(); 도 안보임.
                 //Grade의 생성자는 parameter가 3개가 존재하기 때문에 오류가 발생함.
                 //Grade 클래스에서 default constructor를 명시해주면 오류가 사라짐.
    }*/
    public Gold (int id, String name, int point)
    {
        super(id, name, point);
    }
    public double getBonus() {
        return this.getPoint()*0.03; //부모클래스인 Grade클래스의 getBonus 메서드를 "무효화"하고 재정의하여 사용.
    }
    //골드에 있는 field, getter, setter를 Grade 클래스에 옮겨 적음.

    //공툥요소 : id, name, point, get&set, contructor
    /*private int id;
    private String name;
    private int point;

    public Gold (int id, String name, int point)
    {
        this.id = id;
        this.name = name;
        this.point = point;
    }
    public Gold () {}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public double getBonus() {
        return this.point*0.03;
    }*/
}

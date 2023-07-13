package Day09.dto;

public class Grade {
    private int id;
    private String name;
    private int point;
    public Grade(int id, String name, int point){ //super()를 통해 값을 넘겨주기 위해 생성자를 만들어줌.
        this.id = id;
        this.name = name;
        this.point = point;
    }
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
    public double getBonus()
    {
        return this.point * 0.01;
    }

}

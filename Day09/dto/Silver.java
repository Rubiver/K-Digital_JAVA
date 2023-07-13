package Day09.dto;

public class Silver extends Grade{
    //dto mean : Data Transfer Object : View에서 입력된 정보를 ...
    public Silver (int id, String name, int point)
    {
        //this.id = id; 오류발생, 부모클래스의 id가 private이기 때문에 직접 사용할 수 없음.
        //this.setId();
        super(id, name, point); //부모 클래스의 생성자를 호출.
    }
    public double getBonus() {
        return this.getPoint()*0.02;
    }
    /*private int id;
    private String name;
    private int point;

    public Silver() {
    }

    public Silver(int id, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
    }

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

    public double getBonus() {
        //double bonus = (point / 100.0) * 2;
        return this.point*0.02;
        //return bonus;
    }*/
}

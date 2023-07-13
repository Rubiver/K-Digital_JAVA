package Day09.dto;

public class Ruby extends Grade{

    public Ruby(int id, String name, int point)
    {
        super(id, name, point);
    }
    public double getBonus() {
        return this.getPoint()*0.05; //부모클래스인 Grade클래스의 getBonus 메서드를 "무효화"하고 재정의하여 사용.
    }

}

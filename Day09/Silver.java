package Day09;

public class Silver {
    private int id;
    private String name;
    private int point;

    public Silver(){}
    public Silver(int id, String name, int point)
    {
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
    public double getBonus(int point)
    {
        double bonus = (point/100.0)*2;
        return bonus;
    }
}

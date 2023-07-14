package Day09.dto;

public class Ruby extends Grade{

    public Ruby(int id, String name, int point)
    {
        super(id, name, point);
    }
    public double getBonus() {
        return this.getPoint()*0.05; //부모클래스인 Grade클래스의 getBonus 메서드를 "무효화"하고 재정의하여 사용.
    }
    //추상메서드는 이를 상속받는 클래스에게 메서드를 구현(implemnets) 할 것을 강요할 수 있다.
    //상위 클래스 안에 메서드를 상속받았을때 그것을 재정의 하는 것은 오버라이딩이라 하고 상위 클래스의 메서드에 내용이 없는 경우 임플리먼트라고 표현한다.
    //추상화 - 메서드 또는 클래스를 사용 또는 인스턴스화의 실질적 목적이 아닌 특정 코드를 강제하거나, 유도하는 설계 목적으로 사용되는 기법.
}

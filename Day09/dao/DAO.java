package Day09.dao;

import Day09.dto.Gold;
import Day09.dto.Grade;
import Day09.dto.Silver;

public class DAO {

    //DAO mean : Data access object, 데이터의 CRUD를 전담하는 객체
    private Grade[] member = new Grade[10];  //silver와 gold의 부모클래스인 grade클래스는 다형성을 가지고있기 때문에 Grade배열 하나로 관리가 가능.

    //private Silver[] silverMember = new Silver[10];
    //private Gold[] goldMember = new Gold[10];
    private int index = 0;

    public DAO (){}

    public void addMember(Grade grade) {
        this.member[index++] = grade; //View에서 사용자가 입력한 값을 DAO의 member에 값을 넣어주는 메서드.
        //posfix로 ++을 넣어주어 코드 한줄을 아낌.
    }
    public Grade[] getMember()
    {
        return member;
    }
    public int getIndex()
    {
        return index;
    }

    //다형성을 이용한 코딩으로 DAO와의 결합도가 낮아짐.

}

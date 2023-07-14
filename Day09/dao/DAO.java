package Day09.dao;

import Day09.dto.Gold;
import Day09.dto.Grade;
import Day09.dto.Silver;

import java.util.ArrayList;
import java.util.List;

public class DAO {

    //DAO mean : Data access object, 데이터의 CRUD를 전담하는 객체
    private List<Grade> member = new ArrayList<Grade>();  //silver와 gold의 부모클래스인 grade클래스는 다형성을 가지고있기 때문에 Grade배열 하나로 관리가 가능.

    public DAO (){}
    public void addMember(Grade grade) {
        member.add(grade);
        //this.member[index++] = grade; //View에서 사용자가 입력한 값을 DAO의 member에 값을 넣어주는 메서드.
        //posfix로 ++을 넣어주어 코드 한줄을 아낌.
    }
    public List<Grade> getMems()
    {
        return member;
    }
    /*public Grade getMember(int index)
    {
        return (Grade)member.get(index);
    }*/
    //DAO에서 메소드의 많은 콜을 할 필요는 없다. -> View 데이터를 한번에 가져와서 출력하는 방식으로도 해보기.
    public int getIndex()
    {
        return member.size();
    }

    //다형성을 이용한 코딩으로 DAO의 결합도가 낮아짐.

}

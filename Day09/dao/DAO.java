package Day09.dao;

import Day09.dto.Gold;
import Day09.dto.Silver;

public class DAO {
    //DAO mean : Data access object, 데이터의 CRUD를 전담하는 객체
    private Silver[] silverMember = new Silver[10];
    private Gold[] goldMember = new Gold[10];
    private int silverIndex = 0;
    private int goldIndex = 0;

    public DAO (){}

    public void addMember(Silver silverMember) {
        this.silverMember[silverIndex++] = silverMember; //View에서 사용자가 입력한 값을 DAO의 member에 값을 넣어주는 메서드.
        //posfix로 ++을 넣어주어 코드 한줄을 아낌.
    }
    public void addMember(Gold goldMember)
    {
        this.goldMember[goldIndex++] = goldMember;
    }

    public Silver[] getSilverMember()
    {
        return silverMember;
    }
    public Gold[] getGoldMember()
    {
        return goldMember;
    }
    public int getSilverIndex()
    {
        return silverIndex;
    }
    public int getGoldIndex()
    {
        return goldIndex;
    }

}

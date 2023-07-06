package Day03;
public class Exam07 {
    public static void main(String[] args) {
        int i;
        abc : while(true)
        {
            for(i=1; i<=10; i++)
            {
                if( i==2 || i == 5)
                {
                    continue;
                }
                System.out.println("i = " + i);
                if(i==8)
                {
                    break abc; //Label Break : 중첩 반복문을 탈출할 때 반복문 앞에 라벨을 달아 주고 break에 해당 라벨을 사용하여 탈출할 수 있음.
                }
            }
        }



    }
}

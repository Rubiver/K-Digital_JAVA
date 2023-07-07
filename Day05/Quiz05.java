package Day05;

public class Quiz05 {
    public static void main(String[] args) {

        int[] lotto = new int[45];
        int sort;

        for(int i=0; i< lotto.length; i++)
        {
            lotto[i] = i+1;
        }

        //1 ~ 45 사이의 중복되지 않는 난수 7개를 추출하여 화면에 출력
        for(int i=0; i< lotto.length * 100; i++)
        {
            int x = (int)(Math.random() * 45);
            int y = (int)(Math.random() * 45);
            int tmp = lotto[x];
            lotto[x] = lotto[y];
            lotto[y] = tmp;
        }
        for(int i=0; i<7; i++)
        {
            if(i == 6)
            {
                System.out.print("Bonus : ");
                System.out.println(lotto[i]);
            }
            else
            {
                System.out.println(lotto[i]);
            }

        }

    }
}

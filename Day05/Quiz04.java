package Day05;

public class Quiz04 {
    public static void main(String[] args) {
        //카드 섞기 알고리즘, 1~5사이의 난수 3개 출력
        int[] rand = new int[3];
        int[] card = new int[]{1,2,3,4,5};
        int temp = 0;
        boolean equal = false;
        /*
        for(int i=0; i<rand.length; i++)
        {
            if(!equal)
            {
                rand[i] = (int)(Math.random() * 5 + 1);
                equal = false;
            }
            else if(rand[i]==rand[i+1])
            {
                equal = true;
            }
        }*/

        //요소 두개를 swap하여 난수를 생성. random의 범위는 요소의 갯수만큼.
        for(int i=0; i< card.length * 10; i++)
        {
            int x = (int)(Math.random() * 5);
            int y = (int)(Math.random() * 5);
            int tmp = card[x];
            card[x] = card[y];
            card[y] = tmp;
        }

        for(int i=0; i<card.length; i++)
        {
            System.out.println(card[i]);
        }

    }
}

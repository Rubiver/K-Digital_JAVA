package Day03;
import java.util.Scanner;

public class Quiz07 {
    public static void main(String[] args) {
        //1 to 100 출력.
        /*int i = 1;
        while(i<= 100)
        {
            System.out.println(i);
            i++;
        }*/

        //100 to 1 출력
        /*int j =100;
        while(j>=1)
        {
            System.out.println(j);
            j--;
        }*/

        //50 to 100 홀수 출력
        int ii = 50;
        while(ii <= 100)
        {
            if(ii % 2 == 1)
            {
                System.out.println(ii);
            }
            ii++;
        }
    }
}

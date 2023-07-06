package Day03;

public class Star {
    public static void main(String[] args) {
        {
            for(int i=5; i > 0; i--)
            {
                for(int j = i; j < 5; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=0; i < 5; i++)
            {
                for(int j = i; j < 5; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        //Q13
        {
            for(int i=0; i < 5; i++)
            {
                for(int j = i; j < 5; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=5; i > 0; i--)
            {
                for(int j = i; j <= 5; j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("");
        }

        //Q14
        {
            for(int i=5; i>0; i--)
            {
                for(int j=i; j>0; j--)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }
}

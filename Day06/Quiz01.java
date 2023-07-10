package Day06;

public class Quiz01 {
    public static char grade(int score)
    {
        if(score>=90)
        {
            return 'A';
        }
        else if(score>=80)
        {
            return 'B';
        }
        else if(score>=70)
        {
            return 'C';
        }
        else if(score>=60)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }

    public static double avg(int[] score)
    {
        int sum = 0;
        for(int i=0; i<score.length; i++)
        {
            sum += score[i];
        }
        return sum/(double)score.length;
    }

    public static int max(int[] scores)
    {
        int result = 0;
        for(int i=0; i<scores.length; i++)
        {
            if(scores[i]>result)
            {
                result = scores[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] scores =  new int[] { 50, 75, 87, 64, 36};
        System.out.println("평균 : "+avg(scores));
        System.out.println("등급 : "+grade((int)avg(scores)));
        System.out.println("제일 높은 수 : "+max(scores));
    }
}

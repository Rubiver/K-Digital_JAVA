package Day06;

public class Quiz02 {
    public static int countA(String str)
    {
        char[] charArr = str.toCharArray();
        int count = 0;
        for(int i=0; i<charArr.length; i++)
        {
            if(charArr[i]=='A')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "AlwekfmeofmdpdvoierjajAratakeaArsen";
        //
        int result = countA(str);
        System.out.println(result);
    }
}

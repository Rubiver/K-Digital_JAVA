package Day03;
public class Exam08 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            if(i == 5)
            {
                continue; //continue 이후의 코드를 무시하고 자신이 속한 반복문의 마지막으로 이동. (반복문 스킵, 탈출은 하지 않음.)
            }
            System.out.println(i);
        }
    }
}

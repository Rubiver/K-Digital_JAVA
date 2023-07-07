package Day05;

public class Quiz03 {
    public static void main(String[] args) {
        //Swap 을 이용한 배열 정렬
        //Bubble sort : 요소에 대한 n-1번 정렬 + n-1번 만큼의 정렬 수행이 필요..

        int temp;
        int[] arr = new int[]{102, 20, 5,56, 77,98,56,34, 68,15};

        //Sort 전 값
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("-----------------------------");
        //Sort 후 값.
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

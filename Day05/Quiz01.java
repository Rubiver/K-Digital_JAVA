package Day05;

public class Quiz01 {
    public static void main(String[] args) {
        //int형 변수 5개를 집합시킨 배열 arr1을 만들고
        int[] arr1 = new int[]{1,2,3,4,5};
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 5;

        for(int i=0; i<5; i++)
        {
            arr1[i] = i+1;
            System.out.println(arr1[i]);
        }

        //char
        char[] arr2 = new char[] {'A','B','C','D'};
        arr2[0] = 'A';
        arr2[1] = 'B';
        arr2[2] = 'C';
        arr2[3] = 'D';
        for(int i=0; i<4; i++)
        {
            arr1[i] = (char)i+65;
            System.out.println((char)arr1[i]);
        }


        //String 변수 2개 arr3
        String[] arr3 = new String[] {"Apple","Orange"};
        arr3[0] = "Apple";
        arr3[1] = "Orange";

        //int형 변수 100개를 집합시킨 배열 arr4를 만들고 저장.
        int[] arr4 = new int[100];
        System.out.println("1~100 저장");
        for(int i=0; i<100; i++)
        {
            arr4[i] = i+1;
            System.out.print(arr4[i]);
            System.out.print(" ");
            if(i % 10 == 0)
            {
                System.out.println("");
            }
        }

        //100 to 1
        //int형 변수 100개를 집합시킨 배열 arr4를 만들고 저장.
        int[] arr5 = new int[100];
        System.out.println("\n100~1 저장");
        for(int i=0; i<arr5.length; i++) //배열의 크기만큼 반복을 할때 변수명.length를 사용하는 것이 편리하다.
        {
            arr5[i] = 100-i;
            System.out.print(arr5[i]);
            System.out.print(" ");
            if(i % 10 == 0)
            {
                System.out.println("");
            }
        }

        //arr6 char A to Z
        System.out.println("\nA-Z 저장");
        char[] arr6 = new char[26];
        for(int i=0; i<26; i++)
        {
            arr6[i] = (char)(i+65);
            System.out.print(arr6[i]);
            System.out.print(" ");
        }

    }
}

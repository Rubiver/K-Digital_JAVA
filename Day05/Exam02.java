package Day05;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= 0;
        int y = 0;
        int z = 0;
        int[] box = new int[3];

        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];

        int[] dimension = new int[3];

        /*
        System.out.print("첫 번째 값 입력 : ");
        x = Integer.parseInt(sc.nextLine());

        System.out.print("두 번째 값 입력 : ");
        y = Integer.parseInt(sc.nextLine());

        System.out.print("세 번째 값 입력 : ");
        z = Integer.parseInt(sc.nextLine());

        System.out.println("첫 번째 입력값 : "+x);
        System.out.println("두 번째 입력값 : "+y);
        System.out.println("세 번째 입력값 : "+z);
        */
        //한개의 배열에 세개의 값을 입력, 출력
        for(int i=0; i<box.length; i++)
        {
            System.out.print((i+1)+" 번째 값 입력 : ");
            box[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i=0; i<box.length; i++)
        {
            System.out.println((i+1)+" 번째 입력값 : "+box[i]);
            System.out.println("");
        }

        //3개의 배열에 각 10개씩 입력하고 출력
        for(int i=0; i<10; i++)
        {
            System.out.print("x의 "+(i+1)+" 번째 값 입력 : ");
            arr1[i] = Integer.parseInt(sc.nextLine());

            System.out.print("y의 "+(i+1)+" 번째 값 입력 : ");
            arr2[i] = Integer.parseInt(sc.nextLine());

            System.out.print("z의 "+(i+1)+" 번째 값 입력 : ");
            arr3[i] = Integer.parseInt(sc.nextLine());
        }
        for(int i=0; i<10; i++)
        {
            System.out.println("x의 "+(i+1)+" 번째 입력값 : "+arr1[i]);
            System.out.println("y의 "+(i+1)+" 번째 입력값 : "+arr2[i]);
            System.out.println("z의 "+(i+1)+" 번째 입력값 : "+arr3[i]);
            System.out.println("");
        }

        for(int i=0; i<dimension.length; i++)
        {

        }
    }
}

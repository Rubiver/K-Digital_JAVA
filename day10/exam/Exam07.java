package day10.exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exam07 {
    public static void main(String[] args) throws Exception {
        //자바에서 시간을 다루는 방법.
        //컴퓨터의 시간은 1970년 1월1 일부터 시작.
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy MM dd hh mm ss");
        String result = sdf1.format(currentTime);
        System.out.println(result);

        String timeStr = "2014년10월06일";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
        Date date = sdf2.parse(timeStr);
        System.out.println(date);




    }
}
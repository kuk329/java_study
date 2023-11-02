package codingTest.softeer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Lv1. 근무 시간
 */
public class Sol1 {
    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        String start = sc.next();
//        String end = sc.next();
//
//        System.out.println(start);
//        System.out.println(end);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//        Date date1 = sdf.parse(start);
//        Date date2 = sdf.parse(end);
//
//        long timeMill1 = date1.getTime();
//        long timeMill2 = date2.getTime(); //Date -> 밀리세컨즈
//
//        // 비교
//        long diff = timeMill2 - timeMill1;
//
//        long diffSec = diff/1000;
//        long diffMin =  diffSec/60;
//
//        System.out.println("시간 차이(초) : "+diffSec);
//        System.out.println("시간 차이(분) : "+diffMin);

        String start;
        String end;
        Scanner sc = new Scanner(System.in);
        long result = 0;
        for(int i=0; i<5; i++){
            start=sc.next();
            end = sc.next();
            int[] startArr = changeStringTimeToInt(start);
            int[] endArr = changeStringTimeToInt(end);
            int i1 = changeToMin(startArr);
            int i2 = changeToMin(endArr);
            int tmp = i2-i1;
            result+=tmp;
        }

        System.out.println(result);
    }
    public static int[] changeStringTimeToInt(String str){
        String[] splitStr = str.split(":");
        int min=Integer.parseInt(splitStr[0]);
        int sec = Integer.parseInt(splitStr[1]);
        int[] time = new int[2];
        time[0] = min;
        time[1] = sec;
        return time;
    }

    public static int changeToMin(int[] arr){
        int result;
        int first = arr[0];
        result = first*60 + arr[1];
        return  result;
    }

}

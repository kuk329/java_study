package codingTest.this_is_codingTest.dp;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * 1로 만들기
 */
public class Sol1 {

    public static int[] d =new int[30001]; // dp table

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        d[1] = 0;

        for(int i=2; i<=x; i++){ // bottom up
            d[i] = d[i-1] +1; // 1을 뺀 경우
            if(i%2==0)
                d[i] = Math.min(d[i/2]+1,d[i]);
            if(i%3==0)
                d[i] = Math.min(d[i/3]+1,d[i]);
            if(i%5==0)
                d[i] = Math.min(d[i/5]+1,d[i]);
        }
        System.out.println(d[x]);

    }
}

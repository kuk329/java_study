package codingTest.backejoon.dp;

import java.util.Scanner;

/**
 * 2xn 타일링
 */
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[1001];
    //    d[0]=1;
        d[1]=1;
        d[2]=2;
        for(int i=3; i<=n; i++){
            d[i]=d[i-1]+d[i-2];
            d[i]%=10007;
        }
        System.out.println(d[n]);
    }
}

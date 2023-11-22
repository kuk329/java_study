package codingTest.this_is_codingTest.dp;

import java.util.Scanner;

/**
 * 바닥 공사
 */
public class Sol3 {
    public static int[] dp = new int[1001];
    public static final int MOD = 796_796;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp[1] = 1;
        dp[2] = 3;

        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2]*2;
        }

        System.out.println(dp[n]%MOD);

    }
}

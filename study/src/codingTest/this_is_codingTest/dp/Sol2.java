package codingTest.this_is_codingTest.dp;

import java.util.Scanner;

/**
 * 개미 전사
 */
public class Sol2 {

    public static int[] dp = new int[100]; // dp[i-1] : i번까지 확인했을때 털수있는 최대 식량수
    public static void main(String[] args) {

        // 규칙 : 자기 양 옆으로는 털수 없음.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] s = sc.nextLine().split(" ");
        int[] foods = new int[n];

        for(int i=0; i<s.length; i++){
            foods[i] = Integer.parseInt(s[i]);
        }

        dp[0] = foods[0];
        dp[1] = Math.max(dp[0],foods[1]);

        for(int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-2]+foods[i],dp[i-1]);
        }

        System.out.println(dp[n-1]);
    }
}

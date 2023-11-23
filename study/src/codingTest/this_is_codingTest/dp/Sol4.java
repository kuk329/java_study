package codingTest.this_is_codingTest.dp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 효율적인 화폐 구성
 */
public class Sol4 {
    private static int[] d = new int[101];
    private static final int DP_INIT_NUM = 10_001;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]); // 화폐 종류
        int m = Integer.parseInt(input[1]); // 가치의 합

        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }

        Arrays.fill(d,DP_INIT_NUM);
        d[0] = 0;

        for(int i=0; i<n; i++){
            d[coins[i]]=1; // dp table 초기화
        }

        for(int i=0; i<=m; i++){
            for(int j=0; j<n; j++){
                if(i>coins[j]){
                    d[i] = Math.min(d[i-coins[j]]+1,d[i]);
                }

            }
        }
        if(d[m]==DP_INIT_NUM){
            System.out.println(-1);
        }else{
            System.out.println(d[m]);
        }


    }
}

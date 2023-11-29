package codingTest.this_is_codingTest.bfs_dfs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 연구소
 */
public class Sol2 {
    public static void main(String[] args) {
        // 벽 3개를 세울수 있는 모든 경우의 수를 다 해봐야됨.
        // 어떻게 모드 경우의 수를 다 확인할 수 있을까??
        // 3중 for문으로

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; j<n; k++){

                }
            }
        }



    }
}

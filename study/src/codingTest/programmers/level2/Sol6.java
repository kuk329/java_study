package codingTest.programmers.level2;

/**
 * 의상
 */
public class Sol6 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] land = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};

        int result = sol.solution(land);
        System.out.println(result);


    }
}

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int n = land.length;
        int dp[][] = new int[n][4];

        for (int i = 0; i < 4; i++) {
            dp[0][i] = land[0][i];
        }

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i - 1][3], Math.max(dp[i - 1][1], dp[i - 1][2])) + land[i][0];
            dp[i][1] = Math.max(dp[i - 1][3], Math.max(dp[i - 1][0], dp[i - 1][2])) + land[i][1];
            dp[i][2] = Math.max(dp[i - 1][3], Math.max(dp[i - 1][0], dp[i - 1][1])) + land[i][2];
            dp[i][3] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][1], dp[i - 1][2])) + land[i][3];
        }

        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, dp[n - 1][i]);
        }

        return answer;
    }
}
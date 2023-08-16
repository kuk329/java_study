package codingTest.programmers.level2;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 멀리 뛰기
 */
public class Sol4 {
    public static void main(String[] args) {
        Solution4 sol4 = new Solution4();
        long solution = sol4.solution(4);
        long solution1 = sol4.solution(3);
        System.out.println(solution);
        System.out.println(solution1);

    }
}

class Solution4{
    public long solution(int n) {
        if(n==1){
            return 1;
        }
        long[] dp=new long[n+1];
        dp[1]=1;
        dp[2]=2;

        for(int i=3; i<n+1; i++){
            dp[i]=dp[i-1]+dp[i-2];
            dp[i]%=1234567;
        }

        return dp[n];



    }


}

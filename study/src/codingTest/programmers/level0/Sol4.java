package codingTest.programmers.level0;

import java.util.Arrays;

/**
 * 조건에 맞게 수열 변환하기 3
 */
public class Sol4 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] solution = sol.solution(arr, 3);
        System.out.println(Arrays.toString(solution));

    }


}

class Solution1{
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(operand -> k%2==0? operand+k : operand*k).toArray();
    }
}


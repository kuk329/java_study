package codingTest.programmers.level2;

/**
 * 피보나치 수
 */
public class Sol2 {
    public static void main(String[] args) {
        Solution2 sol2 = new Solution2();
        int solution = sol2.solution(5);
        System.out.println(solution);

    }
}

class Solution2 {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1]; // dp 저장 공간
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            arr[i] %= 1234567;
        }
        answer = arr[n];
        return answer;
    }
}

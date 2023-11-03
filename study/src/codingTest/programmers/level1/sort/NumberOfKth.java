package codingTest.programmers.level1.sort;

import java.util.Arrays;

/**
 * Lv.1 K번째 수
 */
public class NumberOfKth {
    public static void main(String[] args) {
        int[] answer ;
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution sol = new Solution();
        answer = sol.solution(array, commands);

        System.out.println(Arrays.toString(answer));

    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] answer = new int[n];


        for(int i=0; i<n; i++){
            int k = 0;
            int[] tmp = new int[commands[i][1]-commands[i][0]+1];
            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                tmp[k++] = array[j-1];
            }
            Arrays.sort(tmp);
            answer[i]= tmp[commands[i][2]-1];

        }
        return answer;
    }
}
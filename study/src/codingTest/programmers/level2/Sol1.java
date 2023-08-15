package codingTest.programmers.level2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/**
 * JadenCase 문자열 만들기
 */
public class Sol1 {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        String solution = sol.solution("3people unFollowed me");
        System.out.println(solution);

    }
}

class Solution1 {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
      //  System.out.println(Arrays.toString(sp));
        boolean flag = true;
        for(String ss : sp){
            answer+=flag? ss.toUpperCase():ss;
            flag = ss.equals(" ") ? true : false;
        }
        return answer;
    }
}

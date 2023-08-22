package codingTest.programmers.level0;

/**
 * 문자열안에 문자열
 */
public class Sol5 {
    public static void main(String[] args) {
        Solution2 sol2 = new Solution2();
        int result = sol2.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
        System.out.println(result);
    }


}
class Solution2 {
    public int solution(String str1, String str2) {


        return str1.contains(str2)?1:2;
    }
}

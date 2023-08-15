package codingTest.programmers.level0;

import java.util.Scanner;

/**
 * 문자열 반복해서 출력하기
 */
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        // sol 1 - 새로운 문자열 변수를 생성해서 n 만큼 반복한 문자열을 넣어줌.
        String result = "";
        for(int i=0; i<n; i++){
            result +=str;
        }

        System.out.println(result);

        // sol 2 - repeat 함수를 사용해서 문자열 반복하기
        System.out.println(str.repeat(n));

    }
}

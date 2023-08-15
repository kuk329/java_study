package codingTest.programmers.level0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 대소문자 바꿔서 출력하기
 */
public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); // 문자열(단어) 입력받음. hello

        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i); // 문자열에서 문자 하나씩 꺼내기
            if(Character.isUpperCase(c)){ // 해당 문자가 대문자이면
                System.out.print((char)(c+32)); // 소문자로 변환
            }else{ // 해당 문자가 소문자이면
                System.out.print((char)(c-32)); // 대문자로 변환
            }

        }


    }


}

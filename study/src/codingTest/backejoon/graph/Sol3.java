package codingTest.backejoon.graph;

import java.util.Arrays;

/**
 * 2667 단지번호붙이기
 */
public class Sol3 {
    public static void main(String[] args) {
        String str = "123";
        for(int i=0; i<str.length(); i++){
            int i1 = str.charAt(0) - '0';
            int i2 = Integer.parseInt(str.charAt(1) + "");
            System.out.println(i1);
            System.out.println(i2);


        }
      
    }
}

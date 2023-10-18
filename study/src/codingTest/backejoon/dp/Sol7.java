package codingTest.backejoon.dp;

import java.util.Scanner;

/**
 * 제곱수의 합 (1699번)
 */
public class Sol7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 키보드 입력을 위해서
        int n = sc.nextInt(); // 정수 입력
        int[] d = new int[n+1]; // dp 저장을 위한 배열 : 1 ~ n
        int j = 0;
        for(int i=1; i<=n; i++){
            d[i] = i;
            j = 1;
            while(j*j<=i){
                if(d[i] > d[i-j*j] + 1 ){
                    d[i] = d[i-j*j] + 1;
                }
                j+=1;
            }
        }

        System.out.println(d[n]);


    }


}

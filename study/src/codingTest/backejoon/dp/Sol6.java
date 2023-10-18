package codingTest.backejoon.dp;

import java.util.Scanner;

/**
 * 연속합 (1912번)
 */
public class Sol6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수 n 입력받음.
        int a[] = new int[n]; // n 크기만큼의 배열 생성
        int d[] = new int[n]; // dp 저장을 위한 배열 생성

        for(int i=0; i<n; i++){
            a[i]=sc.nextInt(); // 배열 초기화
        }

        d[0] = a[0]; // 초기값

        for(int i=1; i<n; i++){
            d[i] = a[i];
            int i1 = d[i - 1] + a[i];
            if(i1 >d[i]){
                d[i] = i1;
            }
        }

        int ans = d[0];

        for(int i=1; i<n; i++){
            if(ans<d[i]){
                ans=d[i];
            }
        }

        System.out.println(ans);


        }

}

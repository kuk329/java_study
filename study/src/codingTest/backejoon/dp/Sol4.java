package codingTest.backejoon.dp;

import java.util.Scanner;

/**
 * 가장 긴 증가하는 부분 수열 (11053)
 */
public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수열 a의 크기
        int [] a= new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        int[] d = new int[n];
        for(int i=0; i<n; i++){
            d[i]=1;
            for(int j=0; j<i; j++){
                if(a[j]<a[i] && d[j]+1>d[i]){
                    d[i]=d[j]+1;
                }
            }
        }

        int ans = d[0]; // 최댓값 찾기
        for(int i=1; i<n; i++){
            if(ans<d[i]){
                ans=d[i];
            }
        }
        System.out.println(ans);

    }
}

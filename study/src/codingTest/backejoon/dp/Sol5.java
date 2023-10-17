package codingTest.backejoon.dp;

import java.util.Scanner;

/**
 * 가장 긴 증가하는 부분 수열 4 (14002)
 */
public class Sol5 {
    static int[] a;
    static int[] d;
    static int[] v;
    static void go(int p){ // stack 방식으로 출력
        if(p==-1)return;
        go(v[p]);
        System.out.print(a[p]+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n]; // 배열 크기 결정
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt(); // 수열 저장
        }

        d = new int[n]; // 배열 크기 결정
        v = new int[n]; // 배열 크기 결정

        // dp
        for(int i=0; i<n; i++){
            d[i]=1; // 기본값을 d[i] 는 1, v[i]는 -1로
            v[i]=-1;
            for(int j=0; j<i; j++){
                if(a[j]<a[i] && d[i]<d[j]+1){
                    d[i] = d[j]+1;
                    v[i] = j;
                }
            }
        }
        int ans = d[0]; // 가장 큰 증가하는 부분 수열의 길이 찾기
        int p = 0; // 가장 큰 증가하는 부분 수열의 길이가 저장된 d 배열의 index
        for(int i=0; i<n; i++){
            if(ans<d[i]){
                ans = d[i];
                p=i;
            }
        }
        System.out.println(ans);
        go(p);

    }

}

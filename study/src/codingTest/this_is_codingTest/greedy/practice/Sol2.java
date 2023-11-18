package codingTest.this_is_codingTest.greedy.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 큰 수의 법칙
 */
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // 배열 arr 오름차순 정렬
        int first = arr[n-1];
        int second = arr[n-2];

        int count = 0;
        int result = 0;

        for(int i=0; i<m; i++){
            if(count<k){
                result+=first;
                count++;
            }else{
                result +=second;
                count = 0;
            }
        }

        System.out.println(result);

    }
}

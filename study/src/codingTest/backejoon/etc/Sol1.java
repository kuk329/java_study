package codingTest.backejoon.etc;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 2075 N번째 큰 수
 */
public class Sol1 {
    public static void main(String[] args) {
        // 값 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
                priorityQueue.add(arr[i][j]);
            }
        }

        for(int i=1; i<n; i++){
            priorityQueue.poll();
        }

        System.out.println(priorityQueue.poll());




    }
}

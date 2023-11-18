package codingTest.this_is_codingTest.greedy.practice;

import java.util.Scanner;

/**
 * 숫자 카드 게임
 */
public class Sol3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int min_row;
        int result = 0;

        for (int i = 0; i < n; i++) {
            min_row = 10000;
            for (int j = 0; j < m; j++) {
                int tmp = arr[i][j];
                if (min_row > tmp) { // 행별로 최소값
                    min_row = tmp;
                }
            }
            if (result < min_row) { // 그중에 최대값
                result = min_row;
            }
        }
        System.out.println(result);
    }
}

// int min = Math.min(3, 4); 최소값 구하는 함수



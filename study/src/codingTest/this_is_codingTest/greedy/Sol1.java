package codingTest.this_is_codingTest.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 모험가 길드
 */
public class Sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 모험가 수
        int[] fear = new int[n];
        for (int i = 0; i < n; i++) {
            fear[i] = sc.nextInt();
        }

        // 공포심 오름차순 정렬
        Arrays.sort(fear);

        int group = 0;
        int count = 0;

        for (int f : fear) {
            count += 1;
            if (count >= f) {
                group += 1;
                count = 0;
            }
        }

        System.out.println(group);
    }
}

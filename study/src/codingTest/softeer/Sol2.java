package codingTest.softeer;

import java.util.Scanner;

/**
 * Lv1. 주행거리 비교하기
 */
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A");
        } else if (b > a) {
            System.out.println("B");
        } else {
            System.out.println("same");
        }
    }
}

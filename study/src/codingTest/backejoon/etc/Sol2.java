package codingTest.backejoon.etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * 11286 절대값 힙
 */
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->{
            int abs1 = Math.abs(a);
            int abs2 = Math.abs(b);

            if(abs1==abs2) return a>b? 1:-1; // 절대값이 같은 경우는 더 작은 수를 return
            return abs1-abs2;

        });


        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x == 0) {
                Integer out = queue.poll();
                if(out==null){
                    System.out.println(0);
                }else{
                    System.out.println(out);
                }

            } else {
                queue.add(x);
            }
        }

    }
}

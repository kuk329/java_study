package codingTest.this_is_codingTest.greedy.practice;

import java.util.Scanner;

/**
 * 1이 될 때까지
 */
public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int count = 0;

        while(true){
            if(n==1){
                break;
            }

            if(n%k==0){
                n = n/k;
            }else{
                n-=1;
            }

            count+=1;

        }
        System.out.println(count);
    }
}

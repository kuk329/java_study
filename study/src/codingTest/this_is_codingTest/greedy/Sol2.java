package codingTest.this_is_codingTest.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 곱하기 혹은 더하기
 */
public class Sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split("");
      //  System.out.println(Arrays.toString(split));

        ArrayList<Integer> arr = new ArrayList<>();
        for (String s : split) {
            arr.add(Integer.parseInt(s));
        }
        int result = arr.get(0);

        for(int i=1; i< arr.size(); i++){
            if(result<=1 || arr.get(i)<=1){
                result+=arr.get(i);
            }else{
                result*=arr.get(i);
            }
        }

        System.out.println(result);

    }
}

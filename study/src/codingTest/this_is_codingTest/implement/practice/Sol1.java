package codingTest.this_is_codingTest.implement.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 상하좌우
 */
public class Sol1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] plans = sc.nextLine().split(" "); // 골백을 기준으로 문자를 나눔

        int x=1, y=1; // 출발 위치

        // L,R,U,D 에 따른 이동 방향
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        char[] moveTypes = {'L','R','U','D'};

        for(int i=0; i<plans.length; i++){
            char plan = plans[i].charAt(0); // 문자열에서 가장 첫번째 글자 꺼냄 (한글자)

            int nx = 0, ny = 0;
            for(int j=0; j<4; j++){
                if(plan==moveTypes[j]){
                    nx = x+dx[j];
                    ny = y+dy[j];
                }
            }
            if(nx<1|| ny<1 || nx>n || ny>n) continue; // 공간을 벗어나면 무시
            x=nx;
            y=ny;
        }
        System.out.println(x+" "+y);


    }
}
package codingTest.backejoon.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 11724 연결 요소의 개수
 */
public class Sol2 {

    static ArrayList<Integer>[] edge;
    static boolean[] visited; // 방문한 정점 정보 저장

    public static void dfs(int x){
        visited[x] = true; // 방문 처리
        for(int v : edge[x]){
            if(visited[v]==false){
                dfs(v);
            }
        }
    }

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start); // 시작 정점
        while(!q.isEmpty()){
            int x= q.remove(); // 가장 앞에있는 값 제거
            visited[x] = true;
            for(int v: edge[x]){
                if(visited[v]==false){
                    q.add(v);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정점 개수
        int m = sc.nextInt(); // 간선 개수
        int answer = 0;

        visited = new boolean[n+1]; // 크기 지정
        edge = (ArrayList<Integer>[]) new ArrayList[n+1]; // 크기 지정

        for(int i = 1; i<=n; i++){
            edge[i] = new ArrayList<Integer>(); // 간선 저장을 위한 초기화
        }

        for(int i=0; i<m; i++){ // 간선 정보 저장.
            int u = sc.nextInt();
            int v = sc.nextInt();
            edge[u].add(v);
            edge[v].add(u);
        }


        for(int i=1; i<=n; i++){
            if(visited[i]==false){
                dfs(i);
               // bfs(i); -> 메모리 초과 에러
                answer++;
            }

        }

        System.out.println(answer);

    }
}

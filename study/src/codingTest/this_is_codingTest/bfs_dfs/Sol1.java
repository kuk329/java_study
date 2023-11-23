package codingTest.this_is_codingTest.bfs_dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 특정 거리의 도시 찾기
 */

public class Sol1 {


    public static ArrayList<ArrayList<Integer>> edge = new ArrayList<>();
    public static Queue<Integer> q = new LinkedList<>();
    public static int[] distance;
    public static int k = 0;

    public static ArrayList<Integer> result = new ArrayList<>();

    public static void BFS(int start) {
        distance[start] = 0; // 출발 도시 거리 초기화

        q.offer(start);

        while (!q.isEmpty()) {
            int poll = q.poll();
            for (int i = 0; i < edge.get(poll).size(); i++) {
                int u = edge.get(poll).get(i);
                if (distance[u] == -1) {
                    q.add(u);
                    distance[u] = distance[poll] + 1;
                    if (distance[u] == k) {
                        result.add(u);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        k = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i <=n; i++) {
            edge.add(new ArrayList<Integer>());
        }

        distance = new int[n + 1]; // x에서 각 노드까지의 거리 저장
        Arrays.fill(distance, -1);

        for (int i = 0; i < m; i++) { // 간선 정보 저장.
            int u = sc.nextInt();
            int v = sc.nextInt();
            edge.get(u).add(v);
        }

        BFS(x); // 시작 노드

//        for (ArrayList<Integer> integers : edge) {
//            System.out.println(integers);
//        }

        if (result.size() == 0) {
            System.out.println(-1);
        } else {
            Collections.sort(result);
            for (Integer node : result) {
                System.out.println(node);

            }
        }

    }
}

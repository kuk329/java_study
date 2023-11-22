package codingTest.this_is_codingTest.bfs_dfs.practice;

import java.util.Scanner;

/**
 * 음료수 얼려 먹기
 */
public class Sol1 {
    public static int n,m;
    public static int[][] graph = new int[1000][1000];

    public static boolean dfs(int x, int y){ // 한번에 연결된곳 모두 탐색
        if(x<=-1 || x>=n || y<=-1 || y>=m) return false; // 위치가 틀을 벗어나면 false

        if(graph[x][y]==0){ // 얼음을 담을수 있는 공간이면
            graph[x][y]=1; // 방문 표시
            // 갈수있는 모든 곳을 방문
            dfs(x-1,y);
            dfs(x+1,y);
            dfs(x,y-1);
            dfs(x,y+1);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 세로
        m = sc.nextInt(); // 가로
        sc.nextLine(); // 버퍼 지움

        for(int i=0; i<n; i++){ //2 차원 얼음틀 정보 입력
            String str = sc.nextLine(); // 1행 한줄로 입력
            for(int j=0; j<m; j++){
                graph[i][j] = str.charAt(j)-'0'; // 정수로 변환해서 저장
            }
        }
        // 모든 위치에 음료수 채우기
        int result = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // 현재 위치에서 DFS 수행
                if(dfs(i,j)){
                    result+=1;
                }

            }
        }
        System.out.println(result);
    }
}

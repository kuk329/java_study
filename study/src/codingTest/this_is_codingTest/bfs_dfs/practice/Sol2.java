package codingTest.this_is_codingTest.bfs_dfs.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 미로 탈출
 */
class Node{
    private int x;
    private int y;

    public Node(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY(){
        return this.y;
    }
}
public class Sol2 {
    public static int n,m;
    public static int[][] graph = new int[201][201];

    // 이동할 4가지 방향
    public static int dx[]={-1,1,0,0};
    public static int dy[]={0,0,-1,1};

    public static int bfs(int x, int y){
        // 큐 라이브러리를 사용 (x,y 좌표값은 Node 클래스를 이용해 저장)
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y)); // 새로운 노드 추가
        while(!q.isEmpty()){
            Node node = q.poll();
            x = node.getX();
            y = node.getY();
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
                if(graph[nx][ny]==0) continue; //  벽인 경우
                if(graph[nx][ny]==1){
                    graph[nx][ny] = graph[x][y]+1;
                    q.offer(new Node(nx,ny)); // 그 다음 위치로 이동
                }

            }
        }
        return graph[n-1][m-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();



    }
}

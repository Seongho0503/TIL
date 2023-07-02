import java.io.*;
import java.util.*;

public class Main {
	
	static int[][] dp;
	static int[][] map;
	static Point target;
	static int[] dy = { 1, -1, 0, 0};
	static int[] dx = { 0, 0, 1, -1};
	static int N, M;
	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 
	 N = Integer.parseInt(st.nextToken());
	 M = Integer.parseInt(st.nextToken());
	 
	 dp = new int[N][M];
	 map = new int[N][M];
	 
	 
	 for(int i = 0; i < N; i++) {
		 st = new StringTokenizer(br.readLine());
		 for(int j = 0; j < M; j++) {
			 map[i][j] = Integer.parseInt(st.nextToken());
			 dp[i][j] = map[i][j] != 0 ? -1 : -2;
			 if(map[i][j] == 2) {
				 target = new Point(j, i, 0);
				 dp[i][j] = 0;
			 }
		 }
	 }
	 
	 for(int i = 0; i < N; i++) {
		 for(int j = 0; j < M; j++) {
			if(map[i][j] == 2) {
				bfs(target);
			}
		 }
	 }
	 
	 for(int i = 0; i < N; i++) {
		 for(int j = 0; j < M; j++) {
			 if(dp[i][j] == -2) dp[i][j] = 0;
			 System.out.print(dp[i][j] + " ");
		 }
		 System.out.println();
	 }
	  
}
	
	static class Point {
		int x;
		int y;
		int distance;
		Point(int x, int y, int distance) {
			this.x = x;
			this.y = y;
			this.distance = distance;
		}
	}
	
	static void bfs(Point dot) {
		
		Queue<Point> que = new LinkedList<>();
		que.add(dot);
		dp[dot.y][dot.x] = dot.distance;
		
		while(que.size() > 0) {
			
			Point cur = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int ny = cur.y + dy[i];
				int nx = cur.x + dx[i];
				int depth = cur.distance;
				
				if(nx < 0 || ny < 0 || ny >= N || nx >= M) continue;
				if(map[ny][nx] == 0) continue;
				if(dp[ny][nx] == -1 ) {
					dp[ny][nx] = depth + 1;
					que.add(new Point(nx, ny, depth + 1));
					// 실수 : <주의> 파라미터 넣는 순서 ny, nx 실수로 바꿔서 넣음
				}
			}
		}
		
		
	}
}

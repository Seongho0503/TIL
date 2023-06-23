
import java.io.*;
import java.util.*;

public class Main {
	public static class Point {
		int x;
		int y;
		Point(int dx, int dy) {
			this.x = dx;
			this.y = dy;
		}
	}
	static int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0, -1}};
	static boolean[][] visit;
	static int[][] map;
	static int min = Integer.MAX_VALUE;
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visit = new boolean[N][M];
		map = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		bfs(0, 0);
		System.out.println(map[N-1][M-1]);
	}
	
	public static void bfs(int x, int y) {
		
		Queue <Point> q = new LinkedList<>();
		visit[x][y] = true;
		q.add(new Point(x,y));
		
		while(q.size() > 0) {
			
			Point p = q.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = p.x + dirs[i][0];
				int ny = p.y + dirs[i][1];
				
				if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
				if(visit[nx][ny] || map[nx][ny] == 0) continue;
				else {
					visit[nx][ny] = true;
					q.add(new Point(nx, ny));
					map[nx][ny] = map[p.x][p.y] + 1;
				}
			}
			
		}//while 문
	}
}
/*
(1.1) 시작
(N, M) 위치로 이동할 때까지 최소 이동  칸 수
시작 위치, 도착 위치도 포함

*/
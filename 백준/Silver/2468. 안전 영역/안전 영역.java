//package BOJ_실1_2468_안전영역;

import java.io.*;
import java.util.*;

public class Main {
	static int[][] map;
	static boolean[][] visit;
	static int[][] di = { {-1, 0}, {0, -1}, {1, 0}, {0, 1}};
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		
		map = new int[n][n];
		
		int max = 0;
		int answer = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
			    
				 int num = Integer.parseInt(st.nextToken());
				 max = Math.max(max, num);
				 map[i][j] = num;
			}
		}
	for(int k = 0; k < max; k++) {
		visit = new boolean[n][n];
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visit[i][j] && map[i][j] > k) {
					visit[i][j] = true;
					count++;
					bfs(i,j,k);
				}
			}
		}
		answer = Math.max(answer, count);
	}
		System.out.print(answer);
}
	
	static void bfs(int x, int y, int height) {
		
		Queue<Integer> que = new LinkedList<>();
		
		que.add(x);
		que.add(y);
	
		
		while(que.size() > 0){
			
			int dx = que.poll();
			int dy = que.poll();
			
			for(int i = 0; i < 4; i++) {
				int nx = dx + di[i][0];
				int ny = dy + di[i][1];
				
				if(nx < 0 || ny < 0 || nx >= n || ny >= n ) continue;
				else if(map[nx][ny] > height && !visit[nx][ny] ){
					visit[nx][ny] = true;
					que.add(nx);
					que.add(ny);
				}
			}
		}
		
	}
}

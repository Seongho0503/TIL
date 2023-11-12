//package BOJ_1937_골3_욕심쟁이판다;

import java.io.*;
import java.util.*;

public class Main {
	
	static int N;
	static int[][] dp;
	static int[][] map;
	static int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		map = new int[N+1][N+1];
		dp = new int[N+1][N+1];
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				max = Math.max(max, dfs(i,j));
			}
		}
		
		System.out.println(max);
	}
	
	static int dfs(int x, int y) {
		if(dp[x][y] != 0) return dp[x][y];
		
		
		dp[x][y] = 1;
		for(int i = 0; i < 4; i++) {
			int nx = x + dirs[i][0];
			int ny = y + dirs[i][1];
			
			if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
			if(map[nx][ny] > map[x][y]) {
				dp[x][y] = Math.max(dfs(nx,ny) + 1, dp[x][y]);

				//dp[nx][ny] = Math.max(dfs(nx,ny), dp[x][y] + 1);
				
			}
			
		}
		
		return dp[x][y];
	}
}

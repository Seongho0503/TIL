//package BOJ_10819_차이를최대로;

import java.io.*;
import java.util.*;

public class Main {
	static boolean[] visited;
	static int[] num;
	static int max = Integer.MIN_VALUE;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		num = new int[N];
		visited = new boolean[N];
		int[] arr = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		dfs(0, arr);
		
		System.out.println(max);
	}
	
	static void dfs(int depth, int[] arr) {
		
		// 종료 시점
		if(depth == N) {
			int sum = 0;
			for(int i = 0; i < N-1; i++) {
				sum += Math.abs(num[i]-num[i+1]);
			}
			max = Math.max(sum, max);
		}
		
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				num[depth] = arr[i];
				dfs(depth+1, arr);
				visited[i] = false;
			}
		}
	}
}

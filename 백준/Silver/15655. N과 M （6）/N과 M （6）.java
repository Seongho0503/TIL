//package BOJ_15655_실3_N과M6;

import java.io.*;
import java.util.*;


public class Main {
	
	static int N, M;
	static int[] num;
	static boolean[] visit;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		num = new int[N];
		visit = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(num);
		
		dfs(0, 0);
	}
	
	static void dfs(int depth, int start) {
		
		if(depth == M) {
			StringBuilder sb = new StringBuilder();
			for(int n : arr) {
				sb.append(n +" "); // 시간 초과 구간!
			}
			System.out.println(sb);
			return;
		}
		
		for(int i = start; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = num[i];  
				dfs(depth+1, i+1);
				visit[i] = false;
			}
		}
	}

}

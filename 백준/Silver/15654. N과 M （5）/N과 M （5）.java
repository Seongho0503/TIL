//package BOJ_15654_실3_N과M5_순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int N, M;
	static int[] num;
	static boolean[] visit;
	static int[] output;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		output = new int[M];
		num = new int[N];
		visit = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
			num[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(num); // 정렬 => 사전 순 뽑기 가능
		
		dfs(0);
		
	}
	
	static void dfs(int depth) {
		
		// base case
		if(depth == M) {
			StringBuilder sb = new StringBuilder();
			for(int n : output) {
				sb.append(n +" ");
			}
			System.out.println(sb);
			return;
		}
		
		// recursive case
		for(int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				output[depth] = num[i];  
				dfs(depth+1);
				visit[i] = false;
			}
		}
	}

}

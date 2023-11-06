//package BOJ_14267_골5_회사문화1;

import java.io.*;
import java.util.*;

public class Main {
	static int[] parrent;
	static ArrayList<Integer>[] tree;
	static int[] dp;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		parrent = new int[N+1];
		tree = new ArrayList[N+1];
		dp = new int[N+1];
		
		for(int i = 0; i <= N; i++)
			tree[i] = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			parrent[i] = Integer.parseInt(st.nextToken());
			
			if(parrent[i] != -1) {
				tree[parrent[i]].add(i);
			}
		}
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int person = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			
			dp[person] += value;
		}
		
		//System.out.println(Arrays.toString(dp)); 디버깅
		
		for(int i = 1; i <= N; i++) {
			if(parrent[i] == 1) {
				dfs(i, dp[i]);
			}
		}
		
	
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			sb.append(dp[i] + " ");
		}
		System.out.println(sb);
	}
	
	static void dfs(int person, int value) {
		
		for(int next : tree[person]) {
			dp[next] += dp[person];
			dfs(next, value);
		}
	}
}

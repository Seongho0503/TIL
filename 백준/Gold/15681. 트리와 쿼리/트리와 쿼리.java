//package BOJ_15681_골5_트리와쿼리;

import java.io.*;
import java.util.*;

public class Main {
	
	static StringTokenizer st;
	static ArrayList<Integer>[] list;
	static int[] parrent;
	static int[] count;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int root = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		parrent = new int[N+1];
		count = new int[N+1];
		
		parrent[root] = root;
		
		for(int i = 0; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		
		
		dfs(root);
		
		StringBuilder sb = new StringBuilder();
		//for(int tc = 0; tc < T; tc++) {
		while(T-- > 0) {
			int t_number = Integer.parseInt(br.readLine()); 
			sb.append(count[t_number]).append("\n");
		}
		
		System.out.println(sb);
		//System.out.println(Arrays.toString(count)); 디버깅
	}
	
	static int dfs(int now) {
		
		if(count[now] != 0) return count[now];
		int cnt = 1;
		for(int next : list[now]) {
			if(parrent[next] == 0) {
				parrent[next] = now;
				cnt += dfs(next);
			}
		}
		count[now] = cnt;
		return count[now];
		//return count[now] = result;
	}
}

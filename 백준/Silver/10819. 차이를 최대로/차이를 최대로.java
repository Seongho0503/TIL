//package BOJ_10819_차이를최대로;

import java.util.*;
import java.io.*;

public class Main {
	
	static int[] arr;
	static int[] ans;
	static int n;
	static int result;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[n];
		ans = new int[n];
		visit = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		System.out.println(result);	
	}
	
	public static void dfs(int cnt) {
			
		if(cnt == n) {
			int sum = 0;
			for(int i = 0; i < n-1; i++) {
				sum += Math.abs(ans[i] - ans[i+1]);
			}
			result = Math.max(result, sum);
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visit[i]) {
				ans[cnt] = arr[i];
				visit[i] = true;
				dfs(cnt + 1);
				visit[i] = false;
			}
		}
	}

}

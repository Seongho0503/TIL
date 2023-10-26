//package BOJ_실3_14501_퇴사;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] t = new int[15+n];
		int[] p = new int[15+n];
		int[] dp = new int[15+n];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		for(int i = 0; i <= n; i++) {
			dp[i] = Math.max(dp[i], max); // 이전 값 갱신
			dp[i + t[i]] = Math.max(dp[i + t[i]], dp[i] + p[i]); // 해당 날 최대 값
			
			max = Math.max(dp[i], max); // max 갱신
		}
		
		//System.out.println(Arrays.toString(dp));
		System.out.println(max);
	}

}

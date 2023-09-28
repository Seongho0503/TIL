//package BOJ_2527_실3_계단오르기;

import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[n+1];
		dp[1] = arr[1];
		
		if(n >= 2) {
			dp[2] = dp[1] + arr[2];
			//dp[2] = Math.max(dp[1] + arr[2], dp[1]);
		}
		
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i];
			//dp[i] = Math.max(dp[i-2] + arr[i], dp[i-3] + arr[i-1] + arr[i]);
		}
		
//		for(int c : dp) {
//			System.out.print(c + " ");
//		}
		System.out.println(dp[n]);
	}
}

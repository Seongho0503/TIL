//package BOJ_2579_실3_계단오르기;

import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N+1];
		
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] dp = new int[N+1];
		
		dp[1] = arr[1];
		// dp[2] = arr[2] + dp[1]; Arrays.outOfRange
		if(N >= 2) {
			dp[2] = arr[2] + dp[1];
		}
		
		for(int i = 3; i <= N; i++) {
			dp[i] = Math.max(dp[i-3] + arr[i-1] , dp[i-2]) + arr[i];
		}
		
		//System.out.println(Arrays.toString(dp)); 디버깅
		System.out.println(dp[N]);
	}

}

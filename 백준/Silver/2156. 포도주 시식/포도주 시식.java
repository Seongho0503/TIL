//package BOJ_2156_실1_포도주시식;

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
				
				if(N > 1) {
					dp[2] = dp[1] + arr[2];
				}
				
				for(int i = 3; i <= N; i++) {
					dp[i] = Math.max(dp[i-3] + arr[i-1], dp[i-2]) + arr[i];
					dp[i] = Math.max(dp[i-1], dp[i]);
					//max = Math.max(dp[i-1], dp[i]);
				}
				
				System.out.println(dp[N]);
			}

	}



//package BOJ_실1_9465_스티커;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < tc; t++) {
			
			int n = Integer.parseInt(br.readLine());
			
			int[][] stickers = new int[2][n+1];
            int[][] dp = new int[2][n+1];
			
			for(int i=0; i<2; i++) {
				String[] str = br.readLine().split(" ");
				
				for(int k=1; k <=n; k++) {
					stickers[i][k] = Integer.parseInt(str[k-1]);
				}
			}
			
			dp[0][1] = stickers[0][1];
			dp[1][1] = stickers[1][1];
			
			for(int j=2; j<=n; j++) {
				dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2]) + stickers[0][j];
				dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2]) + stickers[1][j];
			}
			System.out.println(Math.max(dp[0][n], dp[1][n]));
		}
	}
}

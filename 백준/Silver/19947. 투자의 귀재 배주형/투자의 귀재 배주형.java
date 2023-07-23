import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cash = Integer.parseInt(st.nextToken());
		int year = Integer.parseInt(st.nextToken());
		
		int money = 0;
		long[] dp = new long[year+1];
		
		dp[0] = cash;
	for(int i = 1; i <= year; i++) {
			dp[i] = (long)Math.floor(dp[i-1] * 1.05);
			if(i >= 3)
				dp[i] = Math.max((long)Math.floor(dp[i-3] * 1.2), dp[i]);
			if(i >= 5)
				dp[i] = Math.max((long)Math.floor(dp[i-5] * 1.35), dp[i]);
		}
		System.out.println(dp[year]);
	}
}

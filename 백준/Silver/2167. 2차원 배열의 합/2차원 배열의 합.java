import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N+1][M+1];
		int[][] dp = new int[N+1][M+1];
		
		// DP 배열 할 때 인덱스 범위를 고려하여 +1씩 (인덱스 1부터 시작) : 0 비워둠 
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				
				// 각 행(i) 별로 합을 구한다.
				// dp : 현재 값 + 이전 값들의 합
				dp[i][j] = arr[i][j] + dp[i][j-1];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());  
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int sum = 0;
			
			// (중요) 행 i만 for문 돌고 j는 안 돌아도 된다 (dp에서 차를 구하면 된다) 
			for(int i = x1; i <= x2; i++) {
				sum += dp[i][y2] - dp[i][y1-1];
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}

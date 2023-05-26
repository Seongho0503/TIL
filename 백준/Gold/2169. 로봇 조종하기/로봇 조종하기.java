import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[][] map, dp, temp;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	    st = new StringTokenizer(br.readLine());
	    N = Integer.parseInt(st.nextToken()); // 가로
	    M = Integer.parseInt(st.nextToken()); // 세로
		
		map = new int[N][M];
		dp = new int[N][M];
		temp = new int[2][M]; // 2가지 경우 비교 , 열은 동일 (한 줄씩 비교)
		
		 for(int i = 0; i < N; i++) {
	            st = new StringTokenizer(br.readLine());
	            for(int j = 0; j < M; j++) {
	                map[i][j] = Integer.parseInt(st.nextToken());
	            }
	        }

		// 맨 왼쪽 위
		dp[0][0] = map[0][0];
		
		// 맨 위줄은 오른쪽으로만 이동 가능 = 이전 가치들의 합 + 현재 가치 
		for(int i = 1; i < M; i++) {
			dp[0][i] = dp[0][i-1] + map[0][i];
		}
		
		// 행(가로) 채우기
		for(int i = 1; i < N; i++) {
			
			// 열(세로) 채우기
			// 위에서 누적된 값 + 현재 가치
			temp[0][0] = dp[i-1][0] + map[i][0];
			// 왼쪽 * 위 max 값 임시 저장
			for(int j = 1; j < M ; j++) {
				temp[0][j] = Math.max(temp[0][j-1], dp[i-1][j]) + map[i][j];
				// temp[i-1][j]은 아직 dp 계산이 안 되었고(같은 라인) temp로 써야함
				// dp[i][j-1]은 이미 위에서 dp 계산이 완료 되었다.
			}
			
			
			// 위에서 누적된 값 + 현재 가치
			temp[1][M-1] = dp[i-1][M-1] + map[i][M-1];  
			for(int j = M-2; j >= 0; j--) {
				temp[1][j] = Math.max(temp[1][j+1], dp[i-1][j]) + map[i][j];
			}
			
			for(int k = 0; k < M; k++) {
				dp[i][k] = Math.max(temp[0][k], temp[1][k]);
			}
			
		}
		
		System.out.println(dp[N-1][M-1]);
			
	}
}
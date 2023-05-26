import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;

	        
	        int N = Integer.parseInt(br.readLine()); // 개수
	        
	        int[] arr = new int[N];
	        st = new StringTokenizer(br.readLine());
	        for(int i = 0; i < N; i++) {
	        	arr[i] = Integer.parseInt(st.nextToken());
	        }
	        
	        int [] dp = new int[N];
	       
	        
	        dp[0] = arr[0];
	        int max = arr[0];
	        for(int i = 1; i < N; i++) {
	        	
	        	dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
	        	max = Math.max(max, dp[i]);
	        	//if(dp[i] == arr[i]) max = Math.max(max, dp[i-1]);
	        	// 내가 실수한 부분 : 조건분 없어야 됨 (매 순간 최대값 확인)
	        	// 현재의 max 값 확인
	        }
	        
		System.out.println(max);
		
	}

}
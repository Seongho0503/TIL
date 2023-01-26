import java.io.* ;
import java.util.Scanner;


public class Main {
	
		    public static void main(String[] args) throws IOException {
		    		int N;
		    	    final int MOD = 10007;
		    	        Scanner sc = new Scanner(System.in);
		    	        N = sc.nextInt();

		    	        int r = 0;
		    	        // dp [자릿수][0~9까지 마지막으로 끝나는 수]
		    	        int[][] dp = new int[N+1][10];
		    	        dp[0][0] = 1;

		    	        // dp [자리수][0부터 시작해서 9까지 마지막으로 끝나는 수] = dp[N-1][col의 합]
		    	        for(int row=1; row<=N; ++row) {
		    	            for(int col=0; col<10; ++col) {
		    	            	// 시그마 코드를 루프로 구현
		    	                for(int prevCol=0; prevCol<10; ++prevCol)
		    	                	// 현재 컬럼이 이전 컬럼보다 작거나 같을 때
		    	                    if(prevCol <= col) {
		    	                        dp[row][col] += dp[row-1][prevCol];
		    	                    }

		    	                dp[row][col] %= MOD;
		    	            }
		    	        }
		    	        // N자리 수의 오르막 수 구하기
		    	        for(int idx=0; idx<10; ++idx) {
		    	            r += dp[N][idx];
		    	            r %= MOD;
		    	        }

		    	        System.out.println(r);
		    	    }
	}
import java.io.*;
import java.util.*;

public class Main {
	
	static long[] arr;
	static long N;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Long.parseLong(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new long[M];
		long max = 0;
		for(int i = 0; i < M; i++) {
			arr[i] = Long.parseLong(br.readLine());
			max = Math.max(arr[i], max);
		}
		
		long answer = search(max);
		
		System.out.print(answer);
	}
	
	public static long search(long right) {
		
		long start = 1;
		long end = right;
		
		// Lower_Bound
		while(start <= end) {
			
			long mid = (start + end ) /2;
			long count = 0;
			
			// 보석 개수 찾기
			for(long val : arr) {
				long cur = val;
				count += (cur / mid);
				
				// 모든 보석을 나눠주기 위해서
				if (cur % mid != 0) {
					count++;
				}
				
			}
			
			if(count <= N) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}	
		return start;
	}
}

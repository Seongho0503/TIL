import java.io.*;
import java.util.*;

public class Main {
	
	static int[] arr;
	static int N;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		int max = 0;
		for(int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Math.max(arr[i], max);
		}
		
		int answer = search(max);
		
		System.out.print(answer);
	}
	
	public static int search(int right) {
		
		int start = 1;
		int end = right;
		
		// Lower_Bound
		while(start <= end) {
			
			int mid = (start + end ) /2;
			int count = 0;
			
			// 보석 개수 찾기
			for(int val : arr) {
				int cur = val;
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

import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static long big;
	static long[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		arr = new long[N]; 
		
		big = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			big = Math.max(big, arr[i]);
		}
		
		long answer = UpBound(K);
		System.out.print(answer-1);
	}
	
	public static long UpBound(int k) {
		
		long min = 1; // 자연수
		long max = big+1; 
		
		while(min < max) {
			long count = 0;
			long mid = (min + max) /2;
			for(int i = 0; i < N; i++) {
			   count +=	(arr[i] / mid); 
			}
			if(count < k) {
				max = mid;
			}else {
				min = mid + 1;
			}	
		}
		return min;
	}
}

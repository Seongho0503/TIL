import java.io.*;
import java.util.*;

public class Main {
	
	static int[] arr;
	static int M;
	static int max;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		max = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(arr[i], max);
		}
		
		int answer = Search(max) - 1;
		
		System.out.print(answer);
	}
	
	public static int Search(int right) {
		
		// 과자의 길이가 1보다 큼
		int start = 1;
		int end = right;
		
		while(start <= end) {
			
			int mid = (start + end) / 2;
			int count = 0;
			for(int val : arr) {
				// by zero 에러 mid 0되면 안 됨
				count += (val / mid);
			}		
			if(count < M) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}	
		}
		return start;
	}
}

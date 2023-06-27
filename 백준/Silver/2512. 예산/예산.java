
import java.io.*;
import java.util.*;

public class Main {
	
	static long max = Integer.MIN_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long sum = 0;

		int N = Integer.parseInt(br.readLine());
		
		long[] arr = new long[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			max = Math.max(max, arr[i]);
		}
		long money = Integer.parseInt(br.readLine());
		
		if(sum <= money) {
			System.out.println(max);
		}else {
			System.out.println(search(arr, money) -1);
		}	
	}
	
	// upBound : 최대값 찾기
public static long search(long[] arr, long key) {
		
		long start = 0;
		long end = max;
		
		while(start <= end) {
			
			long mid = (start + end) /2;
			long sub_sum = 0;
			
			for(long val : arr) {
				if(val < mid) {
					sub_sum += val;
				}else {
					sub_sum += mid;
				}
			}
			// 돈 부족 => 돈 늘려야함 => 최대 값 낮추기
			if(sub_sum <= key) {
				start = mid + 1;
			}else {
				end = mid - 1;	
			}
		}
		return start;
	}
}

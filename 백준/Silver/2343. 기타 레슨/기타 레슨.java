
import java.io.*;
import java.util.*;

public class Main {
	static int[] arr;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		
		int max = 0;
		int sub_sum = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
			sub_sum += arr[i];
		}
		
		System.out.print(search(max, sub_sum));
	}
	
	public static int search(int left, int right) {
		
		int start = left;
		int end = right;
		
		while(start <= end) {
			
			// 블루레이 크기
			int mid = (start + end ) / 2;
			
			int count = 1;
			long sum = 0;
			
			
			for(int val : arr) {
				if(sum + val > mid) {
					count++;
					sum = 0;
				}
				sum += val;
			}
			
			// count <= M (X)
			if(count > M ) {
				start = mid + 1;	
			}else {
				end = mid - 1;
			}	
		}
		
		return start;
	}
}

/*
 * 강의 순서 바뀌면 안 된다 : 정렬 X 
 * 블루레이의 크기(녹화 가능한 길이)를 최소로 하려고 한다
 * M개의 블루레이는 모두 같은 크기이어야 한다.
 * 가능한 블루레이의 크기 중 최소를 구하는 프로그램을 작성하시오.
 */
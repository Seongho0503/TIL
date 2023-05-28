import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N+1];
		
		int start = 1;
		int end = 0;
		int sum = 0;
		int max = 0;
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			end++;
			sum += arr[i];
			if(i == K) max = sum;
			if(i > K) {
				sum -= arr[start];
				start++;
				max = Integer.max(max, sum);
			}
		}// for문 종료
		
		System.out.println(max);

	}

}

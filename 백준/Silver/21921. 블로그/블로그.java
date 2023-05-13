import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		int si = 0;
		int ei = 0;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(i < X) sum += arr[ei++];	
		}
		
		int max = sum;
		int cnt = 1;
		
		while(ei < arr.length) {
			sum -= arr[si++];
			sum += arr[ei++];
			if(max == sum) cnt++;
			else if(max < sum) {
				cnt = 1;
				max = sum;
			}
		}
		
		if(max > 0) {
			System.out.println(max);
			System.out.println(cnt);
		}else {
			System.out.println("SAD");
		}
				
	}
}
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());
		
		st =  new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = N-1;
		int sum = 0;
		int ans = 0;
		
		while(end > start ) {
			
			sum = arr[start] + arr[end];
			
			if(sum <= target) {
				start++;
				end--;
				ans++;
			}else {
				end--;
			}
		}	
		System.out.print(ans);
	}
}

import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int cnt = 0;
		for(int i = 0; i < N-1; i++) {
			for(int j =i+1; j < N; j++) {
				int sum = arr[i] + arr[j];
				//System.out.println(arr[i] + " " + arr[j] + "  " + sum);
				if(sum == M) cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}

import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int target = Integer.parseInt(br.readLine());
		
		
		int start = 0;
		int end = n-1;
		int ans = 0;
		
		while(end > start) {
			int sum = arr[start] + arr[end];
			if(sum == target) {
				ans++;
				start++;
				end--;
			}
			else if(sum > target) {
				end--;
			}else {	
				start++;
			}		
		}
		System.out.print(ans);	
	}
}

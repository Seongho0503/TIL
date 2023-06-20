
import java.io.*;
import java.util.*;

public class Main {
	
	static int[] origin;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		origin = new int[N]; 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			origin[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(origin);
		
		StringBuilder sb = new StringBuilder();
		int result = 0;
		int K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < K; i++) {
			int num = Integer.parseInt(st.nextToken());
			boolean isSearch = search(num);
			result = isSearch == true ? 1 : 0;
			sb.append(result).append('\n');
		}
		System.out.print(sb);
	}
	
	public static boolean search(int n) {
		
		int start = 0;
		int end = origin.length-1;
		
		while(start <= end) {
		
			int mid = (start + end)/2;
			
			if(origin[mid] == n) {
				return true;
			}else if (origin[mid] > n) {
				end = mid - 1;
			}else {
				start = mid + 1;
			}
		}
		return false;
		
	}
//	int start = origin[0];
//	int end = origin[origin.length-1];

}

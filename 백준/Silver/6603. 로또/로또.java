
import java.util.*;
import java.io.*;

public class Main {
	static int[] nums;
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	 while(true) {
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		if(N == 0) break;
		nums = new int[N];
		visit = new boolean[N];
		arr = new int[6];
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0, 0);
		sb.append('\n');
	  }
	 	System.out.println(sb);
	}
	
	public static void dfs(int cur, int depth) {
		
		if(depth == 6) {
			for(int val : arr) {
				sb.append(val + " ");
			}
			sb.append('\n');
			return;
		}
		
		if(depth >= N) return;
		
		for(int i = cur; i < nums.length; i++) {		
				arr[depth] = nums[i];
				dfs(i+1, depth+1);
			
		}
	}
}

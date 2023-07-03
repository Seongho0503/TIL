
import java.io.*;
import java.util.*;

public class Main {
	static int max;
	static int M, N;
	static int[] arr;
	static int cutLine;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		cutLine = String.valueOf(N).length();
		
		arr = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs("",0);
		System.out.print(max);
	}
	
	static void dfs(String cur, int depth) {
		
		if(depth == cutLine || depth == cutLine-1) {
			int num = Integer.parseInt(cur);
			if(num <= N) {
				max = Math.max(num, max);
			}
		}
		
		if(depth >= cutLine) return;
		
		for(int i = 0; i < M; i++) {
			int plus = arr[i];
			dfs(cur+plus, depth+1);
		}
	}
}

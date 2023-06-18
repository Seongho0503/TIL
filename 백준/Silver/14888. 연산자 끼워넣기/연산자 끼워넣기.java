
import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	static int[] arr;
	static int[] cal;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		cal = new int[4];
		for(int i = 0; i < 4; i++) {
			cal[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(1, arr[0]);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void dfs(int depth, int sum) {
		
		if(depth == N) {
			max = Math.max(sum, max);
			min = Math.min(sum, min);
			return;
		}
		
		// {덧셈(+)의 개수, 뺄셈(-)의 개수, 곱셈(×)의 개수, 나눗셈(÷)의 개수}
		for(int i = 0; i < 4; i++) {
			
			if(cal[i] > 0) {
				
				cal[i]--;
				switch(i) {
				case 0: dfs(depth+1, sum + arr[depth]); break;
				case 1: dfs(depth+1, sum - arr[depth]); break;
				case 2: dfs(depth+1, sum * arr[depth]); break;
				case 3: dfs(depth+1, sum / arr[depth]); break;
				}
				cal[i]++;	
			}
		}
	}
}

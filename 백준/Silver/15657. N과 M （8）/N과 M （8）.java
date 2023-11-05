//package BOJ_15657_실3_N과M8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int n, m;
	static int[] number;
	static int[] output;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		number = new int[n];
		output = new int[m];
		
		for (int i=0; i<n; i++) {
			number[i] = sc.nextInt();
		}
		
		Arrays.sort(number);
		
		dfs(0, 0);
		System.out.println(sb);
	}

	private static void dfs(int depth, int start) {
		
		if (depth == m) {
			for (int num : output) {
				sb.append(num + " ");
			}
			sb.append("\n");
		} else {
			
			for (int i=start; i<n; i++) {
				output[depth] = number[i];
				dfs(depth+1, i);
			}	
		}	
	}
}

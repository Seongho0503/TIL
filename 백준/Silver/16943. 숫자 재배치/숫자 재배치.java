//package BOJ_16943_실1_숫자재배치;

import java.io.*;
import java.util.*;

public class Main {
	
	static int a, b;
	static int len;
	static char[] arr;
	static boolean[] visit;
	static int max = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		// a의 자리 수 => string 변환
		String str = Integer.toString(a);
		len = str.length();
		
		arr = new char[len];
		visit = new boolean[len];
		
		char[] charArr = str.toCharArray();
		
		for(int i = 0; i < len; i++) {
			arr[i] = charArr[i];
		}

		dfs(0, "");
		
		if(max == Integer.MIN_VALUE) max = -1;
		System.out.println(max);
	}
	
	static void dfs(int depth, String num) {
		
		if(depth == len) {
			
			int sum = Integer.parseInt(num);
			if(sum < b) {
				max = Math.max(max, sum);
			}
			return;
		}
			
		for(int i = 0; i < len; i++) {
			if(!visit[i]) {
				if(num.equals("") && arr[i] == '0') continue;
				visit[i] = true;
				dfs(depth+1, num + arr[i]);
				visit[i] = false;
			}
		}	
	}
}

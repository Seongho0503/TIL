//package BOJ_19949_영재의시험_실2;

import java.io.*;
import java.util.*;

public class Main {
	static int[] test = new int[10];
	static int count;
	static int[] ans = new int[10]; 
	static int[] select = {1,2,3,4,5};
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 10; i++) {
			ans[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		
		System.out.print(count);
	}
	
	public static void dfs(int depth) {
		
		if(depth == 10) {
			
			int cnt = 0;
			for(int i = 0; i < 10; i++) {
				if(ans[i] == test[i]) cnt++;
			}
			if(cnt >= 5) count++;
			return;
		}
		
		for(int j = 0; j < 5; j++) {
			if(depth >= 2) {
				if(test[depth-1] == j+1 && test[depth-2] == j+1) continue;
			}
			test[depth] = select[j]; 
			dfs(depth + 1);
		}
	}
}

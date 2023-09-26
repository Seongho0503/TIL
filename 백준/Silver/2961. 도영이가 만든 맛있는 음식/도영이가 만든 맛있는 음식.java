//package BOJ_2961_실2_도영이가만든맛있는음식;

import java.io.*;
import java.util.*;

public class Main {
	
	static int n;
	static int[][] arr;
	static boolean[] visit;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		visit = new boolean[n];
		arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0);
		
		System.out.print(min);
	}
	
	static void dfs(int depth) {
	   if(depth > n) return;
	   if(depth > 0) {
		   
		   int sin = 0;
		   int ssn = 0;
		for(int j = 0; j < n; j++) {
			if(visit[j]) {
				if(sin > 0) sin *= arr[j][0];
				else sin = 1 * arr[j][0];
				ssn += arr[j][1];
				//System.out.println(j +" j " + sin);
			}
		}
		//System.out.println(sin + "sin " + ssn + "ssn ");
		min = Math.min(min, Math.abs(sin-ssn));	
	   }
	   
		for(int i = 0; i < n; i++ ) {
			if(!visit[i]) {
				visit[i] = true;
				dfs(depth + 1);
				visit[i] = false;
			}
		}
		
	}
}

//package BOJ_실2_우체국1;

import java.io.*;
import java.util.*;

public class Main {
	
	static StringTokenizer st; 
	static int V, P;
	static long L, village[], post[], result[], answer[], minSum = Long.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		st = new StringTokenizer(br.readLine()); 
		V = Integer.parseInt(st.nextToken()); // 마을의 개수
		P = Integer.parseInt(st.nextToken()); // 지을 우체국 개수
		L = Long.parseLong(st.nextToken()); // 큰 길 둘레 길이
		
		village = new long[V];
		post = new long[P];
		result = new long[P];
		answer = new long[P];
		
		st = new StringTokenizer(br.readLine()); 
		for(int v=0; v<V; v++) {
			village[v] = Long.parseLong(st.nextToken());
		}
		
		dfs(0,0);
		
		System.out.println(minSum);
		for(long x : answer) {
			System.out.print(x+" ");
		}
			
	}// main 종료
	private static void dfs(int start, int cnt) {
		if(cnt == P) {
			getDist();
			return;
		}
		for(int i=start; i<V; i++) {
			result[cnt] = village[i];
			dfs(i+1, cnt+1);
		}
	}// dfs 종료
	private static void getDist() {
		long sumDist = 0;
		for(int v=0; v<V; v++) {
			long minDist = Long.MAX_VALUE;
			for(int p=0; p<P; p++) {
				long chai = Math.min(Math.abs(village[v] - result[p])
						, L - Math.abs(village[v] - result[p]));
				if(minDist > chai) {
					minDist = chai;
				}
			}
			sumDist += minDist;
		}
		
		if (sumDist < minSum) {
			minSum = sumDist;
			answer = result.clone();
		}
	}
}
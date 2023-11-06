//package BOJ_17073_골5_나무위의빗물;

// 리프 노드를 어떻게 찾아낼까?
// dfs로 찾는 것이 아니라 노드의 size() == 1 인 노드 찾기 (루트 노드 제외)

import java.io.*;
import java.util.*;

public class Main {
	
	static boolean[] visit;
	static ArrayList<Integer>[] list;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		list = new ArrayList[N+1];
		visit = new boolean[N+1];
		
		for(int i = 1; i <= N; i++) {
			list[i] = new ArrayList<>();
		}
				
		for(int i = 0; i < N-1; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);		
		}
		
		int leafCnt = 0;
		for(int i = 2; i <= N; i++) {
			if(list[i].size() == 1) {
				leafCnt++;
			}
		}
		System.out.println((double) W/leafCnt );
	}
}
